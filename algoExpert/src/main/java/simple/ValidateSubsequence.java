package simple;

import java.util.List;

public class ValidateSubsequence {
    public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
        // Write your code here.
        int index = -1;
        for(int val:sequence){
            //index = getIndex(array,index+1,val);
            index = search(array,index+1,val);
            if(index<0) return false;
        }
        System.out.println(index);
        return true;
    }
    static int getIndex(List<Integer> array,int startIndex,int searchValue){
        int currentIndex = array.indexOf(searchValue);
        System.out.println(searchValue+","+currentIndex+","+startIndex);
        if(startIndex <= currentIndex) return currentIndex;
        else return -1;
    }
    static int search(List<Integer> input,int startIndex,int searchValue){
        int[] array = input.stream().mapToInt(i->i).toArray();
        int currentIndex = -1;
        for (int i = startIndex;i<array.length;i++){
            if(array[i] == searchValue){
                currentIndex = i;
                break;
            }
        }
        if(startIndex <= currentIndex) return currentIndex;
        else return -1;
    }
}
