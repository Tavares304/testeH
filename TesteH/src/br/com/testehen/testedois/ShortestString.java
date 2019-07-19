package br.com.testehen.testedois;

public class ShortestString {

	public static void main(String[] args) {
	
		//String de entrada que peguei do Sample case 1

		
		String s = "bcaacbc";
		int l = s.length();
		int p = maxDistChar(s,l);
		System.out.println(p);
	}
	
    final static int NUM_OF_CHARS = 256; 
			    
    //maximo de chars diferentes (que sera o mesmo numero da menor string possivel com chars diferentes)
    static int maxDistChar(String str, int n) { 
  
        
        int count[] = new int[NUM_OF_CHARS]; 
  	
        for (int i = 0; i < n; i++) { 
            count[str.charAt(i)]++; 
        } 
  
        int max_distinct = 0; 
        for (int i = 0; i < NUM_OF_CHARS; i++) { 
            if (count[i] != 0) { 
                max_distinct++; 
            } 
        } 
  
        return max_distinct; 
    } 
  
	
}	
