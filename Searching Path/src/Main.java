import java.util.List;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Problem127 slu = new Problem127();
        String beginword = "hit";
        String endword = "cog";
        List<String> wordList = Arrays.asList("hot","dot","dog","lot","log","cog");
        System.out.println(slu.ladderLength(beginword, endword, wordList));

    }
}