/**
 * Check the given number x is palindrome or not. return true if number is palindrome o.w false
 * 
 * Input : 323
 * Output : true
 * 
 * Input  : 443
 * Output : false
 * 
 * 
 */
class PalindromeNumber {


    public static void main( String[] args ) {

        PalindromeNumber obj = new PalindromeNumber();

        int x = 121;
        System.out.println( "Number "+x+" is palindrome : "+ isPalindrome ( x ) );
        
    }


    public static boolean isPalindrome( int x ) {

        int sum = 0;
        int n = x;

        while( 0 < x ) {

            sum = (sum*10) + (x%10);
            x = x/10;
        }

        if( n == sum ) return true;

        return false;

    }
}