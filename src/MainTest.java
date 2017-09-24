/**
 * Test method
 */

import org.junit.Assert;

import static org.junit.Assert.*;

public class MainTest {
    @org.junit.Test
    public void equals(){
        int[][] array1 = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        int[][] array2 = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        Assert.assertArrayEquals("Error!",array1,array2);
    }

}