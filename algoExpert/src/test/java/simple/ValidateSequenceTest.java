package simple;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class ValidateSequenceTest {
    @Test
    public void test1(){
        List<Integer> array = new ArrayList<>(List.of(5,1,22,25,6,-1,8,10));
        List<Integer> sequence = new ArrayList<>(List.of(1,6,-1,10));

        boolean expected = true;
        boolean actual = ValidateSubsequence.isValidSubsequence(array,sequence);
        Assert.assertEquals(actual,expected);
    }
    @Test
    public void test2(){
        List<Integer> array = new ArrayList<>(List.of(1,2,3));
        List<Integer> sequence = new ArrayList<>(List.of(4));

        boolean expected = false;
        boolean actual = ValidateSubsequence.isValidSubsequence(array,sequence);
        Assert.assertEquals(actual,expected);
    }
    @Test
    public void test3(){
        List<Integer> array = new ArrayList<>(List.of(1,1,1,1,1));
        List<Integer> sequence = new ArrayList<>(List.of(1,1,1));

        boolean expected = true;
        boolean actual = ValidateSubsequence.isValidSubsequence(array,sequence);
        Assert.assertEquals(actual,expected);
    }

}
