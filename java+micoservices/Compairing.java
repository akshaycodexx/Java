class laptop{
    String model;
    int price;
    public String toString(){
        return model + " : "+ price;
    }
    public boolean equal(laptop that){
        if(this.model.equals(that.model) && this.price==that.price){
            return true;
        }else{
            return false;
        }
    }
}

public class Compairing {
    public static void main(String[] args) {
        laptop obj1=new laptop();
        obj1.model="HP";
        obj1.price=550000;

        laptop obj2=new laptop();
        obj2.model="HP";
        obj2.price=550000;
        boolean result=obj1.equal(obj2);
        if(result){
            System.out.println("yes both laptops are eqal");
        }else{
            System.out.println("No , both laptops are not equal");
        }

    }
}
