//Lab6 Luis Gutierrez 2-15-2019

public class Lab6{
    public static void main(String[] args) {
        
        Car myCar = new Car("Toyota", "Camry",2017);

        System.out.printf("The Brand is: %s\nThe Model is: %s\nThe Year is: %d", 
                            myCar.getModel(), myCar.getModel(), myCar.getYear());

    }
}