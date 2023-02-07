import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class AnagramFinder {
    static char[] alphabet="abcdefghijklmnopqrstuvwxyz".toCharArray();
    public static String countCharacters(String word){
        char[] chars=word.toCharArray();
        int[] result=new int[alphabet.length];
        for(char x:chars){
            for(int i=0;i<alphabet.length;i++){
                if(x==alphabet[i]){
                    result[i]++;
                }
            }
        }
        return Arrays.toString(result);
    }
    public static HashMap<String,List<String>> anagramFind(List<String> words){
        HashMap<String,List<String>> anagrams=new HashMap<>();
        String word;
        String newkey;
        for(String k: words){
            word=k;
            newkey=countCharacters(word);
            if(!anagrams.containsKey(newkey)){
                List<String> anagram=new ArrayList<>();
                anagram.add(word);
                anagrams.put(newkey,anagram);
            }
            else{
                if(!anagrams.get(newkey).contains(word)){
                    anagrams.get(newkey).add(word);
                }
            }
        }
        anagrams.values().removeIf(anag->anag.size()==1);
        return anagrams;
    }
}
