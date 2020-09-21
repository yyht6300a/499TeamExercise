import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class StringSorterDescTest {

    @org.junit.jupiter.api.Test
    void sortStringsDesc() {
        String[] testStrings = {"cow", "bat", "dog", "zebra", "llama"};
        String[] manuallySorted = {"zebra", "llama", "dog", "cow", "bat"};
        String[] sortedDescArray = StringSorterDesc.sortStringsDesc(testStrings);
        assertArrayEquals(manuallySorted, sortedDescArray);
    }
}