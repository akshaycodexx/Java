class Human{
    
    private String name;
    private int age;
    public Human(){  // normal constractor is also called Default constractor
        System.out.println("i am in constractor");
    }
    // can a constractor take a two prameter :concept of method overloading

    public Human(int age, String name){
       this.age=age;
       this.name=name;

    }
    public int getAge(){
        return age;
    }
    public void setage(int a){
        age=a;
    }
    public String getname(){
        return name;
    }
    public void setname(String n){
       name=n;
    }
};

public class incaplation {
    public static void main(String args[]){
       Human Akshay =new Human();
       Human obj1 =new Human(12,"Anubhaw");
        // Akshay.name="Akshay";
        // Akshay.age=12;
        Akshay.setage(23);
        Akshay.setname("Raju_kumar");
        System.out.println(Akshay.getAge() + " : " +Akshay.getname());
        System.out.println(obj1.getAge() + " : " +obj1.getname());
    }
}
