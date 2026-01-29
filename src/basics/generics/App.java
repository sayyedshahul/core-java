package basics.generics;

class Box<T> {
    private T value;

    public T getValue(){
        return value;
    }

    public void setValue(T value){
        this.value = value;
    }
}

public class App {
    public static void main(String[] args){
        Box<String> box = new Box<>();
        box.setValue("name");
        System.out.println(box.getValue());

        Box anotherBox = box;
        anotherBox.setValue(100);
      //  System.out.println(box.getValue()); This is getting an error because implicitly the statement is (String)box.getValue()

        String s = "hello";
        System.out.println(s.getClass().getName());

    }
}
