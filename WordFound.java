public class WordFound {
    int mostWordsFound(String[] sentences) {
        int maxWord =0;
        for(String sentence : sentences){
           int space =0;
           for(char ch : sentence.toCharArray()){
            if(ch==' '){
                space++;
            }
           }
           String[] words =  sentence.split("\\s+");
           int word = words.length;
           if(word > maxWord){
            maxWord=word;
           } 
        }
        return maxWord;
    }
}
