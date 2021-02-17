package hybrid.inheritance;
interface A {
    public void methodA();
}
interface B extends A {
    public void methodB();
}
interface C extends A {
    public void methodC();
}
class HybridInheritance implements B, C {
    public void methodA() {
        System.out.println("Calling method A......");
    
    }
    public void methodB() {
        System.out.println("Calling method B......");
    }
    public void methodC() {
        System.out.println("Calling method C......");
    }
    public static void main(String args[]) {
        HybridInheritance obj = new HybridInheritance();
        obj.methodA();
        obj.methodB();
        obj.methodC();
    }
}
