import java.util.Scanner;

public class StringArrayEquivalent {
    static boolean stringArray(String[] w1, String[] w2){
        StringBuilder s1 = new StringBuilder();
        StringBuilder s2 = new StringBuilder();
        for(String w: w1){
            s1.append(w);
        }
        for(String w : w2){
            s2.append(w);
        }
        return s1.toString().equals(s2.toString());
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size:");
        int size = sc.nextInt();
        sc.nextLine();
        String[] s1 = new String[size];
        for(int i = 0; i < s1.length; i++ ){
            s1[i] = sc.nextLine();
        }
        System.out.println("Enter the Size:");
        int n = sc.nextInt();
        sc.nextLine();
        String[] s2 = new String[n];
        for(int i = 0; i < s2.length; i++ ){
            s2[i] = sc.nextLine();
        }
        boolean op = stringArray(s1, s2);
        System.out.println(op);
        sc.close();
    }
}
