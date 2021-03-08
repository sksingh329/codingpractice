package mediumTest;

import medium.StringToInteger;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class StringToIntegerTest {
    StringToInteger test;
    @BeforeTest
    public void setup(){
        test = new StringToInteger();
    }
    @Test
    public void test1(){
        String input = "   42er12";
        int expectedOutput = 42;
        int actualOutput = test.myAtoi(input);
        Assert.assertEquals(actualOutput,expectedOutput);
    }
    @Test
    public void test2(){
        String input = "   -42";
        int expectedOutput = -42;
        int actualOutput = test.myAtoi(input);
        Assert.assertEquals(actualOutput,expectedOutput);
    }
    @Test
    public void test3(){
        String input = "";
        int expectedOutput = 0;
        int actualOutput = test.myAtoi(input);
        Assert.assertEquals(actualOutput,expectedOutput);
    }
    @Test
    public void test4(){
        String input = "-91283472332";
        int expectedOutput = Integer.MIN_VALUE;
        int actualOutput = test.myAtoi(input);
        Assert.assertEquals(actualOutput,expectedOutput);
    }
    @Test
    public void test5(){
        String input = "-+12";
        int expectedOutput = 0;
        int actualOutput = test.myAtoi(input);
        Assert.assertEquals(actualOutput,expectedOutput);
    }
}
