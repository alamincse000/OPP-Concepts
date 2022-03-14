package class_6;

public class MyProduct {
    public static void main(String[] args) {
        Product shirt = new Product(15);
        int price = shirt.getPrice(110, 10);
        System.out.println(price);

    }
}

class Product{
    public int vat;
        public Product(int vat){
            this.vat =vat;
        }

    int discountPrice, grossPrice;
    public int getPrice(int price,int discount){
        discountPrice = (price - (price*discount)/100);
        grossPrice =(discountPrice + (discountPrice*vat)/100);
        return grossPrice;
    }
}
