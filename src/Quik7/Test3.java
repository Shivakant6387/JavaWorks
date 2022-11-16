package Quik7;

import java.util.ArrayList;
import java.util.List;

public class Test3 {
    public static void main(String[] args) {
        List<Character>list=new ArrayList<>();
        list.add(0,'E');
        list.add('X');
        list.add(1,'P');
        list.add(3,'O');
        if (list.contains('O')){
            list.remove(3);
        }
        for (char ch:list){
            System.out.println(ch);
        }
    }
}
