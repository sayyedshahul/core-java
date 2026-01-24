package basics.collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args){
//        ArrayList<Character> grid = new ArrayList<>(List.of('1', '2', '3'));
//        ArrayList<Character> grid2 = new ArrayList<>(List.of('4', '5', '6'));
//       // grid.add('4');
//        grid.addAll(0, grid2);
//        System.out.println(grid);

        ArrayList<ArrayList<Character>> grid = new ArrayList<>(List.of(
              new ArrayList<>(List.of('1', '2', '3')),
              new ArrayList<>(List.of('4', '5', '6')),
              new ArrayList<>(List.of('7', '8', '9'))
        ));
        grid.addAll(new ArrayList<>(List.of(new ArrayList<>(List.of('1', '1', '1')))));
        System.out.println(grid);
    }
}
