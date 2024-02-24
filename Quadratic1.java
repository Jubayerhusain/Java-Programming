import java.util.Scanner;

public class Quadratic1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double a,b,c,d,x1,x2,x ;
        System.out.println("Enter A: ");
        a=sc.nextInt();///21

        System.out.println("Enter B: ");
        b=sc.nextInt();

        System.out.println("Enter C: ");
        c=sc.nextInt();

        d=(b*b)-(4*a*c);

        if (d>0) {
            x1=(-b+Math.sqrt(d)/2*a);
            x2=(-b-Math.sqrt(d)/2*a);
            System.out.println(x1 + x2);
        }
        else if (d==0) {
            x=-b/2*a;
            System.out.println(x);
        }
        else{
            System.out.println("The root are not possible..");
        }
        sc.close();
    }
}
