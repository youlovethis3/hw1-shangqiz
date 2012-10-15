

/* First created by JCasGen Sun Oct 14 05:23:43 CST 2012 */
package typesystem;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.StringList;
import org.apache.uima.jcas.tcas.Annotation;


import org.apache.uima.jcas.cas.StringArray;


/** 
 * Updated by JCasGen Tue Oct 16 02:19:35 CST 2012
 * XML source: E:/workspaceCMUZSQ/hw1-shangqiz/src/main/resources/descripter/aeDescriptor.xml
 * @generated */
public class Sentence extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Sentence.class);
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int type = typeIndexID;
  /** @generated  */
  @Override
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected Sentence() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public Sentence(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public Sentence(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public Sentence(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }   

  /** <!-- begin-user-doc -->
    * Write your own initialization here
    * <!-- end-user-doc -->
  @generated modifiable */
  private void readObject() {/*default - does nothing empty block */}
     
 
    
  //*--------------*
  //* Feature: Sentence_ID

  /** getter for Sentence_ID - gets 
   * @generated */
  public String getSentence_ID() {
    if (Sentence_Type.featOkTst && ((Sentence_Type)jcasType).casFeat_Sentence_ID == null)
      jcasType.jcas.throwFeatMissing("Sentence_ID", "typesystem.Sentence");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Sentence_Type)jcasType).casFeatCode_Sentence_ID);}
    
  /** setter for Sentence_ID - sets  
   * @generated */
  public void setSentence_ID(String v) {
    if (Sentence_Type.featOkTst && ((Sentence_Type)jcasType).casFeat_Sentence_ID == null)
      jcasType.jcas.throwFeatMissing("Sentence_ID", "typesystem.Sentence");
    jcasType.ll_cas.ll_setStringValue(addr, ((Sentence_Type)jcasType).casFeatCode_Sentence_ID, v);}    
   
    
  //*--------------*
  //* Feature: Sentence_Context

  /** getter for Sentence_Context - gets 
   * @generated */
  public String getSentence_Context() {
    if (Sentence_Type.featOkTst && ((Sentence_Type)jcasType).casFeat_Sentence_Context == null)
      jcasType.jcas.throwFeatMissing("Sentence_Context", "typesystem.Sentence");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Sentence_Type)jcasType).casFeatCode_Sentence_Context);}
    
  /** setter for Sentence_Context - sets  
   * @generated */
  public void setSentence_Context(String v) {
    if (Sentence_Type.featOkTst && ((Sentence_Type)jcasType).casFeat_Sentence_Context == null)
      jcasType.jcas.throwFeatMissing("Sentence_Context", "typesystem.Sentence");
    jcasType.ll_cas.ll_setStringValue(addr, ((Sentence_Type)jcasType).casFeatCode_Sentence_Context, v);}    
  }

    