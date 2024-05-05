class A{
    public void show(){
        System.out.println("A class will callled");
    }
}
//this extand is used for inheitance
class B extends A{

}
public class methodOverRidding {
    public static void main(String[] args) {
        B obj1= new B();
        obj1.show();
    }
}
