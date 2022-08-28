public class SuperClass {
    int i;
    SuperClass(){
        System.out.println("SuperClass 启动！");
    }
    SuperClass(int i){
        this.i=i;
        System.out.println("SuperClass 启动！ i="+i);
    }
}
