package pl;

public class Anonymousclass {
    public void m1(){
        System.out.println("normal method");
    }
//(){
//        System.out.println("anonymous");
//    }


    public static void main(String[] args) {
        new Anonymousclass().m1();
         

    }
}
