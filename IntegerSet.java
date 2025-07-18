import java.util.ArrayList;
/** ADT
 * 
 */
public class IntegerSet {
    ArrayList<Integer> Number; // rep

    public IntegerSet(){
        Number = new ArrayList<>();
        CheckRep();
    }
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
     * 
     * 
     */
    public void add(Integer x){
        Number.add(x);
        CheckRep();
    }
    public void remove(Integer x){
        Number.remove(x);
        CheckRep();
    }
    public String toString(){
        return Number.toString();
    }
    public boolean contains(Integer x){
        for (int i = 0; i < Number.size(); i++) {
            if (x == Number.get(i)) {
                return true;
            }
        }
        return false;
    }
    
    
}
   
