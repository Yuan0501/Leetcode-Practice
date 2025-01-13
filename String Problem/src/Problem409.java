public class Problem409 {
    public int longestPalindrome(String s){
        int[] count = new int[256];
        for(char c : s.toCharArray()){
            count[c]++;
        }

        int palindrome = 0;
        for(int n : count){
            palindrome += (n / 2) * 2;
        }
        if(palindrome < s.length()){
            palindrome++;
        }
        return palindrome;
    }
}
