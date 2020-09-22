import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class Test_int_ascending {

	@Test
	void test() {
		int [] arr= {2,1,6,3,10,7,8,5,4,9};
		int [] good= {1,2,3,4,5,6,7,8,9,10};
		
        Int_ascending Ia= new Int_ascending();
        Ia.ascending(arr);
        assertTrue(Arrays.equals(arr, good));
	}

}
