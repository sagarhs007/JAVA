import java.util.Scanner;
public class ZeroSteps {
    public  static int numberOfSteps(int num){
        int steps = 0;
        while (num > 0) {
            if (num % 2 == 0) {
                num = num / 2;
            } else {
                num = num - 1;
            }
            steps++;
        }
        return steps;
    }
}
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int count = ZeroSteps.numberOfSteps(n);
    System.out.println(count);
    sc.close();
}