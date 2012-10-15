

/* First created by JCasGen Sun Oct 14 11:28:36 CST 2012 */
package typesystem;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Mon Oct 15 22:53:39 CST 2012
 * XML source: E:/workspaceCMUZSQ/hw1-shangqiz/src/main/resources/descripter/aeDescriptor.xml
 * @generated */
public class typesystemGeneEntity extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(typesystemGeneEntity.class);
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
  protected typesystemGeneEntity() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public typesystemGeneEntity(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public typesystemGeneEntity(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public typesystemGeneEntity(JCas jcas, int begin, int end) {
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
  //* Feature: Entity

  /** getter for Entity - gets 
   * @generated */
  public String getEntity() {
    if (typesystemGeneEntity_Type.featOkTst && ((typesystemGeneEntity_Type)jcasType).casFeat_Entity == null)
      jcasType.jcas.throwFeatMissing("Entity", "typesystem.typesystemGeneEntity");
    return jcasType.ll_cas.ll_getStringValue(addr, ((typesystemGeneEntity_Type)jcasType).casFeatCode_Entity);}
    
  /** setter for Entity - sets  
   * @generated */
  public void setEntity(String v) {
    if (typesystemGeneEntity_Type.featOkTst && ((typesystemGeneEntity_Type)jcasType).casFeat_Entity == null)
      jcasType.jcas.throwFeatMissing("Entity", "typesystem.typesystemGeneEntity");
    jcasType.ll_cas.ll_setStringValue(addr, ((typesystemGeneEntity_Type)jcasType).casFeatCode_Entity, v);}    
   
    
  //*--------------*
  //* Feature: TheSentenceID

  /** getter for TheSentenceID - gets 
   * @generated */
  public String getTheSentenceID() {
    if (typesystemGeneEntity_Type.featOkTst && ((typesystemGeneEntity_Type)jcasType).casFeat_TheSentenceID == null)
      jcasType.jcas.throwFeatMissing("TheSentenceID", "typesystem.typesystemGeneEntity");
    return jcasType.ll_cas.ll_getStringValue(addr, ((typesystemGeneEntity_Type)jcasType).casFeatCode_TheSentenceID);}
    
  /** setter for TheSentenceID - sets  
   * @generated */
  public void setTheSentenceID(String v) {
    if (typesystemGeneEntity_Type.featOkTst && ((typesystemGeneEntity_Type)jcasType).casFeat_TheSentenceID == null)
      jcasType.jcas.throwFeatMissing("TheSentenceID", "typesystem.typesystemGeneEntity");
    jcasType.ll_cas.ll_setStringValue(addr, ((typesystemGeneEntity_Type)jcasType).casFeatCode_TheSentenceID, v);}    
   
    
  //*--------------*
  //* Feature: Start

  /** getter for Start - gets 
   * @generated */
  public int getStart() {
    if (typesystemGeneEntity_Type.featOkTst && ((typesystemGeneEntity_Type)jcasType).casFeat_Start == null)
      jcasType.jcas.throwFeatMissing("Start", "typesystem.typesystemGeneEntity");
    return jcasType.ll_cas.ll_getIntValue(addr, ((typesystemGeneEntity_Type)jcasType).casFeatCode_Start);}
    
  /** setter for Start - sets  
   * @generated */
  public void setStart(int v) {
    if (typesystemGeneEntity_Type.featOkTst && ((typesystemGeneEntity_Type)jcasType).casFeat_Start == null)
      jcasType.jcas.throwFeatMissing("Start", "typesystem.typesystemGeneEntity");
    jcasType.ll_cas.ll_setIntValue(addr, ((typesystemGeneEntity_Type)jcasType).casFeatCode_Start, v);}    
   
    
  //*--------------*
  //* Feature: End

  /** getter for End - gets 
   * @generated */
  public int getEnd() {
    if (typesystemGeneEntity_Type.featOkTst && ((typesystemGeneEntity_Type)jcasType).casFeat_End == null)
      jcasType.jcas.throwFeatMissing("End", "typesystem.typesystemGeneEntity");
    return jcasType.ll_cas.ll_getIntValue(addr, ((typesystemGeneEntity_Type)jcasType).casFeatCode_End);}
    
  /** setter for End - sets  
   * @generated */
  public void setEnd(int v) {
    if (typesystemGeneEntity_Type.featOkTst && ((typesystemGeneEntity_Type)jcasType).casFeat_End == null)
      jcasType.jcas.throwFeatMissing("End", "typesystem.typesystemGeneEntity");
    jcasType.ll_cas.ll_setIntValue(addr, ((typesystemGeneEntity_Type)jcasType).casFeatCode_End, v);}    
   
    
  //*--------------*
  //* Feature: Confidence

  /** getter for Confidence - gets 
   * @generated */
  public int getConfidence() {
    if (typesystemGeneEntity_Type.featOkTst && ((typesystemGeneEntity_Type)jcasType).casFeat_Confidence == null)
      jcasType.jcas.throwFeatMissing("Confidence", "typesystem.typesystemGeneEntity");
    return jcasType.ll_cas.ll_getIntValue(addr, ((typesystemGeneEntity_Type)jcasType).casFeatCode_Confidence);}
    
  /** setter for Confidence - sets  
   * @generated */
  public void setConfidence(int v) {
    if (typesystemGeneEntity_Type.featOkTst && ((typesystemGeneEntity_Type)jcasType).casFeat_Confidence == null)
      jcasType.jcas.throwFeatMissing("Confidence", "typesystem.typesystemGeneEntity");
    jcasType.ll_cas.ll_setIntValue(addr, ((typesystemGeneEntity_Type)jcasType).casFeatCode_Confidence, v);}    
  }

    