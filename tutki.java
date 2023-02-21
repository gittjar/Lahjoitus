import javax.swing.*;
public class tutki {

	/**
	 * @param args
	 */
	public static void kohteita() 
	{
		int mValinta;
		String mita;
		do {
		mita = JOptionPane.showInputDialog
		("1. Kuuba\n " +
		"2. Mosambik\n " +
		"3. Mongolia\n " +
		"4. Indonesia\n " +
		"5. Palaa päävalikkoon" 
		);
		mValinta = Integer.parseInt(mita);
		// tutki mitä käyttäjä valitsi
		if (mValinta == 1)
		{
		
		    JOptionPane.showMessageDialog(null, "1. Kohde: Kuuba\n " + 
		    		"Avusta Havannan köyhiä, lahjoituksilla ostetaan lääkkeitä.");
		}
		if (mValinta == 2)
		{
		    
			JOptionPane.showMessageDialog(null, "2. Kohde: Mosambik\n " + 
					"Avusta Mosambikin maanviljelijöitä raivaamaan miinoja viljapelloista.");
		
		}
		if (mValinta == 3)
		{
			JOptionPane.showMessageDialog(null, "3. Kohde: Mongolia\n " + 
					"Avusta Bajanhongorin orpokotia, lapsille ostetaan ruokaa ja lääkkeitä.");
		}
		if (mValinta == 4)
		{
			JOptionPane.showMessageDialog(null, "4. Kohde: Indonesia\n " + 
					"Avusta vuoden 2004 tsunamin uhreja, avustusvarat käytetään jälleenrakentamiseen.");
		}
		
		} while (mValinta != 5);
	}
	
}