import java.util.Scanner;
public class CommonPrefix {
    static String longestCommonPrefix(String[] strs){
        if(strs == null || strs.length == 0){
            return "";
        }
        String prefix = strs[0];
        for(int i =  1; i < strs.length; i++){
            while(strs[i].indexOf(prefix) != 0){
                prefix = prefix.substring(0,prefix.length()-1);
                if(prefix.isEmpty()){
                    return "";
                }
            }
        }
        return prefix;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int size = sc.nextInt();
        sc.nextLine();
        String[] strs = new String[size];
        System.out.println("Enter the String Array:");
        for(int i = 0; i < strs.length; i++ ){
            strs[i] = sc.nextLine();
        }
        String pre = longestCommonPrefix(strs);
        System.out.println("The Lonest Common Prefix:" + pre);
        sc.close();
    }
}
