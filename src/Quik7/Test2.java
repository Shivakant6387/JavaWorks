package Quik7;
import java.sql.*;
interface Multiplier{
    void multiply(int... x)throws SQLException;

    }
class Calculator implements Multiplier{
    public void multply(int... x){

    }

    @Override
    public void multiply(int... x) throws SQLException {

    }
}
public class Test2 {
    public static void main(String[] args) {
    try{
        Multiplier obj=new Calculator();
        obj.multiply(1,2,3);
        System.out.println("End of try block");
    }
    catch (SQLException e){
        System.out.println(e+"is nothing");
    }
    }
}
