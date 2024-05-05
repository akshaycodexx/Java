//first of all interface on java "Interface is not a class but its show a template like classn
// this is usd for implimenting abstract"

interface A {
    
    void show();
    void config();
    //if you create a class B than we have to declare a both the method
    //if one method is missing so ,the class B automatically converted into interface
}
class B implements A{
public void show(){
System.out.println("B in show");
}
public void config(){

System.out.println("in config");
}
}

public class interfacess {
    public static void main(String[] args) {
        A obj ;
        obj=new B();
        obj.show();
        obj.config();
    }
}
