import java.util.Scanner;

public class if_elseif {
    public static void main(String[] args) {
        Scanner age=new Scanner(System.in);
        System.out.print("Enter The Age: ");
        int number=age.nextInt();
        if (number==18) {
            System.out.println("She is Adult...");            
        }
        else if (number<18) {
            System.out.println("She Is Sweat Sixten...");
        }
        else{
            System.out.println("She Is Young Girl...");
        }
        age.close();
    }

}
