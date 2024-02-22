package src.Basics_05;

public class Programming {

    int version;
    String author;

    Programming(){
        System.out.println("Program Default");
    }

    Programming(String author, int version){
        this.author = author;
        this.version = version;
    }

    void printInfo(){
        System.out.println("Program info = " + this.version + " Author " + this.author);
    }

    void car(){
        System.out.println("Lamborghini");
    }

    void home(){
        System.out.println("3BHK flat");
    }



}
