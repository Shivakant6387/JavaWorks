package com.packages.com;
class Demo1{
    int a=10;
    private int b=20;
    protected int c=30;
    public int d=40;
    public void display(){
        System.out.println(a+b+c+d);
    }

}
public class Test1 {
    public static void main(String[] args) {
        Demo1 b=new Demo1();
        b.display();

    }
}
