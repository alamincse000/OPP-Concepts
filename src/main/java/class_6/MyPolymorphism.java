package class_6;

public class MyPolymorphism {
    public static void main(String[] args) {
        Birds birds = new Parrot();
        birds.canTalk();

    }
}
class Birds {
    public void canTalk(){
        System.out.println("Birds can't talk ");
    }


}
class Parrot extends Birds{
    public void canTalk(){
        System.out.println("can talk");
    }
}