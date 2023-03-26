
import java.util.Scanner;
public class Armstrong_Number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the num:");
        String num=sc.next();
        int power=num.length();
        boolean ans=isArmstrong(Integer.parseInt(num),power);
        System.out.println(ans);
    }
    static boolean isArmstrong(int n,int power){
        int rem,sum=0;
        int copy=n;
        while (copy>0){
            rem=copy%10;
            copy=copy/10;
            sum=(int)(sum+Math.pow(rem,power));
        }
        return sum==n;
    }
}
