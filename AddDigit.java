import java.util.Scanner;
public class AddDigit {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Enter the Number:");
        num = sc.nextInt();
        while(num>=10){
            int sum =0;
            while(num>0){
            sum=sum + (num%10);
            num = num/10;
            }
            num = sum;
        }
        System.out.println(num);
        sc.close();
    } 
}
