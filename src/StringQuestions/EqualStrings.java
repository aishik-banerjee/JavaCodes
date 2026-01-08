package StringQuestions;

public class EqualStrings {

    public static void main(String[] args) {
        String[] word1 = {"ab","c"};
        String[] word2 = {"a","bc"};
        System.out.println(arrayStringsAreEqual(word1, word2));
        
    }

    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String wordOne = "";
        String wordTwo = "";
        for(int i = 0 ; i < word1.length ; i++){
            wordOne+=word1[i];
        }
        for(int i = 0 ; i < word2.length ; i++){
            wordTwo+=word2[i];
        }
        return wordOne.equals(wordTwo);
    }
    
}
