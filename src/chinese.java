public class chinese {
    public static void main(String[] args) {
        DemoStatic zhangsan =new DemoStatic();
        zhangsan.id=1;
        zhangsan.name="章三";
        System.out.println(zhangsan.name+"的id是"+zhangsan.id+"他的国际是"+zhangsan.guoji);

        DemoStatic lisi =new DemoStatic();
        lisi.id=2;
        lisi.name="李四";
        System.out.println(lisi.name+"的id是"+lisi.id+"他的国籍是"+lisi.guoji);
    }
}
