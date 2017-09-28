/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vj243775
 */
public class Orange {
    
    private double Prix;
    private String Origine;

    public double getPrix() {
        return this.Prix;
    }

    public void setPrix(double Prix) {
        if(Prix<0)
            System.out.println("erreur prix incorect");
        else
        this.Prix = Prix;
    }

    public String getOrigine() {
        return this.Origine;
    }

    public void setOrigine(String Origine) {
        this.Origine = Origine;
    }
    
public Orange(){
    this.Prix=0.50;
    this.Origine="France";
}    
public Orange(double a, String b){
    if(a<0)
        System.out.println("erreur prix incorect");
    else{
    this.Prix=a;
    
    this.Origine=b;
    }
}    


}
