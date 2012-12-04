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


import java.io.File;
import java.io.IOException;
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

import com.aliasi.chunk.Chunk;
import com.aliasi.chunk.ConfidenceChunker;
import com.aliasi.util.AbstractExternalizable;

import typesystem.Sentence;
import typesystem.typesystemGeneEntity;


/**
 * This class uses lingpipe as another method for data selection.
 * Fetch the words defined in typesystemGeneEntity, and giving each
 * word a feature: confidence_lingpipe from final consuming
 * 
 * 
 * @author youlovethis
 *
 */
public class LingPipeAnnotator extends JCasAnnotator_ImplBase {

  /**
   * @see JCasAnnotator_ImplBase#process(JCas)
   */
  public void process(JCas aJCas) {
	  
	  JCas jcas=aJCas;
	  Iterator itt = jcas.getAnnotationIndex(Sentence.type).iterator();
	  File modelfile=new File("data/ne-en-bio-genetag.HmmChunker");
	  ConfidenceChunker chunker = null;
	  try {
			chunker = (ConfidenceChunker) AbstractExternalizable.readObject(modelfile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  while(itt.hasNext()){
		  Sentence sentence=(Sentence) itt.next();
		  String str=sentence.getSentence_Context();
		    char[] cs = str.toCharArray();
		    Iterator<Chunk> it
		      = chunker.nBestChunks(cs,0,cs.length,10);
		    for (int n = 0; it.hasNext(); ++n) {
		        Chunk chunk = it.next();
		        double conf = Math.pow(2.0,chunk.score());
		        int start = chunk.start();
		        int end = chunk.end();
		        String phrase = str.substring(start,end);
		        if(!GeneAnnotator.hs_after_POS.contains(phrase)){
		        typesystemGeneEntity annotation = new typesystemGeneEntity(aJCas);
		        annotation.setTheSentenceID(sentence.getSentence_ID());
					  annotation.setEntity(phrase);
					  annotation.setStart(start);
					  annotation.setEnd(end);
					  annotation.setConfidence_lingpipe(conf);
					  annotation.addToIndexes();
		        }
		     }
		
	
			  
		  }
	  }
	  
 

  }


