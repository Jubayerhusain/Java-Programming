import java.util.Scanner;

public class Switch_grade {
    public static void main(String[] args) {
        // int mark=70;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Your Grade: ");
        int mark=sc.nextInt();
        String grade;
        switch (mark/10) {
            case 10:
            case 9:
            case 8:
                grade="A+";                
                break;
                
            case 7:
                grade="A";                
                break;
                
            case 6:
                grade="A-";                
                break;
                
            case 5:
                grade="B";                
                break;
                
            case 4:
                grade="C";                
                break;
        
            default:
                grade="Fail";
                break;
        }
        System.out.println("The Student Grade Is: "+grade);
        sc.close();
    }
}
