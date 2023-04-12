class Vehicle{
    protected String brand = "Ferrari";
    public void honk(){
        System.out.println("Tooonn");
    }
}

public class Car extends Vehicle{
    int wheel = 4;

    public void pubFuncCar(){
        System.out.println("roda roda roda");
        Car myObj = new Car();
        myObj.honk();
    }

    public static void main(String[] args){
        System.out.println("car");
        Car myObj = new Car();
        System.out.println(myObj);
        myObj.honk();
        System.out.println("The brand : " + myObj.brand);
    }
}