package src.Basics_05;

public class Java extends Programming{

    String newFeature;

    Java(){
        System.out.println("Java default");
    }

    Java(String feature){
        this.newFeature = feature;

    }

    void printnewinfo(){
        System.out.println("New features is = " + this.newFeature);
    }

}
