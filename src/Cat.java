public class Cat extends Animal{
    void eat(){
        System.out.println("大家好 我是"+id+"号"+name+"我在吃东西");
    }


    public Cat(String name, int id) {
        super(name, id);
    }
    public Cat(){
        super();

    }

    public static void main(String[] args) {
        Cat tom = new Cat();
        tom.id = 1;
        tom.name = "汤姆";
        tom.eat();
        tom.Animaleat();
    }
}






