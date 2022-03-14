package class_6;

public class MyEncapsulation {
    public static void main(String[] args) {
        Shirt shirt = new Shirt();
        Shirt shirt1 = new Shirt();
        shirt.setBrand("Rich Man");
        shirt1.setBrand("CatsEye");
        System.out.println(shirt.getBrand());
        System.out.println(shirt1.getBrand());

    }
}

class Shirt {
    private String brand;
    private String color;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    private String size;
}
