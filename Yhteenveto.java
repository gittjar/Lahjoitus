/*
 * Created on 13.3.2006
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */

/**
 * @author keranen.jarno
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
import javax.swing.*;
public class Yhteenveto {

    public static void yhteenvetoa() 
	{
        // muutettu kohteet = taulukkoa
		String []taulukkoa = {"Kuuba", "Mosambik", "Mongolia", "Indonesia"};
		double []summat = {0,0,0,0};
		String mita;
		String strPaljonko;
		int mNumero;
		int mValinta;
		double mPaljonko;
		int k = 0;
		int q;
		
		
		
		
		
		
		
		do {
			
		
		String teksti="Avustettavat kohteet ovat:\n ";
		for ( int i = 0; i < taulukkoa.length; i++)
		{
			teksti = teksti + (i+1) +"." +taulukkoa[i] + " "+
			summat[i] + "\n" ; 
			
			
		}
		teksti = teksti + "Mit� kohdetta haluat avustaa?\n [q] Lopeta ohjelma";
		mita = JOptionPane.showInputDialog(teksti);
		mNumero = Integer.parseInt(mita);
		
		
		// katsoo mik� lokero
		strPaljonko = JOptionPane.showInputDialog("Mill� summalla?");
		mPaljonko = Double.parseDouble(strPaljonko);
		summat[mNumero-1]= summat[mNumero-1] + mPaljonko;
		k++;
		
		
		
		
		}while (k < 50);
		
		
		//ohjelmasta poistuminen ei jostain syyst� toimi oikein.
		//do{
		  //  if (mita == q);
		    //{
		  //mita = Integer.parseInt(q);
		    
		//}while
		
	
	
	
}
}