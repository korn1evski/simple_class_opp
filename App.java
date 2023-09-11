public class App {
    public static void main(String[] args){
        Car ferrari = new Car(1993, "Ferrari SF90 Spider");
        ferrari.printInfo();
    }
}

class Car {
    public int year;
    public String name;


    public Car(int year, String name){
        this.year = year;
        this.name = name;
    }

    public void printInfo(){
        System.out.println(this.name + " appeared in " + this.year);
    }
}