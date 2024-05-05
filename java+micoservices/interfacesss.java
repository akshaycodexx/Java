//type of interface 
//1-Normal,Functional,Manner
// funtional interface :- is a interface which has only one method
@FunctionalInterface
interface A{
    void add(int i,int j);
    
}
// class B implements A{
//     public void show(){
//         System.out.println("in show");
//     }
// }
public class interfacesss {
    public static void main(String[] args) {
    //     A obj = new A() {
    //         public void show() {
    //             System.out.println("in Show");
    //         }
    //     };
    //     obj.show(); // Now calling show method inside main method
    // }

    A obj=(int i,int j)->{
       System.out.println("sum "+ (i+j));
    };
    obj.add(6,7);




    }

}
