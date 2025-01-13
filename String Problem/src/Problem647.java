public class Problem647 {
//    方法一：遍历所有的子字符串
    public boolean isPalindrome(String s){
        int l = 0;
        int h = s.length() - 1;
        while (l < h){
            if(s.charAt(l) != s.charAt(h)){
                return false;
            }
            l++;
            h--;
        }
        return true;
    }

    public int countSubstrings(String s){
        int count = 0;
        for(int i = 0; i < s.length(); i++){
            for(int j = i+1; j <= s.length(); j++){
                String subString = s.substring(i, j);
                if(isPalindrome(subString)){
                    count++;
                }
            }
        }
        return count;
    }

//    方法二：像洋葱一样，一层一层的看字符串是否为回文串

    public int countSubstringsI(String s){
        int ans = 0;
        for(int i = 0; i < s.length();i++){
            ans += OnionCount(s, i, i); //以单个数为中心向两边扩
            ans += OnionCount(s, i, i+1); //以双数为中心向两边扩

        }
        return ans;
    }

    public int OnionCount(String s, int start, int end){
        int count = 0;
        while (start >= 0 && end < s.length() && s.charAt(start) == s.charAt(end)){
            count++;
            start--;
            end++;
        }
        return count;
    }


}
