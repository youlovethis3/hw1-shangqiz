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


import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.uima.analysis_component.JCasAnnotator_ImplBase;
import org.apache.uima.jcas.JCas;

import typesystem.Sentence;


/**
 * This is the first annotator used in AnalysisEngine.
 * Its function is to identify each sentence in the whole simple.in
 * and store it into the Sentence Typesystem.
 * Doing the pre-work for future analysis.
 * 
 * 
 * @author youlovethis
 *
 */
public class SentenceFetcherAnnotator extends JCasAnnotator_ImplBase {
  private Pattern Sentence = Pattern.compile("([^ ]*)[ ](.*)[\n]");

  /**
   * @see JCasAnnotator_ImplBase#process(JCas)
   */
  public void process(JCas aJCas) {

    // get document text
    String docText = aJCas.getDocumentText();
    // search for Yorktown room numbers
    Matcher matcher = Sentence.matcher(docText);
    while (matcher.find()) {
      // found one - create annotation
      Sentence annotation = new Sentence(aJCas);
      annotation.setBegin(matcher.start());
      annotation.setEnd(matcher.end());
      annotation.setSentence_ID(matcher.group(1));
      annotation.setSentence_Context(matcher.group(2));
      annotation.addToIndexes();
    }

  }

}
