public class Problem9 {
    public boolean isPalindrome(int x){
        if(x < 0 || (x % 10) == 0 && x != 0){
            return false;
        }

        int reverseInt = 0;
        while (reverseInt > x){
            reverseInt = reverseInt * 10 + (x % 10);
            x /= 10;
        }
        return x == reverseInt || x == reverseInt / 10;
    }
}
