package templateMethod.basic;

public abstract class AbstractClass {

     abstract void method1();
     abstract void method2();

     public final void templateMethod(){
         System.out.println("Template Method");
     }

    public void templateMethod2(){
        System.out.println("Template Method2");
    }
}
