import java.util.Scanner;

public class Quadratic {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double a,b,c,d;
        System.out.print("Enter The 1st Number: ");
        a=sc.nextDouble();
        System.out.print("Enter The 2nd Number: ");
        b=sc.nextDouble();
        System.out.print("Enter The 3rd Number: ");
        c=sc.nextDouble();
        d=((b*b)-(4*a*c));
        if (d>0) {
            double r1=(-b+Math.sqrt(d)/2*a);
            double r2=(-b-Math.sqrt(d)/2*a);
            System.out.println("the root are"+r1+"and"+r2);
        }
        else if (d==0) {
            double r=(-b/2*a);
            System.out.println("The root are"+r);
        }
        else{
            System.out.println("The root are not possible");
        }
        sc.close();
    }
}
