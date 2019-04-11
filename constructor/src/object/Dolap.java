package object;


public class Dolap{

    private String renk;
    private int çekmece;
    private int maliyet;
    private double hacim;
    boolean Dolap;
    
public Dolap(){
    
    this("kahverengi",4,450,1700);
}
        
public Dolap(String renk,int çekmece,int maliyet,double hacim){
    this.hacim=hacim;
    this.maliyet=maliyet;
    this.renk=renk;
    this.çekmece=çekmece;
}

    /**
     * @return the renk
     */
    public String getRenk() {
        return renk;
    }
   

    /**
     * @param renk the renk to set
     */
    public void setRenk(String renk) {
        this.renk = renk;
    }

    /**
     * @return the çekmece
     */
    public int getÇekmece() {
        return çekmece;
    }

    /**
     * @param çekmece the çekmece to set
     */
    public void setÇekmece(int çekmece) {
        this.çekmece = çekmece;
    }

    /**
     * @return the maliyet
     */
    public int getMaliyet() {
        return maliyet;
    }

    /**
     * @param maliyet the maliyet to set
     */
    public void setMaliyet(int maliyet) {
        this.maliyet = maliyet;
    }

    /**
     * @return the hacim
     */
    public double getHacim() {
        return hacim;
    }

    /**
     * @param hacim the hacim to set
     */
    public void setHacim(double hacim) {
        this.hacim = hacim;
    }
    
    
    
    
    
    
}