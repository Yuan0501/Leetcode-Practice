
public class Main {
    public static void main(String[] args) {
        Problem349 slu = new Problem349();
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};
        int[] res = slu.intersection(nums1,nums2);
        for(int i: res){
            System.out.println(i);
        }
    }
}