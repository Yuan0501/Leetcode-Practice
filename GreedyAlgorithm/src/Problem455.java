import java.util.Arrays;

public class Problem455 {
    public int findContentChildren(int[] g, int[] s ){
        Arrays.sort(g);
        Arrays.sort(s);
        int p1 = s.length - 1;
        int p2 = g.length - 1;
        int res = 0;
        while(p1 >= 0 && p2 >= 0){
            if(s[p1] >= g[p2]){
                res++;
                p1--;
                p2--;
            }else{
                p2--;
            }
        }

        return res;
    }
}
