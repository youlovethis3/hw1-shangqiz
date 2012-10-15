/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */


import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.uima.analysis_component.JCasAnnotator_ImplBase;
import org.apache.uima.cas.FSIterator;
import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.cas.StringArray;
import org.apache.uima.jcas.cas.StringList;
import org.apache.uima.resource.ResourceInitializationException;

import typesystem.Sentence;
import typesystem.typesystemGeneEntity;

/**
 * Example annotator that detects room numbers using Java 1.4 regular expressions.
 */
public class ConfidenceAnnotator extends JCasAnnotator_ImplBase {

  /**
   * @see JCasAnnotator_ImplBase#process(JCas)
   */
  public void process(JCas aJCas) {
	  JCas jcas=aJCas;
	  Iterator itt = jcas.getAnnotationIndex(typesystemGeneEntity.type).iterator();
	  GeneEntityFilter myhashset=new GeneEntityFilter();
	  while(itt.hasNext()){
		  typesystemGeneEntity Entity=(typesystemGeneEntity) itt.next();
		  String str=Entity.getEntity();
			 //Corresponding to genenames.txt
			  if(myhashset.hs.contains(str)){
					 int currentconfidence=Entity.getConfidence();
					 currentconfidence++;
					 Entity.setConfidence(currentconfidence);
				 }
			//Corresponding to ontology_def.obo.txt
			  if(myhashset.hs_ontology.contains(str)){
					 int currentconfidence=Entity.getConfidence();
					 currentconfidence++;
					 Entity.setConfidence(currentconfidence);
				 }
			  Entity.addToIndexes();
			  
		  }
	  }
	  
 

  }


