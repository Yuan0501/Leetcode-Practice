import java.util.HashSet;
import java.util.Set;
//To work out the total time complexity, we'll need to think carefully about how many numbers are in the chain, and how big they are.
//Time complexity of this problem is only need to calculate the Time complexity of getNext() function
// getNext() time complexity is O(logn)
// Space complexity is O(logn)
//202. Happy Number
public class Problem202 {
//    Time complexity of getNext() is O(logn)
    public int getNext(int num){
        int totoalSum = 0;
        while(num > 0){
            int d = num % 10;
//    Dominant part of Time complexity is O(logn)
            num = num / 10;
            totoalSum += d * d;
        }
        return totoalSum;
    }
    public boolean isHappy(int n){
        Set<Integer> set = new HashSet<>();
        int num = getNext(n);
        while(num != 1){
            if(set.contains(num)){
                return false;
            }else{
                set.add(num);
                num = getNext(num);
            }
        }
        return true;
    }
}
