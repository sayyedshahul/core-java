package basics.oop.encapsulation;

import java.util.Arrays;

/*
private protects the reference, not the object; returning mutable internal objects allows external
code to modify state and breaks encapsulation unless defensive copying or unmodifiable views are
used.
 */

public class Student {
    private String[] courses;
    private String name;

    public String[] getCourses(){
        //return courses; this would break encapsulation indirectly.
        return Arrays.copyOf(courses, courses.length);
    }

    public String getName(){
        return name;
    }

    public void setCourses(String[] courses){
        //this.courses = courses; this would break encapsulation indirectly.
        this.courses = Arrays.copyOf(courses, courses.length);
    }

    public void setName(String name){
        this.name = name;
    }
}
