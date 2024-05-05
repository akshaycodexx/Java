class calculator{

public int add(int num1,int num2){
   int r=num1+num2;
   return r;
}

}

public class second {
    public static void main(String[] args) {
        int num1=2;
        int num2=6;
calculator calc=new calculator();
int result=calc.add(num1,num2);
System.out.println(result);



    }
}
