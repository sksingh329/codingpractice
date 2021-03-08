package medium;

import java.util.*;

/***
 * Link - https://leetcode.com/problems/longest-substring-without-repeating-characters/
 * Given a string s, find the length of the longest substring without repeating characters.
 * Input: s = "abcabcbb" | Output: 3
 * Next - Reimplement after learning HashSet in Collection Framework
 */
public class LongestSubstringWithoutRepeatChar {
    public int lengthOfLongestSubstring5(String s) {
        int n = s.length(), ans = 0;
        Map<Character, Integer> map = new HashMap<>(); // current index of character
        // try to extend the range [i, j]
        for (int j = 0, i = 0; j < n; j++) {
            if (map.containsKey(s.charAt(j))) {
                i = Math.max(map.get(s.charAt(j)), i);
            }
            ans = Math.max(ans, j - i + 1);
            map.put(s.charAt(j), j + 1);
        }
        return ans;
    }
    public int lengthOfLongestSubstring4(String s) {
        int maxLength = 0;
        for(int i=0;i<s.length();i++){
            int length = 1 ;
            HashSet<Character> set = new HashSet();
            set.add(s.charAt(i));
            for(int j=i+1;j<s.length();j++){
                if(set.contains(s.charAt(j))){

                    break;
                }
                else{
                    set.add(s.charAt(j));
                    length++;
                }
            }
            if(maxLength<length) maxLength = length;
        }
        return maxLength;
    }
    public int lengthOfLongestSubstring3(String s) {
        int maxLength = 0;

        for(int i = 0; i < s.length(); i++)
            for (int j = i+1; j <= s.length(); j++)
                if(allUnique(s,i,j))
                    maxLength = Math.max(maxLength,j-i);
        return maxLength;
    }
    public boolean allUnique3(String s, int start, int end){
        Set<Character> subSet = new HashSet<>();
        for(int i = start; i < end; i++){
            char chatAt = s.charAt(i);
            if(subSet.contains(chatAt)) return false;
            subSet.add(chatAt);
        }
        return true;
    }
    public int lengthOfLongestSubstring2(String s) {
        int maxLength = 0;

        for(int i = 0; i < s.length(); i++){
            int length = 0;
            for (int j = i+1; j < s.length(); j++){
                if(allUnique(s,i,j)) {
                    length = (j-i)+1;
                    if(length >= maxLength)
                        maxLength = length;
                }
                else break;
            }
        }
        return maxLength;
    }
    public boolean allUnique(String s, int start, int end){
        Set<Character> subSet = new HashSet<>();
        for(int i = start; i <= end; i++){
            char chatAt = s.charAt(i);
            if(subSet.contains(chatAt)) return false;
            subSet.add(chatAt);
        }
        return true;
    }
    public int lengthOfLongestSubstring(String s) {
        char[] input = s.toCharArray();
        char[] current = new char[s.length()];
        char[] largest = new char[s.length()];
        int currentCount = 0;
        for(int i = 0; i < s.length();i++){
            //System.out.println("value of currentCount= "+currentCount+" when i= "+i+"current[0]: "+current[0]);
            current[currentCount++] = input[i];
            if(input.length == 1) largest[0] = current[0];
            for(int j = i+1; j < s.length(); j++){
                if(isElementExist(current,input[j])){
                    // Check size of current and largest if current.size>largest.size then replace largest with current else empty current and continue loop
                    if(getSize(current) > getSize(largest)) {
                        copy(current,largest);
                    }
                    break;
                }
                else{
                    //Add input[j] in current
                    current[currentCount++] = input[j];
                    if(j == (input.length-1)){
                        if(getSize(current) > getSize(largest)){
                            copy(current,largest);
                        }
                    }
                }
            }
            nullify(current);
            currentCount = 0;
        }
        //for(char elem:largest) System.out.print(elem+"-");
        return getSize(largest);
    }
    public int getSize(char[] arr){
        int count = 0;
        for (char c : arr) {
            if (c == '\000')
                break;
            count++;
        }
        return count;
    }
    public boolean isElementExist(char[] current, char search){
        for (char c : current) {
            if (c == search) {
                //System.out.println("Element exist? "+current[i]);
                return true;
            }
        }
        return false;
    }
    //Helper method - copying array element or reassignment, nullify array
    public void copy(char[] source, char[] destination){
        nullify(destination);
        System.arraycopy(source, 0, destination, 0, source.length);
    }
    public void nullify(char[] arr){
        Arrays.fill(arr, '\000');
    }
}
