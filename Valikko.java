/*
 * Created on 27.2.2006
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
public class Valikko {

	public static void main(String[] args) 
	{
		int mValinta;
		String mita;
		do {
		mita = JOptionPane.showInputDialog
		("1. Katso avustuskohteet\n" +
		"2. Tee lahjoituksia\n " +
		"3. Tutki kohteita\n " +
		"4. Lopetus");
		mValinta = Integer.parseInt(mita);
		// tutki mitä käyttäjä valitsi
		if (mValinta == 1)
		{
			// avustuskohteiden ylläpito
			//JOptionPane.showMessageDialog(null,"Avustuskohteiden ylläpitoa");
			// TaulukonKirjoittaminen.taulukkoa();
		    JOptionPane.showMessageDialog(null,"1)Kuuba\n" +
		         "2)Mosambik\n" +
		         "3)Mongolia\n" +
		         "4)Indonesia\n" );
		}
		if (mValinta == 2)
		{
		    Yhteenveto.yhteenvetoa();
		    
			// JOptionPane.showMessageDialog(null,"Lahjoituksia");
			// TaulukonKirjoittaminen.Lahjoitus();
		}
		if (mValinta == 3)
		{
			tutki.kohteita();
		}
		
		
		} while (mValinta != 4);
	}
	
}
