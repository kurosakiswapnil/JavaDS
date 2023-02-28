package pl;

@FunctionalInterface//it is not mandatory it can be removed
public interface MyFunctionalInterfacec {

    void m1();//abstract method with no body and it can only
                // be one in functional interfaec

    static void m2(){
        System.out.println("static method");
    }
    default void m3(){
        System.out.println("default mmethod");
    }


}
