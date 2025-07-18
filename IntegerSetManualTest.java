
public class IntegerSetManualTest {
    public static void main(String[] args) {
        IntegerSet a = new IntegerSet();
    
        a.add(50);
        String test = "[50]";   
        if (a.toString().equals(test)) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
        a.add(70);
        test = "[50, 70]";   
        if (a.toString().equals(test)) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
        a.add(80);
        test = "[50, 70, 80]";  
        if (a.toString().equals(test)) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
        a.remove(80);
        test = "[50, 70]";  
        if (a.toString().equals(test)) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail don't have this to remove");
        }
        
        if (a.contains(70)) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
        
        
    }
}
