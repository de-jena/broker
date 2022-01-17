/**
 * Copyright (c) 2012 - 2018 Data In Motion and others.
 * All rights reserved. 
 * 
 * This program and the accompanying materials are made available under the terms of the 
 * Eclipse Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Data In Motion - initial API and implementation
 */
package de.dim.smart.city.mqtt.impl;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.gecko.osgi.messaging.MessagingService;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ReferenceScope;

import de.dim.smart.city.mqtt.api.SenderTestService;
import de.dim.trafficos.model.device.TOSDevicePackage;

@Component
public class SenderTestImpl implements SenderTestService{

	@Reference(target = "(id=dim)")
	private MessagingService messaging;

	@Reference(target="(&(emf.model.name=device)(emf.resource.configurator.name=EMFJson))", scope = ReferenceScope.PROTOTYPE_REQUIRED)
	private ResourceSet resourceSet;
	
	private static final Logger logger = Logger.getLogger(SenderTestImpl.class.getName());

	/* 
	 * (non-Javadoc)
	 * @see de.dim.smart.city.mqtt.api.SenderTestService#sendEObject(org.eclipse.emf.ecore.EObject, java.lang.String)
	 */
	@Override
	public void sendEObject(EObject object, String topic) {
		
		EObject copy = EcoreUtil.copy(object);
		
		removeNonContainments(copy);
		
		Resource resource = resourceSet.createResource(URI.createURI("temp.json"));
		resource.getContents().add(copy);
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		Map<String, Object> saveOptions = new HashMap<String, Object>();
		saveOptions.put("OPTION_SERIALIZE_DEFAULT_VALUE", Boolean.TRUE);
		saveOptions.put("PROXY_ATTRIBUTES", Boolean.TRUE);
		try {
			resource.save(baos, saveOptions);
			resource.getContents().clear();
			
			byte[] content = baos.toByteArray();
//			logger.log(Level.SEVERE, "sending");
//			logger.log(Level.SEVERE, new String(content));
			
			
			ByteBuffer buffer = ByteBuffer.wrap(content);
			messaging.publish(topic, buffer);
			
			resource = resourceSet.createResource(URI.createURI("temp.json"));
			resource.load(new ByteArrayInputStream(content), null);
			if(!resource.getContents().isEmpty()) {
				resource.getContents().clear();
			} else {
			}

		} catch (Exception e) {
			logger.log(Level.SEVERE, "Error publishing position request via MQTT", e);
		}
		
	}

	/**
	 * @param copy
	 */
	private void removeNonContainments(EObject copy) {
//		logger.log(Level.SEVERE,"Removing from " + copy.eClass().getName());
		copy.eClass().getEAllReferences().stream()
			.filter(r -> !r.isContainment())
			.filter(r -> {
				return ((EClass) r.eContainer()).getEPackage() == TOSDevicePackage.eINSTANCE;
			})
			.forEach(copy::eUnset);
		
		copy.eClass().getEAllReferences().stream()
			.filter(r -> r.isContainment())
			.filter(r -> {
				return ((EClass) r.eContainer()).getEPackage() == TOSDevicePackage.eINSTANCE;
			})
			.filter(copy::eIsSet)
			.map(copy::eGet)
			.forEach( o -> {
				if(o instanceof Collection) {
					((Collection<EObject>)o).forEach(this::removeNonContainments);
				} else {
					removeNonContainments((EObject) o);
				}
			});
	}

}
