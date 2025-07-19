import java.util.ArrayList;
/** ADT
 * เป็นที่เก็บ integer ที่เรียงลำดับจากน้อยไปมากเเละไม่เป็นค่า null เเละตัวเลขไม่ซ้ำกัน
 */
public class IntegerSet {
    ArrayList<Integer> Number; 
    /** Abstraction Function (AF):
     * -AF(Number) เซตของตัวเลขทั้งหมดที่อยู่ใน Integer Number 
     * 
     * Rep Invariant (RI):
     * -ตัวเลขใน Number จะต้องไม่เป็น null 
     * -ตัวเลขใน Number นั้นจะต้องไม่เป็นตัวเลขที่ซ้ำกัน
     * -ตัวเลขใน Number จะต้องเรียงลำดับจากน้อยไปมาก
    */
    public IntegerSet(){
        Number = new ArrayList<>();
        CheckRep();
    }
    /**
     * ตรวจสอบว่า Rep Invariant เป็นจริงหรือไม่
     * ตรวจสอบว่าตัวเลขจะไม่ซ้ำกัน และต้องเรียงจากน้อยไปมาก
     */
    private void CheckRep(){
         if (Number == null) {
                throw new RuntimeException("Rep invariant violated");
         }      
        for (int i = 0; i < Number.size()-1 ; i++) {
            //System.out.println(Number);
            if(Number.get(i) == Number.get(i+1)){
                throw new RuntimeException("What r u Duping???");
            }else if(Number.get(i) > Number.get(i+1)){
                throw new RuntimeException("What the hell why r u not do sort?????");
            }
        }
    }
    /**
     * เช็คก่อนว่าไม่เป็น null
     * เพิ่มตัวเลขเข้าเซต
     * หาจุดที่จะไปอยู่เพื่อเรียงจากน้อยไปมาก
     * @param x ตัวเลขที่ต้องการเพิ่มเข้า
     */
    public void add(Integer x){
        if (x == null) {
            throw new IllegalArgumentException("Cannot add null");
    }
        if (!contains(x)) {
            int i = 0;
        while (i < Number.size() && Number.get(i) < x) {
            i++;
        }
            Number.add(i, x);
            CheckRep();
        }
    }
    /**
     * เช็คก่อนว่าไม่เป็น null
     * แล้วค่อยลบตัวเลขออกจากเซต
     * @param x ตัวเลขที่ต้องการลบออก
     */
    public void remove(Integer x){
        if (x == null) {
            throw new IllegalArgumentException("Cannot remove null");
    }
        if (contains(x)) {
            Number.remove(x);
            CheckRep();
        }
    }
    /**
     * คำสั่งที่ไว้เเปลงจากตัวเลขไปเป็นสตริง
     */
    public String toString(){
        return Number.toString();
    }
    /**
     * เช็คตัวเลขว่ามีอยู่จริงหรือไม่
     * @param x ตัวเลขที่เอามาเช็คว่าตัวเลขนี้มีอยู่ในเซตหรือไม่
     */
    public boolean contains(Integer x){
        for (int i = 0; i < Number.size(); i++) {
            if (x == Number.get(i)) {
                return true;
            }
        }
        return false;
    } 
}