import java.util.Scanner;
public class ReversePrefix {
    static String reversePrefix(String s,char ch){
        int idx = s.indexOf(ch);
        if(idx == -1)
            return s;
        char[] arr = s.toCharArray();
        int left = 0;
        int right = idx;
        while(left<right){
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        return new String(arr);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        char c = sc.next().charAt(0);
        String op = reversePrefix(word, c);
        System.out.println(op);
        sc.close();
    }
}
