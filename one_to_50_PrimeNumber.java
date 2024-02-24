import java.util.Scanner;

public class one_to_50_PrimeNumber {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Give The Number=");
        int number=input.nextInt();
        int count;
        for(int i=1; i<=number;i++){
            count=0;

            for(int j=2; j<=i/2;  j++){
                if (i%j==0) {
                    count++;
                    break;
                }
            }
            if (count==0) {
                System.out.println(i);
            }
        }
        input.close();
    }
}
