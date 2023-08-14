package coen6761.group.assign2;
import static org.junit.jupiter.api.Assertions.*;
import coen6761.group.assign2.Quick;
import org.mockito.Mockito;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.mockito.Mockito.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.Test;

public class QuickCompleteTest {
	@Test
	//TestPartition_differentContent
	public void test_i_dcu() {
		assertEquals(2, Quick.partition(new Comparable[] {5,3,6,4}, 0, 3));
	}
	
	@Test
	public void test_j_dcu() {
		assertEquals(1, Quick.partition(new Comparable[] {6,8,4,9}, 0, 3));
	}
	
	@Test
	public void test_i_dpu() {
		assertEquals(1, Quick.partition(new Comparable[] {5,4}, 0, 1));
	}
	


    @Test
    public void testSort() {
        Integer[] a = {5, 3, 8, 2, 7};
        Quick.sort(a);
        assertTrue(isSorted(a));
    }

	
    @Test
    public void testSelect() {
        Integer[] a = {5, 3, 8, 2, 7};
        Comparable selected = Quick.select(a, 2);
        assertEquals(5, selected);
    }
    @Test
    public void testSelect_outOfRangelessthanzero() {
        Integer[] a = {5, 3, 8, 2, 7};
        
        assertThrows(IllegalArgumentException.class, () -> {
            Quick.select(a, -5); // k is out of bounds
        
    });
    }
    @Test
    public void testEmptyArraySort() {
        Integer[] a = {};
        Quick.sort(a);
        assertTrue(isSorted(a));
    }

    @Test
    public void testSingleElementArraySort() {
        Integer[] a = {1};
        Quick.sort(a);
        assertTrue(isSorted(a));
    }

    @Test
    public void testIsSorted() {
        Integer[] sortedArray = {1, 2, 3, 4, 5};
        Integer[] unsortedArray = {5, 2, 1, 4, 3};

        assertTrue(isSorted(sortedArray));
        assertFalse(isSorted(unsortedArray));
    }
   

        @Test
        public void testSelectWithValidK() {
            Integer[] a = {5, 3, 8, 2, 7};
            Comparable selected = Quick.select(a, 2); // Select the 3rd smallest element (0-based index)
            assertEquals(5, selected);
        }

        @Test
        public void testSelectWithInvalidK() {
            Integer[] a = {5, 3, 8, 2, 7};
            assertThrows(IllegalArgumentException.class, () -> {
                Quick.select(a, 5); // k is out of bounds
            });
        }

        @Test
        public void testSelectWithEmptyArray() {
            Integer[] a = {};
            assertThrows(IllegalArgumentException.class, () -> {
                Quick.select(a, 0); // k is out of bounds
            });
        }

        @Test
        public void testSelectWithSingleElementArray() {
            Integer[] a = {1};
            Comparable selected = Quick.select(a, 0); // Select the only element
            assertEquals(1, selected);
        }

        @Test
        public void testSelectWithSortedArray() {
            Integer[] a = {1, 2, 3, 4, 5};
            Comparable selected = Quick.select(a, 2); // Select the 3rd smallest element
            assertEquals(3, selected);
        }

        @Test
        public void testSelectWithReverseSortedArray() {
            Integer[] a = {5, 4, 3, 2, 1};
            Comparable selected = Quick.select(a, 2); // Select the 3rd smallest element
            assertEquals(3, selected);
        }

        @Test
        public void testSelectWithDuplicateElements() {
            Integer[] a = {5, 5, 2, 7, 2};
            Comparable selected = Quick.select(a, 2); // Select the 3rd smallest element
            assertEquals(5, selected);
        }
    
       


     //Helper method to check if an array is sorted
    private boolean isSorted(Comparable[] a) {
        for (int i = 1; i < a.length; i++) {
            if (a[i - 1].compareTo(a[i]) > 0) {
                return false;
            }
        }
        return true;
    }
}
