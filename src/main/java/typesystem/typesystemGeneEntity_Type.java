
/* First created by JCasGen Sun Oct 14 11:28:36 CST 2012 */
package typesystem;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.FSGenerator;
import org.apache.uima.cas.FeatureStructure;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.tcas.Annotation_Type;

/** 
 * Updated by JCasGen Mon Oct 15 22:53:39 CST 2012
 * @generated */
public class typesystemGeneEntity_Type extends Annotation_Type {
  /** @generated */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (typesystemGeneEntity_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = typesystemGeneEntity_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new typesystemGeneEntity(addr, typesystemGeneEntity_Type.this);
  			   typesystemGeneEntity_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new typesystemGeneEntity(addr, typesystemGeneEntity_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = typesystemGeneEntity.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("typesystem.typesystemGeneEntity");
 
  /** @generated */
  final Feature casFeat_Entity;
  /** @generated */
  final int     casFeatCode_Entity;
  /** @generated */ 
  public String getEntity(int addr) {
        if (featOkTst && casFeat_Entity == null)
      jcas.throwFeatMissing("Entity", "typesystem.typesystemGeneEntity");
    return ll_cas.ll_getStringValue(addr, casFeatCode_Entity);
  }
  /** @generated */    
  public void setEntity(int addr, String v) {
        if (featOkTst && casFeat_Entity == null)
      jcas.throwFeatMissing("Entity", "typesystem.typesystemGeneEntity");
    ll_cas.ll_setStringValue(addr, casFeatCode_Entity, v);}
    
  
 
  /** @generated */
  final Feature casFeat_TheSentenceID;
  /** @generated */
  final int     casFeatCode_TheSentenceID;
  /** @generated */ 
  public String getTheSentenceID(int addr) {
        if (featOkTst && casFeat_TheSentenceID == null)
      jcas.throwFeatMissing("TheSentenceID", "typesystem.typesystemGeneEntity");
    return ll_cas.ll_getStringValue(addr, casFeatCode_TheSentenceID);
  }
  /** @generated */    
  public void setTheSentenceID(int addr, String v) {
        if (featOkTst && casFeat_TheSentenceID == null)
      jcas.throwFeatMissing("TheSentenceID", "typesystem.typesystemGeneEntity");
    ll_cas.ll_setStringValue(addr, casFeatCode_TheSentenceID, v);}
    
  
 
  /** @generated */
  final Feature casFeat_Start;
  /** @generated */
  final int     casFeatCode_Start;
  /** @generated */ 
  public int getStart(int addr) {
        if (featOkTst && casFeat_Start == null)
      jcas.throwFeatMissing("Start", "typesystem.typesystemGeneEntity");
    return ll_cas.ll_getIntValue(addr, casFeatCode_Start);
  }
  /** @generated */    
  public void setStart(int addr, int v) {
        if (featOkTst && casFeat_Start == null)
      jcas.throwFeatMissing("Start", "typesystem.typesystemGeneEntity");
    ll_cas.ll_setIntValue(addr, casFeatCode_Start, v);}
    
  
 
  /** @generated */
  final Feature casFeat_End;
  /** @generated */
  final int     casFeatCode_End;
  /** @generated */ 
  public int getEnd(int addr) {
        if (featOkTst && casFeat_End == null)
      jcas.throwFeatMissing("End", "typesystem.typesystemGeneEntity");
    return ll_cas.ll_getIntValue(addr, casFeatCode_End);
  }
  /** @generated */    
  public void setEnd(int addr, int v) {
        if (featOkTst && casFeat_End == null)
      jcas.throwFeatMissing("End", "typesystem.typesystemGeneEntity");
    ll_cas.ll_setIntValue(addr, casFeatCode_End, v);}
    
  
 
  /** @generated */
  final Feature casFeat_Confidence;
  /** @generated */
  final int     casFeatCode_Confidence;
  /** @generated */ 
  public int getConfidence(int addr) {
        if (featOkTst && casFeat_Confidence == null)
      jcas.throwFeatMissing("Confidence", "typesystem.typesystemGeneEntity");
    return ll_cas.ll_getIntValue(addr, casFeatCode_Confidence);
  }
  /** @generated */    
  public void setConfidence(int addr, int v) {
        if (featOkTst && casFeat_Confidence == null)
      jcas.throwFeatMissing("Confidence", "typesystem.typesystemGeneEntity");
    ll_cas.ll_setIntValue(addr, casFeatCode_Confidence, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public typesystemGeneEntity_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_Entity = jcas.getRequiredFeatureDE(casType, "Entity", "uima.cas.String", featOkTst);
    casFeatCode_Entity  = (null == casFeat_Entity) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Entity).getCode();

 
    casFeat_TheSentenceID = jcas.getRequiredFeatureDE(casType, "TheSentenceID", "uima.cas.String", featOkTst);
    casFeatCode_TheSentenceID  = (null == casFeat_TheSentenceID) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_TheSentenceID).getCode();

 
    casFeat_Start = jcas.getRequiredFeatureDE(casType, "Start", "uima.cas.Integer", featOkTst);
    casFeatCode_Start  = (null == casFeat_Start) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Start).getCode();

 
    casFeat_End = jcas.getRequiredFeatureDE(casType, "End", "uima.cas.Integer", featOkTst);
    casFeatCode_End  = (null == casFeat_End) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_End).getCode();

 
    casFeat_Confidence = jcas.getRequiredFeatureDE(casType, "Confidence", "uima.cas.Integer", featOkTst);
    casFeatCode_Confidence  = (null == casFeat_Confidence) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Confidence).getCode();

  }
}



    