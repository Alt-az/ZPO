import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new FileInputStream("english.200MB"), StandardCharsets.UTF_8);
        List<String> singleWords=new ArrayList<>();
        List<String> twoWords=new ArrayList<>();
        int i=0;
        String tmpWord = null;
        while(sc.hasNext()){
            String tmp=sc.next();
            tmp=tmp.replaceAll("[^a-zA-Z]", "");
            tmp=tmp.toLowerCase(Locale.ROOT);
            if(tmp.length()>=3) {
                if(i%2!=0){
                    tmpWord=tmp;
                }
                else {
                    twoWords.add(tmpWord+" "+tmp);
                }
                singleWords.add(tmp);
            }
            i++;
        }
//        HashMap<String, List<String>> anagramy=AnagramFinder.anagramFind(singleWords);
//        for(String key:anagramy.keySet()){
//            for(String anagra:anagramy.get(key)){
//                System.out.print(anagra+',');
//            }
//            System.out.println();
//        }
//        HashMap<String, List<String>> anagramyTwoWords=AnagramFinder.anagramFind(twoWords);
//        for(String key:anagramyTwoWords.keySet()){
//            for(String anagra:anagramyTwoWords.get(key)){
//                System.out.print(anagra+',');
//            }
//            System.out.println();
//        }
        List<String> mixedWords = new ArrayList<>(singleWords);
        mixedWords.addAll(twoWords);
        HashMap<String, List<String>> anagramyMixedWords=AnagramFinder.anagramFind(mixedWords);
        for(String key:anagramyMixedWords.keySet()){
            for(String anagra:anagramyMixedWords.get(key)){
                System.out.print(anagra+',');
            }
            System.out.println();
        }
    }
}