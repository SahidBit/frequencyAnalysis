	
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
	    }

}
	

		

