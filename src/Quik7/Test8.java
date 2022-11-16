package Quik7;
interface Rideable{
    void ride(String name);
}
class Animal{}
class Horse extends Animal implements Rideable{
    public void ride (String name){
        System.out.println(name.toUpperCase()+"IS RIDING BICYCLE HORSE ");
    }
}
public class Test8 {
    public static void main(String[] args) {
      Animal horse=new Horse();
        ((Horse)horse).ride("Pramod");

    }
}
