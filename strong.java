import java.util.Scanner;
public class strong {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int temp;
        int sum=0;
        for(int i=0;a>0;a=a/10){
            int fact=1;
            temp=a%10;
            for(int j=1;j<temp;j++){
                fact=fact*j;
            }
            sum=sum+fact;
            

        }
        if(a==sum){
            System.out.println("strong");
        }
    }
}
