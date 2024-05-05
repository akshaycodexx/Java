package inheritance;
class A extends add{
    public int add(int a,int b){
        return a+b;
    }
}
public class more {
    A obj =new A();
    obj.add(1,2);
}
