import java.util.Scanner;

public class LastWord {
    static int WordCount(String s){
        char[] c = s.toCharArray();
        int i = c.length - 1;
        while(i >= 0 && c[i]==' '){
            i--;
        }
        int count = 0;
        while(i >= 0 && c[i] != ' '){
            count++;
            i--;
        }
    return count;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Line:");
        String s = sc.nextLine();
        int c = WordCount(s);
        System.out.println(c);
        sc.close();
    }
}
