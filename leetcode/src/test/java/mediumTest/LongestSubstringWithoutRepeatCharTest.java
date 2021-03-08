package mediumTest;

import medium.LongestSubstringWithoutRepeatChar;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LongestSubstringWithoutRepeatCharTest {
    LongestSubstringWithoutRepeatChar longestSubstring;
    @BeforeTest
    public void setup(){
        longestSubstring = new LongestSubstringWithoutRepeatChar();
    }
    @Test
    public void test1(){
        int expected = 3;
        int actual = longestSubstring.lengthOfLongestSubstring("abcabcbb");
        Assert.assertEquals(actual,expected);
    }
    @Test
    public void test2(){
        int expected = 1;
        int actual = longestSubstring.lengthOfLongestSubstring("bbbbbbbb");
        Assert.assertEquals(actual,expected);
    }
    @Test
    public void test3(){
        int expected = 3;
        int actual = longestSubstring.lengthOfLongestSubstring("pwwkew");
        Assert.assertEquals(actual,expected);
    }
    @Test
    public void test4(){
        int expected = 0;
        int actual = longestSubstring.lengthOfLongestSubstring("");
        Assert.assertEquals(actual,expected);
    }
    @Test
    public void test5(){
        int expected = 1;
        int actual = longestSubstring.lengthOfLongestSubstring(" ");
        Assert.assertEquals(actual,expected);
    }
    @Test
    public void test6(){
        int expected = 2;
        int actual = longestSubstring.lengthOfLongestSubstring("au");
        Assert.assertEquals(actual,expected);
    }
    @Test
    public void test7(){
        int expected = 4;
        int actual = longestSubstring.lengthOfLongestSubstring("jbpnbwwd");
        Assert.assertEquals(actual,expected);
    }
    @Test
    public void test8(){
        int expected = 4;
        int actual = longestSubstring.lengthOfLongestSubstring2("jbpnbwwd");
        Assert.assertEquals(actual,expected);
    }
    @Test
    public void test9(){
        int expected = 4;
        int actual = longestSubstring.lengthOfLongestSubstring4("jbpnbwwd");
        Assert.assertEquals(actual,expected);
    }
    @Test
    public void test10(){
        int expected = 1;
        int actual = longestSubstring.lengthOfLongestSubstring4(" ");
        Assert.assertEquals(actual,expected);
    }
    @Test
    public void test11(){
        int expected = 4;
        int actual = longestSubstring.lengthOfLongestSubstring5("jbpnbwwd");
        Assert.assertEquals(actual,expected);
    }
    @Test
    public void test12(){
        int expected = 1;
        int actual = longestSubstring.lengthOfLongestSubstring5(" ");
        Assert.assertEquals(actual,expected);
    }
}
