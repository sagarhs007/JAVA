import java.util.Scanner;

public class DigitCounter {
    public static int countDigits(int num){
        String text = Integer.toString(num);
        int count = 0;
        for(int i = 0;i<text.length();i++){
            char ch = text.charAt(i);
            int digit = ch - '0';
            if(digit != 0 && num % digit == 0){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] agrs){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number:");
        int num = sc.nextInt();
        int count = countDigits(num);
        System.out.println(count);
        sc.close();
    }
}
