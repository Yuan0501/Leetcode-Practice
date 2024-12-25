public class MathProblem {
    public String convertToTitle(int columnNumber) {
        StringBuilder sb = new StringBuilder();
        while(columnNumber > 0){
            columnNumber--;
            int digit = columnNumber % 26;
            sb.append((char)(digit + 'A'));
            columnNumber /= 26;
        }

        return sb.reverse().toString();
    }

    public String addBinary(String a, String b) {
        int carry = 0;
        StringBuilder sb = new StringBuilder();
        int indexA = a.length() - 1;
        int indexB = b.length() - 1;
        while(carry == 1 || indexA >= 0 || indexB >= 0){
            if(indexA >= 0 && a.charAt(indexA--) == '1'){
                carry++;

            }
            if(indexB >= 0 && b.charAt(indexB--) == '1'){
                carry++;

            }
            sb.append(carry % 2);
            carry /= 2;
        }
        return sb.reverse().toString();
    }

    public int maximumProduct(int[] nums) {
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int max3 = Integer.MIN_VALUE;
        for(int n : nums){
            if(n > max1){
                max3 = max2;
                max2 = max1;
                max1 = n;
            }else if(n > max2){
                max3 = max2;
                max2 = n;
            }else if(n > max3){
                max3 = n;
            }

            if(n < min1){
                min2 = min1;
                min1 = n;
            }else if(n < min2){
                min2 = n;
            }
        }

        return Math.max(max1 * max2 * max3, min1 * min2 * max1);
    }
}
