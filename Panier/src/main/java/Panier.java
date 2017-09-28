
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vj243775
 */
public class Panier {
    private java.util.ArrayList panier = new java.util.ArrayList<Orange>();
    private int Max;
    private int current;

    public ArrayList getPanier() {
        return panier;
    }

    public void setPanier(ArrayList panier) {
        this.panier = panier;
    }

    public int getMax() {
        return Max;
    }

    public void setMax(int Max) {
        this.Max = Max;
    }
    
public void AjoutOrange(Orange a){
    if (current < Max)
        this.panier.add(a);
    else System.out.println("erreur panier plein");
}    
 
public void remove(Orange a){
    for(int i=0;i<=this.panier.size();i++)
    {
       if( this.panier.get(i).equals(a))
           this.panier.remove(a);
    }
}
}
