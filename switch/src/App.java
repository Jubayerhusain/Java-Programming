public class App {
    public static void main(String[] args) throws Exception {
        int mark=30;
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
                grade="b";
                break;
            
            case 4:
                grade="c";
                break;
            
            default:
            grade="Fail";
        }
        System.out.println("The Student Grade is "+grade);
    }
}
