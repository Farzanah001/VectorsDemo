import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        //Create a Vector
        Vector<String> v=new Vector<>();
        //Adding elements using add() method of List  
        v.add("Tiger");
        v.add("Lion");
        v.add("Dog");
        v.add("Elephant");
        //Adding elements using addElement() method of Vector  
        v.addElement("Rat");
        v.addElement("Cat");
        v.addElement("Deer");

        System.out.println("Elements are: "+v);
    }
}