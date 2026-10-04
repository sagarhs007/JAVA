import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args){
        int rev=0,num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        num = sc.nextInt();
        int x = num ;
        while(num!=0){
            rev = rev * 10 + num % 10;
            num = num/10;
        }
        if(rev==x)
            System.out.println("TRUE");
        else
            System.out.println("FALSE");
        sc.close();
    }
}
