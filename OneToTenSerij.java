import java.util.Scanner;

public class OneToTenSerij {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n ,sum, i;

        System.out.print("Enter Your Number: ");
        n=sc.nextInt();

        sum=0;
        for(i=0; i<=n; i++){///0+1+2+3+4+5+6+7+8+9
            sum=sum+i;
        }
        System.out.println(sum);
        sc.close();
    }
}
