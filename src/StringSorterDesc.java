public class StringSorterDesc {
    /*
     * Input: An array of strings
     * Output: A new array with strings sorted in descending order
     * Note: Case insensitive
     * bubble sort is best sort
     * */
    public static String[] sortStringsDesc(String[] originalAr) {
        String[] returnAr = originalAr.clone();

        for (int i = returnAr.length - 1; i >= 0; i--) {
            for (int j = i - 1; j >= 0; j--) {

                //              Swap function
                if (returnAr[i].compareToIgnoreCase(returnAr[j]) > 0) {
                    String temp = returnAr[i];
                    returnAr[i] = returnAr[j];
                    returnAr[j] = temp;
                }
            }
        }

        return returnAr;
    }
}