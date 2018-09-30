package week3;

import week3.Week3;
import org.junit.Test;
import static org.junit.Assert.*;

public class Week3Test {

    // TODO: Viết 5 testcase cho phương thức max()
    @Test
    public void testmax(){
       assertEquals(20, Week3.max(10,20) );
       assertEquals(50,Week3.max(30,50) );
       assertEquals(-30, Week3.max(-70,-30));
       assertEquals(0, Week3.max(-20, 0));
       assertEquals(10, Week3.max(-15, 10));
    }

    // TODO: Viết 5 testcase cho phương thức minOfArray()
    @Test
    public void testminOfArray(){
        assertEquals(2, Week3.minOfArray(new int[]{2, 3, 4, 5}));
        assertEquals(-5, Week3.minOfArray(new int[]{-1, 3, 7, -5, 30}));
        assertEquals(-7, Week3.minOfArray(new int[]{-7, 10, 4, 3}));
        assertEquals(0, Week3.minOfArray(new int[]{0, 3, 20}));
        assertEquals(3, Week3.minOfArray(new int[]{10, 3, 4, 8, 6}));
    }

    // TODO: Viết 5 testcase cho phương thức calculateBMI()
    @Test
    public void testcalculateBMi(){
        assertEquals("Bình thường", Week3.calculateBMI(60,1.7));
        assertEquals("Thiếu cân", Week3.calculateBMI(50,1.8));
        assertEquals("Thừa cân", Week3.calculateBMI(70,1.7));
        assertEquals("Thiếu cân", Week3.calculateBMI(40,1.6));
        assertEquals("Béo phì", Week3.calculateBMI(75,1.65));
    }
}
