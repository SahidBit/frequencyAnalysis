	import java.util.Scanner;
	import java.io.File;
	
	public class frequencyAnalysis{
	
	

	    static String cipher = "";
	

	    public static void frequency_letter(String str) {
	

	        int[] freq = new int[str.length()];
	        int i, j;
	

	

	        char string[] = str.toCharArray();
	

	        for (i = 0; i < str.length(); i++) {
	            freq[i] = 1;
	            for (j = i + 1; j < str.length(); j++) {
	                if (string[i] == string[j]) {
	                    freq[i]++;
	

	

	                    string[j] = '0';
	                }
	            }
	        }
	

	

	        for (i = 0; i < freq.length; i++) {
	            if (string[i] != ' ' && string[i] != '0') {
	                System.out.print(string[i] + "->" + freq[i] + ",");
	            }
	        }
	    

        for (i = 0; i < freq.length; i++) {
            
			if (string[i] != ' ' && string[i] != '0') {
                System.out.print(string[i] + "->" + freq[i] + ",");
			}
			
        }
        
        
	 }
        
        
          
 


    public static void replace_Text(String str) {
        str = str.toLowerCase();
        cipher = cipher.toLowerCase();
        String[] txt = str.split(",");


        for (int i = 0; i < txt.length; i++) {


            String[] txt_replace = txt[i].split(":");
            cipher = cipher.replace(txt_replace[0], txt_replace[1]);
   
         

        System.out.println("Plain Text :" + cipher + "");
        
          
        }
   
    }
	


    public static void main(String[] args) {


        try {


            System.out.println("Cipher text :");
            if (!args[0].equals("")) {
                File myObj = new File(args[0]);
                
                Scanner myReader = new Scanner(myObj);
                while (myReader.hasNextLine()) {
                    String data = myReader.nextLine();
                    cipher += data;
                    System.out.println(data);
                }
                myReader.close();


                System.out.println("Analysis :");
                
                frequency_letter(cipher);
                
                System.out.println("");
  
            }

