package basics.generics.animals;

import java.util.ArrayList;
import java.util.List;

class A<T>{
    public void showObject(T object){
        System.out.println(object);
    }

    public List<?> show(List<?> object){
        System.out.println(object);
        return object;
    }

    public  static void show2(Object obj){
        System.out.println(obj);
        //return object;
    }
}

public class Test {
    public static void main(String[] args){
        Integer intNum = 3;
        Double doubNum = 3.5;
        List<Integer> intNumList = new ArrayList<>();

        intNumList.add(intNum);
        //intNumList.add(doubNum);
    }
}
