public class Animal {
    String name;
    int id;



    public  Animal(String name,int id){
        this.name = name;
        this.id = id;

    }

    public Animal() {

    }

    public void Animaleat(){
        System.out.println("大家好 我是"+id+"号"+"Animal"+"我在吃东西");
    }
}
