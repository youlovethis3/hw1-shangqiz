
/* First created by JCasGen Sun Oct 14 05:23:43 CST 2012 */
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
 * Updated by JCasGen Mon Oct 15 15:32:40 CST 2012
 * @generated */
public class Sentence_Type extends Annotation_Type {
  /** @generated */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (Sentence_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = Sentence_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new Sentence(addr, Sentence_Type.this);
  			   Sentence_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new Sentence(addr, Sentence_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Sentence.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("typesystem.Sentence");
 
  /** @generated */
  final Feature casFeat_Sentence_ID;
  /** @generated */
  final int     casFeatCode_Sentence_ID;
  /** @generated */ 
  public String getSentence_ID(int addr) {
        if (featOkTst && casFeat_Sentence_ID == null)
      jcas.throwFeatMissing("Sentence_ID", "typesystem.Sentence");
    return ll_cas.ll_getStringValue(addr, casFeatCode_Sentence_ID);
  }
  /** @generated */    
  public void setSentence_ID(int addr, String v) {
        if (featOkTst && casFeat_Sentence_ID == null)
      jcas.throwFeatMissing("Sentence_ID", "typesystem.Sentence");
    ll_cas.ll_setStringValue(addr, casFeatCode_Sentence_ID, v);}
    
  
 
  /** @generated */
  final Feature casFeat_Sentence_Context;
  /** @generated */
  final int     casFeatCode_Sentence_Context;
  /** @generated */ 
  public String getSentence_Context(int addr) {
        if (featOkTst && casFeat_Sentence_Context == null)
      jcas.throwFeatMissing("Sentence_Context", "typesystem.Sentence");
    return ll_cas.ll_getStringValue(addr, casFeatCode_Sentence_Context);
  }
  /** @generated */    
  public void setSentence_Context(int addr, String v) {
        if (featOkTst && casFeat_Sentence_Context == null)
      jcas.throwFeatMissing("Sentence_Context", "typesystem.Sentence");
    ll_cas.ll_setStringValue(addr, casFeatCode_Sentence_Context, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public Sentence_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_Sentence_ID = jcas.getRequiredFeatureDE(casType, "Sentence_ID", "uima.cas.String", featOkTst);
    casFeatCode_Sentence_ID  = (null == casFeat_Sentence_ID) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Sentence_ID).getCode();

 
    casFeat_Sentence_Context = jcas.getRequiredFeatureDE(casType, "Sentence_Context", "uima.cas.String", featOkTst);
    casFeatCode_Sentence_Context  = (null == casFeat_Sentence_Context) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Sentence_Context).getCode();

  }
}



    