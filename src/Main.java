import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        while(in.hasNext()){
            int a=in.nextInt();
            int t=0;
            for(int i=1;i<=a;i++){
                if(i%1000==0){
                    t+=3;
                    continue;
                }
                if(i%100==0){
                    t+=2;
                    continue;
                }
                if(i%5==0){
                    t++;
                }
            }

            System.out.println(t);

        }
    }
}