package Quik7;
class  Book{
    private String name;
    private  String author;
    Book(){}
    Book(String name,String author){
        this.name=name;
        this.author=author;
    }
    String getName(){
        return name;
    }
    String getAuthor(){
        return author;
    }
}
public class Test9 {
    public static void main(String[] args) {
        Book book=new Book("Head First java","Kathy sierra");
        System.out.println(book.getName());
        System.out.println(book.getAuthor());
    }
}
