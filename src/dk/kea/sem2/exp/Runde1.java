package dk.kea.sem2.exp;
// Generated Feb 11, 2015 7:30:07 PM by Hibernate Tools 3.2.1.GA



/**
 * Runde1 generated by hbm2java
 */
public class Runde1  implements java.io.Serializable {


     private int valgfagId;
     private Valgfag valgfag;

    public Runde1() {
    }

    public Runde1(int valgfagId, Valgfag valgfag) {
       this.valgfagId = valgfagId;
       this.valgfag = valgfag;
    }
   
    public int getValgfagId() {
        return this.valgfagId;
    }
    
    public void setValgfagId(int valgfagId) {
        this.valgfagId = valgfagId;
    }
    public Valgfag getValgfag() {
        return this.valgfag;
    }
    
    public void setValgfag(Valgfag valgfag) {
        this.valgfag = valgfag;
    }




}

