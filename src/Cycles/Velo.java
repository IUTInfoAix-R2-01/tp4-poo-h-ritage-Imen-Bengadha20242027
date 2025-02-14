package Cycles;
import java.util.Random;

import bibliotheque.InvoiceItem;

public class Velo {
  private static double DEFAUT_BRAQUET = 13.0 ; 
  private double Braquet ; 
  private double DiamRoue ; 
  private Random GenAlea = new Random() ; 
  
public void setDEFAUT_BRAQUET( double dEFAUT_BRAQUET){
    DEFAUT_BRAQUET = dEFAUT_BRAQUET ;
    
}	
//Constructeur avec deux paramètres// 
public Velo (double Braquet , double DiamRoue  ) {
        this.Braquet = Braquet ; 
        this.DiamRoue = DiamRoue ; 
        
}	

public Velo (double Braquet ){
    this.Braquet = Braquet ;  
    
}	
	
public Velo (){    
}	
	
public Random getGenAlea(){
	 return  GenAlea ; 
		
}	

public void setGenAlea(Random GenAlea){
	 this.GenAlea = GenAlea ; 
}	
	
public double Braquet() {
	 return Braquet  ; 
		
}	

public void setBraquet  (double  Braquet) {
  this.Braquet = Braquet ; 
}	

 public double getDiamRoue (){
	 return DiamRoue  ; 
		
}		
public void setDiamRoue ( double  DiamRoue){
	  this.DiamRoue = DiamRoue ; 
	}	
 
 public String toString () {
	return "Velo [Braquet=" + Braquet + ", DiamRoue=" +DiamRoue  +  "]";
  
 }
 
public double getPuissance (double FrequenceCoupsDePedale ) {
  return FrequenceCoupsDePedale *Braquet*DiamRoue*GenAlea.nextDouble();
}
 

	public static void main(String[] args) {
		
	    Velo velo1 = new Velo(15.0, 27.5); 
        Velo velo2 = new Velo(14.0);       
        Velo velo3 = new Velo(); 
	
	
	
	System.out.println("Vélo 1 : " + velo1);
    System.out.println("Vélo 2 : " + velo2);
    System.out.println("Vélo 3 : " + velo3);
    
    double FrequenceCoupsDePedale = 16;
    System.out.println("Puissance du Vélo 1 : " + velo1.getPuissance(FrequenceCoupsDePedale));
    System.out.println("Puissance du Vélo 2 : " + velo2.getPuissance(FrequenceCoupsDePedale));
    System.out.println("Puissance du Vélo 3 : " + velo3.getPuissance(FrequenceCoupsDePedale));
}
}
