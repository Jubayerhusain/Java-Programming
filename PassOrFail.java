import java.util.Scanner;

public class PassOrFail {
    public static void main(String[] args) {
        Scanner mark=new Scanner(System.in);
        System.out.print("Enter Your Number: ");
        int number=mark.nextInt();
        if (number>=40 && number<=100) {
            System.out.println("Passed");
        }
        else if(number>100){
            System.out.println("Worng Input");
        }
        else{
            System.out.println("Fail");
        }
        mark.close();
    }
}
