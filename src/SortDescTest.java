import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.Collections;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class SortDescTest {

	@Test
	void test() {
        int[] inArray = { 23, 76, 12, 43, 90, 30 };
        int[] outArray = { 12, 23, 30, 43, 76, 90};
        Arrays.sort(inArray);
        Assert.assertArrayEquals(outArray, inArray);
	}
}
