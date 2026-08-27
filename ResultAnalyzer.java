import java.util.Scanner;
public class ResultAnalyzer{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your  Name:");
        String Name =sc.nextLine();
        System.out.println("Enter the Marks Of First Subject:");
        Float m1 = sc.nextFloat();
        System.out.println("Enter the Marks Of Second Subject:");
        Float m2 = sc.nextFloat();
        System.out.println("Enter the Marks Of Third Subject:");
        Float m3 = sc.nextFloat();
        Float Total =m1+m2+m3;
        Float Average = Total / 3;
        boolean Passed = m1 >= 35 && m2 >= 35 && m3 >= 35;
        boolean Distinction = Passed && Average >= 75;
        boolean SpecialAward = Passed && Average >= 95;
        System.out.println("Name: " + Name);
        System.out.println("Subject 1: " + m1);
        System.out.println("Subject 2: " + m2);
        System.out.println("Subject 3: " + m3);
        System.out.println("Total Marks: " + Total);
        System.out.println("Average: " + Average);
        if(Passed){
            System.out.println( "Passed");
        }
        else{
            System.out.println( "Failed");
        }
        if(Distinction){
            System.out.println("Distinction : Yes");
        }else{
            System.out.println("Distinction : No");
        }
        if(SpecialAward){
            System.out.println("Special Award : Yes");
        }else{
            System.out.println("Special Award : No");
        }
        sc.close();
    }
}