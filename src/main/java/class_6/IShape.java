package class_6;

public interface IShape {
    public void drawShape();
}
class Rectangle implements IShape{
    public void drawShape(){
        System.out.println("Drawing Wall");
    }
}
class Circle implements IShape{
    public void drawShape(){
        System.out.println("Drawing circle");
    }
}
class TestInterFace{
    public static void main(String[] args) {
      IShape rectangle =new Rectangle();
      rectangle.drawShape();

    }
}
