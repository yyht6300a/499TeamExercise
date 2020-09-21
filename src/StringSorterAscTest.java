import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class StringSorterAscTest {
	private static StringSorterAsc Sorter;
	@Test
	void test() {
		 
	       
	        
	            ArrayList<Msg> list=new ArrayList<>(5);
	            list.add(new Msg("aabcda",3255));
	            list.add(new Msg("aafsdg",4354));
	            list.add(new Msg("sdhfgh",251));
	            list.add(new Msg("sfhfdg",425.12));
	            list.add(new Msg("fjkashglk",231.2));
	            Sorter.ContentSortAsc(list);
	            String[] result={list.get(0).getContents(),list.get(1).getContents(),list.get(2).getContents(),list.get(3).getContents(),list.get(4).getContents()};

	            String[] correct={"aabcda","aafsdg","fjkashglk","sdhfgh","sfhfdg"};
	            assertArrayEquals(correct, result);
	        }
	}


