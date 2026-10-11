import java.util.Scanner;
public class CommonFactor {
    public static int commonFactor(int a,int b){
        int count = 0;
        int limit = Math.min(a, b);
        for(int i=1;i<limit;i++){
            if(a % i == 0 && b % i==0)
                count++;
        }
        return count;
    }  
}
public static void main(String[] args){
    int a,b;
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter the value of 'a' :");
    a = sc.nextInt();
    System.out.println("Enter the value of 'b' :");
    b = sc.nextInt();
    int Count = CommonFactor.commonFactor(a, b);
    System.out.println(Count);
    sc.close();
}
