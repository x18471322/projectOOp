package library;
import java.util.Calendar;
import java.util.Date;



 
 /* @author x18493414
 */
public class Borrow extends Library {
    protected String name;
    protected int bID;
    protected int ID;
    protected Date bDate;
    protected Date TDate;
    protected Date RDate;
    protected int bDays;
   
    public Borrow(String name, int bID, int ID, int bDays) {
        this.name = name;
        this.bID = bID;
        this.ID = ID;
        this.bDays = bDays;
    }
    
    
    
    
           
    //Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setbID(int bID) {
        this.bID = bID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setbDays(int bDays) {
        this.bDays = bDays;
    }

    //Getters
    public String getName() {
        return name;
    }

    public int getbID() {
        return bID;
    }

    public int getID() {
        return ID;
    }

    public Date getbDate() {
        return bDate;
    }

    public int getbDays() {
        return bDays;
    }
  
    
     public void returnDate(){
        //RDate = TDate.add(Calendar.DAY_OF_MONTH, 1);  
     }
}
