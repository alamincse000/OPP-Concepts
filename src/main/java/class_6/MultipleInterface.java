package class_6;

public interface MultipleInterface {
    public static void main(String[] args) {
        Father look = new Child() ;
        look.LooksLike();
        Mother Behav = new Child();
        Behav.Behavior();

        }
}
interface Father{
    public void LooksLike();
}
interface Mother{
    public void Behavior();
}

class Child implements Father,Mother{
    public void LooksLike(){
        System.out.println("Very very innocent");

    }
    public void Behavior(){
        System.out.println("Very Innocent");
    }

}
