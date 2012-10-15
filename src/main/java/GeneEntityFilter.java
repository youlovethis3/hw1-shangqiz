import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;


public class GeneEntityFilter {
	/*Initialization, in it the datafile "genenames.txt" would be read in.
	 * All nameEntities are stored in the hashset.*/
	public GeneEntityFilter(){
		
		hs=new HashSet<String>();
		hs_ontology=new HashSet<String>();
		
		  File file = new File(FileSystemCollectionReader.BACKGROUNDKNOWLEDGE_1);
		  File file_ontology =new File("src/main/resources/data/ontology_def.obo.txt");
	        BufferedReader reader = null;
	        try {
	            reader = new BufferedReader(new FileReader(file));
	            String tempString = null;
	            int line = 1;
	            // Read one sentence per time, and add it into the hashset
	            while ((tempString = reader.readLine()) != null) {
	                
	                hs.add(tempString);
	            }
	            reader.close();
	        } catch (IOException e) {
	            e.printStackTrace();
	        } finally {
	            if (reader != null) {
	                try {
	                    reader.close();
	                } catch (IOException e1) {
	                }
	            }
	        }
	        BufferedReader reader2 = null;
	        try {
	            reader2 = new BufferedReader(new FileReader(file_ontology));
	            String tempString = null;
	       
	            while ((tempString = reader2.readLine()) != null) {
	            	if(tempString.startsWith("name: ")){
	            		String str=tempString.substring(6, tempString.length());
	     
	            		hs_ontology.add(str);
	            	}
	              
	            }
	            reader2.close();
	        } catch (IOException e) {
	            e.printStackTrace();
	        } finally {
	            if (reader != null) {
	                try {
	                    reader.close();
	                } catch (IOException e1) {
	                }
	            }
	        }
		
		
	}
	public HashSet<String> hs;
	public HashSet<String> hs_ontology;
	public File file;

}
