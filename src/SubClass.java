public class SubClass extends SuperClass{
    int i;
    SubClass(){
        System.out.println("SubClass启动！");
    }

    SubClass(int i){
        super(300);
        this.i =i;
        System.out.println("SubClass启动！+"+i);
    }
}
