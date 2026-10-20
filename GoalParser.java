import java.util.Scanner;

public class GoalParser {
    static String interpret(String command){
        char[] ch = command.toCharArray();
        StringBuilder result = new StringBuilder();
        int i = 0;
        while(i < command.length()){
            if(ch[i] == 'G'){
                result.append('G');
                i++;
            }
            else if(ch[i+1] == ')'){
                result.append('o');
                i+=2;
            }
            else{
                result.append("al");
                i+=4;
            }
        }
        return new String(result);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String Command = sc.nextLine();
        String Result = interpret(Command);
        System.out.println(Result);
        sc.close();
    }
}