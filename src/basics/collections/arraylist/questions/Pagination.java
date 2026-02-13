package basics.collections.arraylist.questions;

import java.util.ArrayList;
import java.util.List;

public class Pagination {
    public static <T> List<T> paginate(List<T> list, int pageSize, int pageNumber){
        int startIndex = pageSize * (pageNumber - 1);
        int lastIndex = startIndex + pageSize;

        if(startIndex < list.size() && lastIndex <= list.size()) {
            return new ArrayList<>(list.subList(startIndex, lastIndex));
        }
        if(startIndex < list.size()){
            return new ArrayList<>(list.subList(startIndex, list.size()));
        }
        return List.of();
    }

    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>(List.of(21, 3, 4, 4, 6, 3, 1));
       // System.out.println(list.size());
       // System.out.println(paginate(list, 2, 4));
        System.out.println(list.subList(2, 7));
    }
}
