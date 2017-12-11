package taozi.kotlin.chapter3.innerclass;

class OutClassJava{
    int a = 1;
    //默认的是内部类
    class Inner{
         int a = 3;
        public void hello(){
            //
            System.out.println("外部类的成员:" + OutClassJava.this.a);
        }
    }
}

public class InnerClassJava {
    public static void main(String... args){
        //静态内部类创建
        //        OutClassJava.Inner inner = new OutClassJava.Inner();
        OutClassJava.Inner inner = new OutClassJava().new Inner();
        inner.hello();

    }
}
