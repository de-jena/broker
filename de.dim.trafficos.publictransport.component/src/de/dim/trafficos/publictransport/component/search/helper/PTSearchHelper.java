/**
 * Copyright (c) 2012 - 2023 Data In Motion and others.
 * All rights reserved. 
 * 
 * This program and the accompanying materials are made available under the terms of the 
 * Eclipse Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Data In Motion - initial API and implementation
 */
package de.dim.trafficos.publictransport.component.search.helper;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.apache.lucene.document.Document;
import org.apache.lucene.index.IndexReader;
import org.apache.lucene.search.IndexSearcher;
import org.apache.lucene.search.Query;
import org.apache.lucene.search.Sort;
import org.apache.lucene.search.TopDocs;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.gecko.emf.repository.EMFRepository;
import org.gecko.emf.repository.query.IQuery;
import org.gecko.emf.repository.query.QueryRepository;

import de.jena.udp.model.trafficos.common.TOSCommonPackage;

/**
 * 
 * @author ilenia
 * @since Jul 7, 2023
 */
public class PTSearchHelper {
	
	@SuppressWarnings("unchecked")
	public static <T extends EObject> List<T> executeQuery(Query query, EClass eClass, IndexSearcher searcher, EMFRepository repo) {
		try {
			TopDocs topDocs = searcher.search(query, Integer.MAX_VALUE);
			if (topDocs.scoreDocs.length == 0) {
				return Collections.emptyList();
			}
			IndexReader indexReader = searcher.getIndexReader();
			Collection<Object> ids = Arrays.asList(topDocs.scoreDocs).stream().map(sd -> sd.doc).map(id -> {
				Document d;
				try {
					d = indexReader.storedFields().document(id);
					return d;
				} catch (IOException e) {
					return null;
				}
			}).filter(d -> d != null).map(d -> {
				String id = d.get("id");
				return (Object) id;
			}).toList();
			QueryRepository queryRepo = (QueryRepository) repo;
			IQuery q = queryRepo.createQueryBuilder().in(ids).column(TOSCommonPackage.eINSTANCE.getIdElement_Id()).build();	
			return (List<T>) queryRepo.getEObjectsByQuery(eClass, q);
		} catch (Exception e) {
			System.err.println("Exception while search for query " + query.toString());
			e.printStackTrace();
			return Collections.emptyList();
		}
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends EObject> List<T> executeQuery(Query query, Sort sort, int maxNumResults, EClass eClass, IndexSearcher searcher, EMFRepository repo) {

		try {
			TopDocs topDocs = searcher.search(query, maxNumResults, sort);
			if (topDocs.scoreDocs.length == 0) {
				return Collections.emptyList();
			}
			IndexReader indexReader = searcher.getIndexReader();
			Collection<Object> ids = Arrays.asList(topDocs.scoreDocs).stream().map(sd -> sd.doc).map(id -> {
				Document d;
				try {
					d = indexReader.storedFields().document(id);
					return d;
				} catch (IOException e) {
					return null;
				}
			}).filter(d -> d != null).map(d -> {
				String id = d.get("id");
				return (Object) id;
			}).toList();
			QueryRepository queryRepo = (QueryRepository) repo;
			IQuery q = queryRepo.createQueryBuilder().in(ids).column(TOSCommonPackage.eINSTANCE.getIdElement_Id()).build();	
			return (List<T>) queryRepo.getEObjectsByQuery(eClass, q);
		} catch (Exception e) {
			System.err.println("Exception while search for query " + query.toString());
			e.printStackTrace();
			return Collections.emptyList();
		}
	}
}
