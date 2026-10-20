import java.util.Scanner;

public class ToLowerCase {
    static String toLower(String s){
        char[] ch = s.toCharArray();
        StringBuilder result = new StringBuilder();
        for(int i = 0;i < ch.length;i++){
            if(ch[i] >= 'A' && ch[i] <= 'Z'){
                ch[i] = (char)(ch[i] + ('a' - 'A'));
            }
            result.append(ch[i]);
        }
        return new String(result);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        String Result = toLower(word);
        System.out.println(Result);
        sc.close();
    }
}
