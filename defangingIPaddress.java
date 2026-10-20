import java.util.Scanner;

public class defangingIPaddress {
    static String defanging(String address){
        char[] ch = address.toCharArray();
        StringBuilder result = new StringBuilder();
        for(int i = 0;i < ch.length; i++){
            if(ch[i] == '.'){
                result.append("[.]");
            }else{
                result.append(ch[i]);
            }
        }
        return new String(result);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String IPaddress = sc.nextLine();
        String Result = defanging(IPaddress);
        System.out.println(Result);
        sc.close();
    }
}
