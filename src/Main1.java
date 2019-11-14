import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        while(in.hasNext()){
            int a=in.nextInt();
            String b=String.valueOf(a);
            for(int i=b.length()-1;i>=0;i--){
                System.out.print(b.charAt(i));
            }
        }
    }
}
