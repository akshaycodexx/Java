enum Laptop{
    macbook(50000),Xps(40000),Surface(12000),Thinpad(80000);
    private int price;

    private Laptop (int price){
        this.price=price;
    }
    public int getprice(){
        return price;
    }
    public void setPrice(int price){
        this.price=price;
    }
   
}


public class enumclass {
    public static void main(String[] args) {
        // Laptop lap=Laptop.macbook;
        // System.out.println(lap);
        
        for(Laptop lap:Laptop.values()){
            System.out.println(lap + " : "+lap.getprice());
            
        }
    }
}
