import java.awt.*;
import java.util.*;
import java.util.List;

public class Solution {
//    283. Move Zeros
    public void moveZeroes(int[] nums) {
        int j = -1;
        for(int i = 0;i < nums.length;i++){
            if(nums[i] != 0){
                j++;
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }
    }
// 80. Remove Duplicates from Sorted Array II
    public int removeDuplicates(int[] nums) {
        int index = 0;
        for(int n: nums){
            if(index < 2 || n > nums[index - 2]){
                nums[index] = n;
                index++;
            }
        }
        return index;
    }
// 75.Sort Colors
    public void sortColors(int[] nums) {
        int count0 = 0;
        int count1 = 0;
        int count2 = 0;
        for(int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                count0++;
            } else if (nums[i] == 1) {
                count1++;
            } else {
                count2++;
            }
        }
        for(int i = 0; i < count0; i++){
            nums[i] = 0;
        }
        for(int i = count0; i < count0 + count1; i++){
            nums[i] = 1;
        }
        for(int i = count0 + count1; i < nums.length; i ++){
            nums[i] = 2;
        }
    }
// 215. Kth Largest Element in an Array
    public int findeKthLargest(int [] nums, int k){
//        for(int i = 0; i < nums.length - 1; i++){
//            int max_i = i;
//            for(int j = i+1; j <nums.length; j++){
//                if(nums[j] > nums[max_i]) {
//                    max_i = j;
//                }
//            }
//            int temp = nums[i];
//            nums[i] = nums[max_i];
//            nums[max_i] = temp;
//        }
//        for(int i = 0; i< nums.length; i++){
//            System.out.println(nums[i]);
//        }
//        return nums[k - 1];
        Arrays.sort(nums);
        return nums[nums.length-k];
    }
// 167. Two Sum II-Input Array is Sorted
    public int[] twoSum(int[] numbers, int target) {
        int i = 0;
        int j = numbers.length - 1;
        int ret[] = new int[2];
        while(i < j){
            if(numbers[i] + numbers[j] == target){
                ret[0] = i + 1;
                ret[1] = j + 1;
                break;
            }else if(numbers[i]+ numbers[j] > target){
                j--;
            }else{
                i++;
            }
        }
        return ret;
    }

//    125. Valid Palindrome
    public boolean isPalindrome(String s) {
        String s_low = s.toLowerCase();
        int i = 0;
        int j = s_low.length() - 1;
        for(; i < j; i++, j-- ){
            while(i < j && !Character.isLetterOrDigit(s_low.charAt(i))){
                i++;
            }
            while (i < j && !Character.isLetterOrDigit(s_low.charAt(j))){
                j--;
            }
            if(s_low.charAt(i)!= s_low.charAt(j)){
                return false;
            }
        }
        return true;

    }
// 345. Reverse Vowels of a String
    public String reverseVowels(String s){
        int i = 0;
        int j = s.length() - 1;
        char[] newChars = s.toCharArray();
        for(;i < j; i++, j--){
            while (i < j && Character.toLowerCase(s.charAt(i)) != 'a' &&  Character.toLowerCase(s.charAt(i)) != 'e' && Character.toLowerCase(s.charAt(i)) !='i'
                    && Character.toLowerCase(s.charAt(i)) !='o' && Character.toLowerCase(s.charAt(i)) != 'u'){
                i++;
            }

            while (i < j && Character.toLowerCase(s.charAt(j)) != 'a' &&  Character.toLowerCase(s.charAt(j)) != 'e' && Character.toLowerCase(s.charAt(j)) !='i'
                    && Character.toLowerCase(s.charAt(j)) !='o' && Character.toLowerCase(s.charAt(j)) != 'u'){
                j--;
            }
            char temp = s.charAt(i);
            newChars[i] = s.charAt(j);
            newChars[j] = temp;
            s = String.valueOf(newChars);
        }
        return s;
    }

// 11. Container with most water 对撞指针
    public int maxArea(int[] height){
        int left = 0;
        int right = height.length - 1;
        int max = 0;
        while(left < right){
            int width = right - left;
            max = Math.max(max, width * Math.min(height[left], height[right]));
            if(height[left] <= height[right]){
                left++;
            }else{
                right--;
            }
        }
        return max;

    }

//    209. Minimum Size Subarray Sum 滑动窗口
    public int minSubArrayLen(int target, int[] nums){
        int l = 0;
        int r = -1;
        int minLen = nums.length + 1;
        int sum = 0;
        while( l < nums.length ){
            if(r <= nums.length-2 && sum <= target){
                r += 1;
                sum += nums[r];
            }else{
                sum -= nums[l];
                l++;
            }
            if(sum >= target) {
                minLen = Math.min(minLen, r - l + 1);
            }
        }
        if(minLen == nums.length + 1){
            return 0;
        }
        return  minLen;
    }

    // 3. Longest Substring without repeating characters 滑动窗口
    public int lengthOfLongestSubstring(String s){
        int[] freq = new int[256];
        Arrays.fill(freq, 0);
        int l = 0;
        int r = -1;
        int length = 0;
//        while(r < s.length() - 1){
//            r++;
//            if(freq[s.charAt(r)] == 0){
//                freq[s.charAt(r)] = 1;
//            }else if(freq[s.charAt(r)] == 1){
//                if(s.charAt(l) == s.charAt(r)){
//                    l++;
//                }else{
//                    while(s.charAt(l) != s.charAt(r)){
//                        freq[s.charAt(l)] = 0;
//                        l++;
//                    }
//                    l++;
//                }
//
//            }
//
//            length = Math.max(length, r - l + 1);
//
//        }
//        return length;
        while(l < s.length()){
            if( r + 1 < s.length() && freq[s.charAt(r+1)] == 0){
                r++;
                freq[s.charAt(r)]++;
            }else{
                freq[s.charAt(l)]--;
                l++;
            }
            length = Math.max(length, r - l + 1);
        }
        return length;
    }

//    438. Find all anagrams in a string
//    滑动窗口，HashMap
    public List<Integer> findAnagrams(String s, String p){
        List<Integer> res = new ArrayList<>();
        if(s.length() < p.length()){
            return res;
        }
        int ns = s.length();
        int np = p.length();
        Map<Character, Integer> pcount = new HashMap<>();
        Map<Character, Integer> scount = new HashMap<>();

        for(char ch : p.toCharArray()){
            if(pcount.containsKey(ch)){
                pcount.put(ch, pcount.get(ch) + 1);
            }else{
                pcount.put(ch, 1);
            }
        }

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(scount.containsKey(ch)){
                scount.put(ch, scount.get(ch) + 1);
            }else{
                scount.put(ch, 1);
            }
            if(i >= np){
                char remove = s.charAt(i - np);
                if(scount.get(remove) == 1){
                    scount.remove(remove);
                }else {
                    scount.put(remove, scount.get(remove) - 1);
                }
            }
            if(scount.equals(pcount)){
                res.add(i - np + 1);
            }
        }
        return res;
    }

//    76. Minimum window substring [Sliding window]
    public String minWindow(String s, String t){
        int m = s.length();
        int n = t.length();
        String res = "";
        if(m < n){
            return res;
        }
        Map<Character, Integer> tcount = new HashMap<>();
        for(char c: t.toCharArray()){
            if(tcount.containsKey(c)){
                tcount.put(c, tcount.get(c) + 1);
            }else{
                tcount.put(c, 1);
            }
        }
        int tsize = tcount.size();
        int l = 0;
        int r = 0;
        int countChar = 0;
        Map<Character, Integer> window = new HashMap<>();
        int minLen = s.length();
        int minL = 0;
        int minR = 0;

        while(r < s.length()){
            char c = s.charAt(r);
            if(window.containsKey(c)){
                window.put(c, window.get(c) + 1);
            }else{
                window.put(c, 1);
            }

            if(tcount.containsKey(c) && window.get(c) == tcount.get(c)){
                countChar += 1;
            }
            while(countChar == tsize && l <= r){
                int curLen = r - l + 1;
                if(curLen < minLen){
                    minLen = curLen;
                    minL = l;
                    minR = r;
                }
                char ch = s.charAt(l);
                window.put(ch, window.get(ch) - 1);
                if(tcount.containsKey(ch) && window.get(ch) < tcount.get(ch)){
                    countChar--;
                }
                l++;
            }
            r++;
        }
        res = s.substring(minL, minR + 1);
        return res;
    }

//    20. Valid Parentheses
    public boolean isValid(String s){
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(c == ')' || c == ']' || c == '}'){
                if(stack.isEmpty()){
                    return false;
                }else{
                    char pop = stack.pop();
                    if(c == ')' && pop != '('){
                        return false;
                    } else if (c == ']' && pop != '[') {
                        return false;
                    }else if(c == '}' && pop != '{'){
                        return  false;
                    }
                }
            }else {
                stack.push(c);
            }
        }
        if(stack.isEmpty()){
            return true;
        }else{
            return false;
        }
    }


}
