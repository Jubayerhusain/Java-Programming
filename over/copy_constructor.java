package over;

class student{
    String name;
    int roll;

    student(String n, int r){
        name=n;
        roll=r;
    }
    student(student s){
        name=s.name;
        roll=s.roll;
    }
    void display(){
        System.out.println(name);
        System.out.println(roll);
    }
}

public class copy_constructor {
    public static void main(String[] args) {
        student s1=new student("Jubayer",602813);
        s1.display();
        
        student s2=new student(s1);
        s2.display();

        student s3=new student(s1);
        s3.display();
    }
}
