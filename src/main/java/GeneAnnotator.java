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


import java.util.HashSet;
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
 * This class uses Sentence as typesystem, identify words from each sentence, stored as typesystemGeneEntiy
 * (the second typesystem defined). And filtered by POSTagger as a pre-process.
 * @author youlovethis
 *
 */
public class GeneAnnotator extends JCasAnnotator_ImplBase {
	public static HashSet<String> hs_after_POS=new HashSet();

  /**
   * @see JCasAnnotator_ImplBase#process(JCas)
   */
  public void process(JCas aJCas) {
	  PosTagNamedEntityRecognizer nameentityrecognizer = null;
	  GeneEntityFilter myhashset=new GeneEntityFilter();
	try {
		nameentityrecognizer = new PosTagNamedEntityRecognizer();
	} catch (ResourceInitializationException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  JCas jcas=aJCas;
	  FSIterator it = jcas.getAnnotationIndex(Sentence.type).iterator();
	  
	  while(it.hasNext()){
		  Sentence sentence=(Sentence) it.next();
		  String tmpsentencecontext=sentence.getSentence_Context();
		  Map<Integer, Integer> tmpMap;
		  tmpMap=nameentityrecognizer.getGeneSpans(tmpsentencecontext); 
		  Iterator mapit=tmpMap.entrySet().iterator();
		  while(mapit.hasNext()){
			  Entry<Integer, Integer> entry = (Entry<Integer, Integer>) mapit.next();
			  String str=tmpsentencecontext.substring(entry.getKey(), entry.getValue());
			 
			  typesystemGeneEntity annotation = new typesystemGeneEntity(aJCas);
		/*	  if(myhashset.hs.contains(str)){
					 int currentconfidence=annotation.getConfidence();
					 currentconfidence++;
					 annotation.setConfidence(currentconfidence);
				 }
			//Corresponding to ontology_def.obo.txt
			  if(myhashset.hs_ontology.contains(str)){
					 int currentconfidence=annotation.getConfidence();
					 currentconfidence++;
					 annotation.setConfidence(currentconfidence);
				 }*/
			  annotation.setTheSentenceID(sentence.getSentence_ID());
			  annotation.setEntity(str);
			  annotation.setStart(entry.getKey());
			  annotation.setEnd(entry.getValue());
			  hs_after_POS.add(str);
			  annotation.addToIndexes();
			  
		  }
	  }
	  
 

  }

}
