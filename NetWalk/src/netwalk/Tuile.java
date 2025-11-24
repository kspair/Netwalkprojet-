/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package netwalk;

/**
 *
 * @author eiriart
 */
public class Tuile {
    
    public boolean source ;
    public boolean feuillet ;
    public int code ;
    public int compteur ;
    
    public Tuile ( boolean source , boolean feuillet , int code){
        this.source = source ; 
        this.feuillet = feuillet ;
        this.code = code ;
        this.compteur = compteur ;
    }

    
    public void rotationSensHoraire(){
        this.code = this.code * 2 ;
        if (this.code > 15){
            this.code= (this.code & 15)+1 ;
        }
        this.compteur += 1;
                
    }
    
    public void rotationSensTrigo(){
        int ajout = 0 ; 
        if (this.code % 2 == 1){
            ajout = 8;
    }
        this.code = this.code/2;
        this.code += ajout ;
        
        this.compteur += 1;
    }
    
}
