/**
 * Given twoo strings needle and haystack. return the index of first occurence of needle in haystack
 * or -1 if needle not found
 * Input  : "blacksheep" and needle is "sheep"
 * Output : 5
 * 
 * Input : "happycoding" and needle is "hep"
 * Output : -1
 * 
 */
class FindFirstOccurance {

    public static void main( String[] args ) {

        System.out.println( "----------Find First Occurance Program-----------------" );
        String haystack = "happycoding";
        String needle = "hep";
        System.out.println( needle+" found at index "+strStr( haystack, needle ) );
    }

    // strStr uses Brut force algorithm to find index of given pattern
    public static int strStr( String haystack, String needle ) {

        int hlength = haystack.length();
        int plength = needle.length();

        for( int i = 0; i<= hlength-plength; i++ ) {

            int j = 0;
            while( ( j < plength )  && ( haystack.charAt(i+j) == needle.charAt(j) ) ) {

                j++;

                if( j == needle.length() ) {
                    return i;
                }
            }
        }

        return -1;
    }
}