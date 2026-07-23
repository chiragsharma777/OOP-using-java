abstract class car{
    abstract void carstart();


void carrun(){
    System.out.println("car is running");
}
}

class Supercar extends car{
    void carstart(){
System.out.println("Car is running");
    }
}
public class Abstract{
    public static void main(String[] args) {
        
        Supercar s = new Supercar();

        s.carstart();
        s.carrun();
    }

}

