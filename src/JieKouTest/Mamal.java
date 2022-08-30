package JieKouTest;

public class Mamal implements Animal{

    public  void eat(){
        System.out.println("Mamal eats");
    }

    public void travel(){
        System.out.println("Mamal travle");
    }



    public static void main(String args[]){
        Mamal m = new Mamal();
        m.eat();
        m.travel();
    }
}
