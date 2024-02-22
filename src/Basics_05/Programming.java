package src.Basics_05;

public class Programming {

    int version;
    String author;

    Programming(){
        System.out.println("Default");
    }

    Programming(String author, int version){
        this.author = author;
        this.version = version;
    }

    void printInfo(){
        System.out.println("Program info = " + this.version + "Author" + this.author);
    }



}
