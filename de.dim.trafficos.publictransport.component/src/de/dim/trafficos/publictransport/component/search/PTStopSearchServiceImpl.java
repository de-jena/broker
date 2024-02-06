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
package de.dim.trafficos.publictransport.component.search;

import java.util.List;

import org.apache.lucene.index.Term;
import org.apache.lucene.search.BooleanClause.Occur;
import org.apache.lucene.search.BooleanQuery;
import org.apache.lucene.search.IndexSearcher;
import org.apache.lucene.search.Query;
import org.apache.lucene.search.TermQuery;
import org.apache.lucene.search.WildcardQuery;
import org.gecko.emf.repository.query.QueryRepository;
import org.osgi.service.component.ComponentServiceObjects;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import de.dim.trafficos.publictransport.apis.search.PTStopSearchService;
import de.dim.trafficos.publictransport.component.index.helper.PTStopIndexHelper;
import de.dim.trafficos.publictransport.component.search.helper.PTSearchHelper;
import de.jena.udp.model.trafficos.publictransport.PTStop;
import de.jena.udp.model.trafficos.publictransport.TOSPublicTransportPackage;

/**
 * 
 * @author ilenia
 * @since Jul 7, 2023
 */
@Component(name = "PTStopSearchService", service = PTStopSearchService.class)
public class PTStopSearchServiceImpl implements PTStopSearchService {
	
	@Reference(target = "(id=ptstop)")
	private ComponentServiceObjects<IndexSearcher> searcherSO;
	
	@Reference(target = "(|(repo_id=trafficos.trafficos)(repo_id=sensinact.sensinact))")
	QueryRepository repo;
	
	@Reference
	TOSPublicTransportPackage publicTransportPackage;
	
	
	/* 
	 * (non-Javadoc)
	 * @see de.dim.trafficos.publictransport.apis.search.PTStopSearchService#searchStopByStopId(java.lang.String[])
	 */
	@Override
	public List<PTStop> searchStopByStopId(String... stopIds) {
		BooleanQuery.Builder builder = new BooleanQuery.Builder();
		for(String stopId : stopIds) {
			builder.add(new TermQuery(new Term(PTStopIndexHelper.PT_STOP_ID, stopId)), Occur.SHOULD);
		}
		Query q = builder.build();
		IndexSearcher searcher = searcherSO.getService();	
		try {
			return PTSearchHelper.executeQuery(q, publicTransportPackage.getPTStop(), searcher, repo);
		} finally {
			searcherSO.ungetService(searcher);
		}	
	}

	/* 
	 * (non-Javadoc)
	 * @see de.dim.trafficos.apis.publictransport.search.PTStopSearchService#searchStopByDHID(java.lang.String[])
	 */
	@Override
	public List<PTStop> searchStopByDHID(String... dhids) {
		BooleanQuery.Builder builder = new BooleanQuery.Builder();
		for(String dhid : dhids) {
			builder.add(new TermQuery(new Term(PTStopIndexHelper.PT_STOP_DHID, dhid)), Occur.SHOULD);
		}
		Query q = builder.build();
		IndexSearcher searcher = searcherSO.getService();	
		try {
			return PTSearchHelper.executeQuery(q, publicTransportPackage.getPTStop(), searcher, repo);
		} finally {
			searcherSO.ungetService(searcher);
		}		
	}

	/* 
	 * (non-Javadoc)
	 * @see de.dim.trafficos.apis.publictransport.search.PTStopSearchService#searchStopsByNames(java.lang.String[])
	 */
	@Override
	public List<PTStop> searchStopByName(String... names) {
		BooleanQuery.Builder builder = new BooleanQuery.Builder();
		for(String name : names) {
			builder.add(new WildcardQuery(new Term(PTStopIndexHelper.PT_STOP_NAME, "*"+name+"*")), Occur.SHOULD);
		}
		Query q = builder.build();
		IndexSearcher searcher = searcherSO.getService();	
		try {
			List<PTStop> stops =  PTSearchHelper.executeQuery(q, publicTransportPackage.getPTStop(), searcher, repo);
			return stops;
		} finally {
			searcherSO.ungetService(searcher);
		}	
	}

	

}
