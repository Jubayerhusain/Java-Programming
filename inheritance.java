class student{ //super class=student
    int roll;
    String name;
}
class result extends student{
    void getData(){
        name="jahid";
        roll=26165;
    }
    void display(){
        System.out.println(name);
        System.out.println(roll);
    }
}
//create object of result
public class inheritance {
    public static void main(String[] args) {
        result luna=new result();
        luna.getData();
        luna.display();
    }
}
