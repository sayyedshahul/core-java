package basics.arrays;

class Student{
    int marks;
    String name;
    int rollno;
}

public class ArrayOfObjects {
    public static void main(String[] args){
        Student s1 = new Student();
        s1.name = "Salim";
        s1.rollno = 34;
        s1.marks = 79;

        Student s2 = new Student();
        s2.name = "Rahul";
        s2.rollno = 31;
        s2.marks = 87;

        Student s3 = new Student();
        s3.name = "Mukesh";
        s3.rollno = 19;
        s3.marks = 67;

        Student[] students = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;
        
        for(Student s: students){
            System.out.println(s.rollno + " - " + s.name + " : " + s.marks);
        }
    }
}
