package simple;

/***
 * Write a function to find the longest common prefix string amongst an array of strings.
 * If there is no common prefix, return an empty string "".
 * Input - strs = ["flower","flow","flight"] | Output - "fl"
 * Input - strs = ["dog","racecar","car"] | Output - ""
 */
public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0) return "";
        String commonPrefix = strs[0];
        for(int i=1; i< strs.length;i++){
            //TODO - Write compare method to fetch common prefix
            commonPrefix = compare(commonPrefix,strs[i]);
        }
        return commonPrefix;
    }
    public String compare(String input1, String input2){
        String common = "";
        for(int i=0;i<Math.min(input1.length(),input2.length());i++){
            if(input1.charAt(i)==input2.charAt(i)){
                common += input1.charAt(i);
            }
            else break;
        }
        return common;
    }
}
