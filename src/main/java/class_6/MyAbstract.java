package class_6;

public class MyAbstract {
    public static void main(String[] args) {

      Food food =new Food() {
          @Override
          public void cookFood() {
              System.out.println("I am hungry");

          }
      };
      food.cookFood();

    }

}

abstract class Food {
    abstract public void cookFood();

}

class Biriyani extends Food {
    public void cookFood() {
        System.out.println("Cooking Biriyani");
    }
}

class Khicuri extends Food {
    public void cookFood() {
        System.out.println("Cooking Khicuri");
    }
}
