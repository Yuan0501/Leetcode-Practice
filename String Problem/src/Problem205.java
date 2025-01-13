public class Problem205 {
    public boolean isIsomorphic(String s, String t){
        int[] Indexs = new int[256];
        int[] Indext = new int[256];
        for(int i = 0; i < s.length();i++){
            char ps = s.charAt(i);
            char pt = t.charAt(i);
            if(Indexs[ps] != Indext[pt]){
                return false;
            }
            Indexs[ps] = i + 1;
            Indext[pt] = i + 1;
        }
        return true;
    }
}
