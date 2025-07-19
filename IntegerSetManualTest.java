
public class IntegerSetManualTest {
    public static void main(String[] args) {
        IntegerSet a = new IntegerSet();
        //เพิ่มเลข 50 เข้าเซต
        a.add(50);
        String test = "[50]";   
        if (a.toString().equals(test)) {
            System.out.println("Test1 Pass ");
        } else {
            System.out.println("Fail can't add this number");
        }
        //เพิ่มเลข 70 เข้าเซต
        a.add(70);
        test = "[50, 70]";   
        if (a.toString().equals(test)) {
            System.out.println("Test2 Pass");
        } else {
            System.out.println("Fail can't add this number");
        }
        //เพิ่มเลข 80 เข้าเซต
        a.add(80);
        test = "[50, 70, 80]";  
        if (a.toString().equals(test)) {
            System.out.println("Test3 Pass");
        } else {
            System.out.println("Fail can't add this number");
        }
        //ลบเลข 80 ออกจากเซต
        a.remove(80);
        test = "[50, 70]";  
        if (a.toString().equals(test)) {
            System.out.println("Test4 Pass");
        } else {
            System.out.println("Fail don't have this number to remove");
        }
        //เช็คว่ามีเลข 70 อยู่ในเซต
        if (a.contains(70)) {
            System.out.println("Test5 Pass");
        } else {
            System.out.println("Fail don't have this number in set");
        }
        
        
    }
}
