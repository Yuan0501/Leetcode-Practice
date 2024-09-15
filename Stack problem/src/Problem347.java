import java.util.*;
import java.util.PriorityQueue;

//Time complexity: O(NlogK)
//Space complexity: O(n+k)
public class Problem347 {

    public class Freq implements Comparable<Freq>{
        int num, feq;
        public Freq(int item, int feq){
            this.num = item;
            this.feq = feq;
        }

        @Override
        public int compareTo(Freq another) {
            if(this.feq < another.feq){
                return -1;
            } else if (this.feq > another.feq) {
                return 1;
            }else {
                return 0;
            }
        }

    }
    public int[] topKFrequent(int[] nums, int k){

        TreeMap<Integer, Integer> map = new TreeMap<>();
        for(int i : nums){
            if(map.containsKey(i)){
                map.put(i,map.get(i) + 1);
            }else{
                map.put(i, 1);
            }
        }

        PriorityQueue<Freq> pq = new PriorityQueue<>();
        for(int key: map.keySet()){
            if(pq.size() < k){
                pq.add(new Freq(key, map.get(key)));
            }else{
                if(map.get(key) > pq.peek().feq){
                    pq.remove();
                    pq.add(new Freq(key, map.get(key)));
                }
            }
        }
        int[] res = new int[k];
        for(int i = 0; i < k ;i ++){
            res[i] = pq.poll().num;
        }

        return res;



    }

//    Another solution:

//    public int[] topKFrequent(int[] nums, int k){
//        TreeMap<Integer, Integer> map = new TreeMap<>();
//        for(int i : nums){
//            if(map.containsKey(i)){
//                map.put(i,map.get(i) + 1);
//            }else{
//                map.put(i, 1);
//            }
//        }
//
//        PriorityQueue<Integer> pq = new PriorityQueue<>(new Comparator<Integer>() {
//            @Override
//            public int compare(Integer a, Integer b) {
//                return map.get(a) - map.get(b);
//            }
//        });
//
//        for(int key: map.keySet()){
//            if(pq.size() < k){
//                pq.add(key);
//            }else{
//                if(map.get(key) > map.get(pq.peek())){
//                    pq.remove();
//                    pq.add(key);
//                }
//            }
//        }
//        int[] res = new int[k];
//        for(int i = 0; i < k ;i ++){
//            res[i] = pq.poll();
//        }
//
//        return res;


}
