
import com.mycompany.unittestdemo.MyService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author admin
 */
public class TestCase01 {
    @Test
    public void test01() {
        int x = 2;
        int n = 3;
        int expected = 8;
        int actual = MyService.power(x, n);
        
        Assertions.assertEquals(expected, actual);
    }
    
    @ParameterizedTest
    @CsvSource({"2,3,8", "2,4,16", "-2,3,-8", "-2,4,16", "2,0,1"})
    public void testParams(int x, int n, int expected) {
        int actual = MyService.power(x, n);
        Assertions.assertEquals(expected, actual);
    }
    
    @ParameterizedTest
    @CsvFileSource(resources = "data.csv", numLinesToSkip = 1)
    public void testFile(int x, int n, int expected, String errMsg) {
        int actual = MyService.power(x, n);
        Assertions.assertEquals(expected, actual, errMsg);
    }
    
    @ParameterizedTest
    @ValueSource(ints = {4, 6, 1, 143, -7})
    public void testPrimFalse(int n) {
        Assertions.assertFalse(MyService.prime(n), "So " + n + " bi sai!");
    }
}
