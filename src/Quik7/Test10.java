package Quik7;

public class Test10 {
    private static void div(int i ,int j)throws Exception{
        try {
            System.out.println(i/j);
        }
        catch (ArithmeticException e){
            Exception exception=new Exception();
            throw exception;
        }
    }
    public static void main(String[] args) {
        try{
            div(5,0);
        }
        catch (Exception e){
            System.out.println("End");
        }
    }
}
