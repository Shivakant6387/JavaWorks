package Quik7;

import java.util.List;

class A{

}
class B extends A{
    abstract  class Super {
        abstract List<A>get()throws IndexOutOfBoundsException;
    }
    class sub extends Super{
        List<A>get()throws IndexOutOfBoundsException{
            return  null;
        }
    }
}
public class Test4 {
    public static void main(String[] args) {
    A n=new B();
    }
}
