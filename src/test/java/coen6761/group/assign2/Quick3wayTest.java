package coen6761.group.assign2;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import coen6761.group.assign2.Quick3way;

public class Quick3wayTest {
	@Test
    public void testSortEmptyArray() {
        Comparable[] a = new Comparable[0];
        Quick3way.sort(a);
        assertTrue(isSorted(a));
    }

    @Test
    public void testSortSingleElementArray() {
        Comparable[] a = new Comparable[]{"A"};
        Quick3way.sort(a);
        assertTrue(isSorted(a));
    }

    @Test
    public void testSortSortedArray() {
        Comparable[] a = new Comparable[]{"A", "E", "E", "L", "M", "O", "P", "R", "S", "T", "X"};
        Quick3way.sort(a);
        assertTrue(isSorted(a));
    }

    @Test
    public void testSortReverseSortedArray() {
        Comparable[] a = new Comparable[]{"X", "T", "S", "R", "P", "O", "M", "L", "E", "E", "A"};
        Quick3way.sort(a);
        assertTrue(isSorted(a));
    }

    @Test
    public void testSortRandomArray() {
        Comparable[] a = new Comparable[]{"P", "E", "L", "X", "R", "S", "T", "E", "A", "M", "O"};
        Quick3way.sort(a);
        assertTrue(isSorted(a));
    }

    // Additional test cases to cover edge cases and different conditions

    // Helper methods to check if an array is sorted and handle data path coverage

    private boolean isSorted(Comparable[] a) {
        for (int i = 1; i < a.length; i++) {
            if (less(a[i], a[i - 1])) {
                return false;
            }
        }
        return true;
    }

    private boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }
    
}
