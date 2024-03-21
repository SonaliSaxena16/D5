package interviewQue;

public class Sap {

//	    public static void main(String[] args) {
//	        String input = "this###cooldude####";
//	        String output = removeUnwantedCharacters(input);
//	        System.out.println(output);
//	    }
//
//	    public static String removeUnwantedCharacters(String input) {
//	        // Use regular expressions to remove unwanted characters
//	        String pattern = "[^a-zA-Z]+";
//	        return input.replaceAll(pattern, "");
//	    }
//	}
	
	
	
	//////////////////////////////
	
	
//	    public static void main(String[] args) {
//	        String input = "this###cooldude####";
//	        char specialChar = '#';
//	        String output = removeLeftSideBasedOnSpecialChar(input, specialChar);
//	        System.out.println(output);
//	    }
//
//	    public static String removeLeftSideBasedOnSpecialChar(String input, char specialChar) {
//	        int totalCount = 0;
//	        int index = 0;
//
//	        // Count the total occurrences of the special character from the left
//	        for (int i = 0; i < input.length(); i++) {
//	            if (input.charAt(i) == specialChar) {
//	                totalCount++;
//	            } else {
//	                break; // Stop counting when a non-special character is encountered
//	            }
//	        }
//
//	        // Remove the left side based on the total count
//	        if (totalCount > 0) {
//	            index = input.indexOf(specialChar, totalCount);
//	            if (index == -1) {
//	                // If the special character is not found, return an empty string
//	                return "";
//	            }
//	        }
//
//	        return input.substring(index);
//	    }
//	}

	
	
	
	///////////////////////////////////////
	
	
//	public static void main(String[] args) {
//        String input = "this###cooldude####hisdude";
//        
//        // Remove all special characters using regex
//        String cleanedString = input.replaceAll("[^a-zA-Z0-9 ]", "");
//        
//        // Remove the "hisdude" substring
//        cleanedString = cleanedString.replaceAll("hisdude", "");
//        
//        // Extract "tcool" from the cleaned string
//        int indexOfT = cleanedString.indexOf("t");
//        if (indexOfT != -1) {
//            cleanedString = cleanedString.substring(indexOfT);
//        } else {
//            cleanedString = ""; // Handle cases where "t" is not found
//        }
//        
//        // Print the result
//        System.out.println(cleanedString);
//    }
//}


		public static void main(String[] args) {
		String s = "this###cooldude####";
		char specialChar = '#';
		String output = removeLeftSideBasedOnSpecialChar(s, specialChar);
		System.out.println(output);
		}

		public static String removeLeftSideBasedOnSpecialChar(String s, char specialChar) {
		int totalOccurrences = 0;
		int startIndex = 0;


		for (int i = 0; i < s.length(); i++) {
		 while (i < s.length() && s.charAt(i) == '#') {
		 totalOccurrences++;
		 i++;
		 }
		 }

		 if (totalOccurrences > 0) {
		 startIndex = totalOccurrences;
		 }

		 return s.substring(startIndex);
		 }

		}







	//		Hi, I am interested in the position. Please find my attached resume. Thanks!
		
		












