import java.util.Comparator;

public class SortDesc implements Comparator<Integer>{
	
	/*
	 * Overriding the compare() method allows to define to parameters by which elements in an array
	 * are compared when calling Arrays.sort(). 
	 * In this case when comparing o1 and o2 the compare method stipulates that the biggest number 
	 * comes first (therefore sorting the array in descending order
	 * */
	@Override
    public int compare(Integer o1, Integer o2) {
        return o2.compareTo(o1);
    }
}
