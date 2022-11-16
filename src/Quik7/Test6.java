package Quik7;
enum Flags{
    TRUE,FALSE;
    Flags(){
        System.out.println("Hello");
    }
}
public class Test6 {
    public static void main(String[] args) {
        try{
            Flags flags= (Flags) Flags.valueOf("name");
        }
        catch (Exception e){
            System.out.println(e);
        }

//        for(Flags s:Flags.values()){
//            System.out.println(s);
//        }
    }
}
