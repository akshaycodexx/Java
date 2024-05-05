class Human{

    private int age;
    private String name;
    
    public Human(){
        System.out.println("The Defalult constractor was called");
    }
    public Human(int age,String name){
        System.out.println("parametrised constractor was called");
    }
}
public class Constractor {
    public static void main(String[] args) {
        Human obj1=new Human();
        Human obj2=new Human(12,"Akshay");
        

    }
}
