package basics.oop.encapsulation;

import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        Student st = new Student();
        String[] courses = {"Maths", "Physics", "Chemistry"};
        st.setCourses(courses);
        System.out.println(Arrays.toString(st.getCourses()));
    }
}
