
/*exception 
Error:
1-Compline time error--- you know the syntatic error
2-Run time polimerphism  ---suddenly delete the file in between and shows error
3-Logical Error--use a mistake in logic
*/
public class exceptionEroor {
    public static void main(String[] args) {
        int i=0;
        int j=0;
        try{
            j=18/i;
        }
        catch(Exception e){
            System.out.println("you cant define i "+e.getMessage());
        }
    }
    
}
