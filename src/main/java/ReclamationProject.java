/**
 * The following code needs a lot of TLC. So give it some!
 *
 * 1. Fix all checkstyle errors
 * 2. Determine what it does (it's going to be tough before you finish #1)
 * 3. Improve the name of the methods and variables
 * 4. Add comments and Javadoc comments where needed
 * 5. Remove unnecessary comments as appropriate
 */
public class ReclamationProject {
    /**
     * rearrange a and b, make the longer at the front.
     * @param a input string
     * @param b input string
     * @return output string
     */
    static String doit(final String a, final String b) {
       String tempA = a;
       String tempB = b;
        if (tempA.length() > tempB.length()) {
            String c = tempA;
            tempA = b;
            tempB = c;
            }
        String r = "";
        /*
         * For loop with i
         */
        for (int i = 0; i < a.length(); i++) {
            for (int j = a.length() - i; j > 0; j--) {
                for (int k = 0; k < b.length() - j; k++) {
                    if (a.regionMatches(i, b, k, j) && j > r.length()) {
                        r = a.substring(i, i + j);
                    }
                }
            }
        } return r;
    }
}
