import java.util.ArrayList;

public class MSGtester {
    private static StringSorterAsc Sorter;

    public static void main(String[] args) {
    	int [] Intarray= {2,1,6,3,9,10,7,8,5,4};
    	
        ArrayList<Msg> list=new ArrayList<>(5);
        list.add(new Msg("aabcda",3255));
        list.add(new Msg("aafsdg",4354));
        list.add(new Msg("sdhfgh",251));
        list.add(new Msg("sfhfdg",425.12));
        list.add(new Msg("fjkashglk",231.2));
        System.out.print("Before sorting: \n"+list);
        Sorter.ContentSortAsc(list);
        System.out.print("\nAfter sorted by content Asc\n"+list+"\n");
        
        Int_ascending Ia= new Int_ascending();
        Ia.ascending(Intarray);
        printarray(Intarray);


    }
    
    public static void printarray(int []arr) {
    	System.out.print("sorted array: ");
    	for(int i=0;i<arr.length;i++) {
    		System.out.print(arr[i]+" ");
    	}
    }
}
