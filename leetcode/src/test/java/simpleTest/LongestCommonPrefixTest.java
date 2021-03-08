package simpleTest;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import simple.LongestCommonPrefix;

public class LongestCommonPrefixTest {
    LongestCommonPrefix longestCommonPrefix;
    @BeforeTest
    public void setup(){
        longestCommonPrefix = new LongestCommonPrefix();
    }

    @Test
    public void test1(){
        String[] strs = {"flower","flow","flight"};
        String expected = "fl";
        String actual = longestCommonPrefix.longestCommonPrefix(strs);
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void test2(){
        String[] strs = {"dog","racecar","car"};
        String expected = "";
        String actual = longestCommonPrefix.longestCommonPrefix(strs);
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void test3(){
        String[] strs = {};
        String expected = "";
        String actual = longestCommonPrefix.longestCommonPrefix(strs);
        Assert.assertEquals(actual,expected);
    }
}
