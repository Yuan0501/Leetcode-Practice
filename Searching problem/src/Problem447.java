import java.util.HashMap;

public class Problem447 {
    public int numberOfBoomeangs(int[][] points){
        int res = 0;
        for(int i = 0; i < points.length; i++){
            HashMap<Integer, Integer> map = new HashMap<>();
            for(int j = 0; j < points.length; j++){
                if(j != i){
                    int dis = distance(points[i],points[j]);
                    map.put(dis, map.getOrDefault(dis, 0) + 1);
                }
            }
            for(int key: map.keySet()){
                if(map.get(key) >= 2){
                    int value = map.get(key);
                    res += value * (value - 1);
                }
            }

        }
        return res;
    }
    private int distance(int[] a, int[] b){
        return (a[0] - b[0])*(a[0] - b[0]) + (a[1] - b[1])*(a[1] - b[1]);
    }
}
