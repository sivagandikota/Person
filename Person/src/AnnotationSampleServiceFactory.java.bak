/*******************************************************************************
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements. See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership. The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 ******************************************************************************/


import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.apache.olingo.odata2.annotation.processor.api.AnnotationServiceFactory;
import org.apache.olingo.odata2.api.ODataService;
import org.apache.olingo.odata2.api.ODataServiceFactory;
import org.apache.olingo.odata2.api.exception.ODataApplicationException;
import org.apache.olingo.odata2.api.exception.ODataException;
import org.apache.olingo.odata2.api.processor.ODataContext;


import org.apache.olingo.odata2.jpa.processor.api.ODataJPAContext;
import org.apache.olingo.odata2.jpa.processor.api.ODataJPAServiceFactory;
import org.apache.olingo.odata2.jpa.processor.api.exception.ODataJPARuntimeException;

public class AnnotationSampleServiceFactory extends ODataJPAServiceFactory  {

	private static final String PERSISTENCE_UNIT_NAME ="PERSONS";
	static String MODEL_PACKAGE = "model";
    static ODataService ANNOTATION_ODATA_SERVICE;


	  /*public ODataService createService(final ODataContext context) throws ODataException {
	      try {
	    	  	if(ANNOTATION_ODATA_SERVICE==null)
		        ANNOTATION_ODATA_SERVICE = AnnotationServiceFactory.createAnnotationService(MODEL_PACKAGE);
		      } catch (ODataApplicationException ex) {
		        throw new RuntimeException("Exception during sample data generation.", ex);
		      } catch (Exception ex) {
		        ex.printStackTrace();
		      }
	    return ANNOTATION_ODATA_SERVICE;
	  }*/
	  
	  
	  
	  
	  //@Override
	  public ODataJPAContext  initializeODataJPAContext()
	      throws ODataJPARuntimeException  {

	    ODataJPAContext oDatJPAContext = this.getODataJPAContext();

	    try {

	      EntityManagerFactory emf = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);

	      oDatJPAContext.setEntityManagerFactory(emf);

	      oDatJPAContext.setPersistenceUnitName(PERSISTENCE_UNIT_NAME);
	      oDatJPAContext.setPageSize(10);
	      
	      return oDatJPAContext;

	    } catch (Exception e) {
	    	e.printStackTrace();
	      throw new RuntimeException(e);
	    	

	    }

	  }
}
