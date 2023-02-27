import java.util.Scanner;
public class fact {
    
    public static void main(String args[]){
        int fact=1;
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        for(int i=1;i<=a;i++)
        {
            fact=fact*i;
            //if(fact<=a){
                if(fact==a){
                    System.out.println(i);
                    //System.out.println(fact);
                    break;
                }
                /*else{
                    System.out.println("again enter");*/

                }
            }
        }
