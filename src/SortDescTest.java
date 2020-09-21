import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.Collections;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class SortDescTest {

	@Test
	void test() {
        int[] inArray = { 23, 76, 12, 43, 90, 30 };
        int[] outArray = { 90, 76, 43, 30, 23, 12};
        Arrays.sort(inArray);
        Assert.assertArrayEquals(outArray, inArray);
	}
}
