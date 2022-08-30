package TestEnum;
enum Color{
    RED , BLUE , GREEN
}

public class Test01 {
    public static void main(String[] args) {
        //Color [] arr = Color.values();

        for(Color col : Color.values()){
            System.out.println(col + " of index :"+col.ordinal());
            System.out.println(Color.valueOf("RED"));
        }

    }
}
