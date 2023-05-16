public class Static {
   static int staticVariable = 10;

   static {
       System.out.println("This is static bloccleak");
       staticVariable = 20;
   }
   static void staticMethod(){
       System.out.println("This is static method");
       System.out.println("Static variable value:" + staticVariable);
   }

    public static void main(String[] args) {
        System.out.println("Static variable value: " + staticVariable);
        staticMethod();
    }
}
