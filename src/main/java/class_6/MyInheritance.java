package class_6;

public class MyInheritance {
    public static void main(String[] args) {
     student rahim =new student();
     rahim.doStudy();
     rahim.doJobs();
    }
}

class Human {
    public void doStudy() {
        System.out.println("Do this study");

    }

    public void doJobs() {
        System.out.println("Do this jobs");
    }
}

class student extends Human {

}

class employee extends Human {

}
