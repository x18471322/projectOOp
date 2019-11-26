/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

/**
 *
 * @author x18339973
 */
public class LibraryReturn {
    protected String name;
    protected int bID;
    protected int ID;

public LibraryReturn(){
    name="";
    bID=0;
    ID=0;
    
}    

    public LibraryReturn(String name, int bID, int ID) {
        this.name = name;
        this.bID = bID;
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getbID() {
        return bID;
    }

    public void setbID(int bID) {
        this.bID = bID;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }


    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
