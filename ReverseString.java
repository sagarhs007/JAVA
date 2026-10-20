import java.util.Scanner;

public class ReverseString {
    public static String reverseString(String s){
        char[] c = s.toCharArray();
        int left = 0;
        int right = c.length - 1;
        while(left < right){
            char temp = c[left];
            c[left] = c[right];
            c[right] = temp ;
            left++;
            right--;
        }
        return new String(c);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String s = sc.nextLine();
        String c = reverseString(s);
        System.out.println(c);
        sc.close();
    }
}
