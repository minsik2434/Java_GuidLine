package generic.list_rather_than_array;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //런타임 오류
//        Object[] objectArray = new Long[1];
//        objectArray[0] = "타입이 달라 넣을 수 없다";
//
//        //컴파일 오류
//        List<Object> ol = new ArrayList<Long>();
//        ol.add("타입이 달라 넣을 수 없다");

//        List<String>[] stringLists = new List<String>[1];
//        List<Integer> intLists = List.of(42);
//        Object[] objects = stringLists;
//        objects[0] = intLists;
//        String s = stringLists[0].get(0);
    }
}
