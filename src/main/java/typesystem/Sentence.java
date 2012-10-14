

/* First created by JCasGen Sun Oct 14 05:23:43 CST 2012 */
package typesystem;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.StringList;
import org.apache.uima.jcas.tcas.Annotation;


import org.apache.uima.jcas.cas.StringArray;


/** 
 * Updated by JCasGen Mon Oct 15 05:24:47 CST 2012
 * XML source: E:/workspaceCMUZSQ/hw1-shangqiz/src/main/resources/descripter/AnalysisEngineDescriptor.xml
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
   
    
  //*--------------*
  //* Feature: GeneArray

  /** getter for GeneArray - gets 
   * @generated */
  public StringArray getGeneArray() {
    if (Sentence_Type.featOkTst && ((Sentence_Type)jcasType).casFeat_GeneArray == null)
      jcasType.jcas.throwFeatMissing("GeneArray", "typesystem.Sentence");
    return (StringArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Sentence_Type)jcasType).casFeatCode_GeneArray)));}
    
  /** setter for GeneArray - sets  
   * @generated */
  public void setGeneArray(StringArray v) {
    if (Sentence_Type.featOkTst && ((Sentence_Type)jcasType).casFeat_GeneArray == null)
      jcasType.jcas.throwFeatMissing("GeneArray", "typesystem.Sentence");
    jcasType.ll_cas.ll_setRefValue(addr, ((Sentence_Type)jcasType).casFeatCode_GeneArray, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for GeneArray - gets an indexed value - 
   * @generated */
  public String getGeneArray(int i) {
    if (Sentence_Type.featOkTst && ((Sentence_Type)jcasType).casFeat_GeneArray == null)
      jcasType.jcas.throwFeatMissing("GeneArray", "typesystem.Sentence");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Sentence_Type)jcasType).casFeatCode_GeneArray), i);
    return jcasType.ll_cas.ll_getStringArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Sentence_Type)jcasType).casFeatCode_GeneArray), i);}

  /** indexed setter for GeneArray - sets an indexed value - 
   * @generated */
  public void setGeneArray(int i, String v) { 
    if (Sentence_Type.featOkTst && ((Sentence_Type)jcasType).casFeat_GeneArray == null)
      jcasType.jcas.throwFeatMissing("GeneArray", "typesystem.Sentence");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Sentence_Type)jcasType).casFeatCode_GeneArray), i);
    jcasType.ll_cas.ll_setStringArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Sentence_Type)jcasType).casFeatCode_GeneArray), i, v);}
   
    
  //*--------------*
  //* Feature: GeneList

  /** getter for GeneList - gets 
   * @generated */
  public StringList getGeneList() {
    if (Sentence_Type.featOkTst && ((Sentence_Type)jcasType).casFeat_GeneList == null)
      jcasType.jcas.throwFeatMissing("GeneList", "typesystem.Sentence");
    return (StringList)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Sentence_Type)jcasType).casFeatCode_GeneList)));}
    
  /** setter for GeneList - sets  
   * @generated */
  public void setGeneList(StringList v) {
    if (Sentence_Type.featOkTst && ((Sentence_Type)jcasType).casFeat_GeneList == null)
      jcasType.jcas.throwFeatMissing("GeneList", "typesystem.Sentence");
    jcasType.ll_cas.ll_setRefValue(addr, ((Sentence_Type)jcasType).casFeatCode_GeneList, jcasType.ll_cas.ll_getFSRef(v));}    
  }

    