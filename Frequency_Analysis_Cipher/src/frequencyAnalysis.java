import java.lang.String;
	import java.util.Arrays;
	import java.util.Scanner;
	
	public class frequencyAnalysis {
	    public static void main(String[] args) {
	
	    Scanner input = new Scanner(System.in);
	    System.out.println("Cipher Text: ");
	    String encryptedText = input.nextLine().toLowerCase();
	    char[] string = new char[0];
	    Arrays.sort(string);
	
	    int[] freq = new int[encryptedText.length()];
	    int i = 0;
	    int j;
 //Converts given string into character array
	    string = encryptedText.toCharArray();
	     for (i = 0; i < encryptedText.length(); i++) {
	       freq[i] = 1;
	        for (j = i + 1; j < encryptedText.length(); j++) {
	         if (string[i] == string[j]) {
	          freq[i]++;
 //Set string[j] to 0 to avoid printing visited character
	       string[j] = '0';
	                }
	            }
	        }
 //Displays each character and their corresponding frequency
   System.out.println("Analysis");

	  for (i = 0; i < freq.length; i++) {
	   if (string[i] != ' ' && string[i] != '0') {
	   System.out.println(string[i] + "-" + freq[i]);
	     }
	 }
    System.out.println();
	System.out.println("................");
	System.out.println("Replacement Rules");
	        
/*The oldChar and newChar have been defaulted from 'z' to 'a' so that the newChar can be replaced to the corresponding frequency of the original English letter*/
	        
    encryptedText = encryptedText.replace('a', 'z');
	encryptedText = encryptedText.replace('b', 'y');
	encryptedText = encryptedText.replace('c', 'x');
	encryptedText = encryptedText.replace('d', 'w');
	encryptedText = encryptedText.replace('e', 'v');
	encryptedText = encryptedText.replace('f', 'u');
	encryptedText = encryptedText.replace('g', 't');
	encryptedText = encryptedText.replace('h', 's');
	encryptedText = encryptedText.replace('i', 'r');
	encryptedText = encryptedText.replace('j', 'q');
	encryptedText = encryptedText.replace('k', 'p');
	encryptedText = encryptedText.replace('l', 'o');
	encryptedText = encryptedText.replace('m', 'n');
	encryptedText = encryptedText.replace('n', 'm');
	encryptedText = encryptedText.replace('o', 'l');
	encryptedText = encryptedText.replace('p', 'k');
	encryptedText = encryptedText.replace('q', 'j');
	encryptedText = encryptedText.replace('r', 'i');
	encryptedText = encryptedText.replace('s', 'h');
	encryptedText = encryptedText.replace('t', 'g');
	encryptedText = encryptedText.replace('u', 'f');
	encryptedText = encryptedText.replace('v', 'e');
	encryptedText = encryptedText.replace('w', 'd');
	encryptedText = encryptedText.replace('x', 'c');
	encryptedText = encryptedText.replace('y', 'b');
	encryptedText = encryptedText.replace('z', 'a');
	
	System.out.println(encryptedText);
	
	      System.out.println();
	      System.out.println("..............................................");
          System.out.println("Replacing Cipher text based on frequency");
	    }
	}


	    

	


