import java.util.ArrayList;

public class MSGtester {
    private static StringSorterAsc Sorter;

    public static void main(String[] args) {
    
    	
        ArrayList<Msg> list=new ArrayList<>(5);
        list.add(new Msg("aabcda",3255));
        list.add(new Msg("aafsdg",4354));
        list.add(new Msg("sdhfgh",251));
        list.add(new Msg("sfhfdg",425.12));
        list.add(new Msg("fjkashglk",231.2));
        System.out.print("Before sorting: \n"+list);
        Sorter.ContentSortAsc(list);
        System.out.print("\nAfter sorted by content Asc\n"+list+"\n");
        



    }
    
   
}
