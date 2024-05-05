class A{
public void show1(){
    System.out.println("in A Show");
}
};
class B extends A{
public void show2(){
    System.out.println("in B show");
}
};

public class DownCasting_UpCasting {
   public static void main(String[] args) {
    A obj =(A)new B(); //Upcasting
    obj.show1();
    B obj1=(B)obj; //DownCasting
    obj1.show2();
   }
    
}
