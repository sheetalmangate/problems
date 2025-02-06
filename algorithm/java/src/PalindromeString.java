/*
* Check the given String is palindrome or not. 
* Before checking convert all uppercase letters to locarcase and remove all non alphanumeric characters.
* Given a string s, return true if it is a palindrome, or false otherwise.
*
*
*/
class PalindromeString {


	public static void main( String[] args ){
	
		String str = "A man, a plan, a canal: Panama";
		
		if( isPalindrome(str) ) {
			System.out.println( str+" is palindrome string");
		} else {
			System.out.println( str+" is not a palindrome string");
		}
	
	
	
	}
	
	public static boolean isPalindrome(String s) {
        
		String cleanStr = "";
		s = s.toLowerCase();
	
		for(int i = 0; i< s.length(); i++ ) {
			int asciiValue = (int) s.charAt(i);
			
			if( ( asciiValue >= 48 && asciiValue <= 57 ) || ( asciiValue >= 97 && asciiValue <= 122 ) ) 
				cleanStr += s.charAt(i);
			
		}
		
		int left = 0;
		int right = cleanStr.length()-1;
		
		while(left < right ) {
			
			if(cleanStr.charAt(left) != cleanStr.charAt(right) ) {
				return false;
			}
			
			left++;
			right--;

		}
		
		return true;
    }
	
	
}