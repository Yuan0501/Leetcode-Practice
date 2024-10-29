import java.util.*;
import java.lang.*;
public class Main {

    public static void main(String[] args) {
        int[][] heights = {{1,2,2,3,5},{3,2,3,4,4},{2,4,5,3,1},{6,7,1,4,5},{5,1,1,2,4}};
        Problem417 slu = new Problem417();
        System.out.println(slu.pacificAtlantic(heights));
    }
}