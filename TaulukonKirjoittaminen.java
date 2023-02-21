/*
 * Created on 27.2.2006
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */

/**
 * @author jarno
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */

import javax.swing.*;


public class TaulukonKirjoittaminen {

	public static void taulukkoa() 
	{
		String mNimi;
		int mNimienLkm;
		String jatko = "kyllä";
		String[] taulukko = new String[5];
		taulukko[0] = "Kuuba";
		taulukko[1] = "Mosambik";
		taulukko[2] = "Mongolia";
		taulukko[3] = "Indonesia";
		mNimienLkm = 4;
		
		// {"Jarno", "Toivo", "Wexi"};
		
		String AvustusTaulukko;
		int mAvustusKohtLkm;
		String jatko1 = "kyllä";
		String[] taulukkoAvustus = new String[20];
		taulukkoAvustus[0] = "";
		taulukkoAvustus[1] = "";
		taulukkoAvustus[2] = "";
		taulukkoAvustus[3] = "";
		mAvustusKohtLkm = 4;
		
		
		/*
		do {
		mNimi = JOptionPane.showInputDialog("Mikä nimi lisätään?");
		taulukko[mNimienLkm]= mNimi;
		mNimienLkm++;
		jatko = JOptionPane.showInputDialog("Vieläkö lisää? kyllä/ei");
		
		} while (mNimienLkm < taulukko.length && 
				jatko.equalsIgnoreCase("kyllä"));
		
		*/
		
		
		
		
		
		/*
		*do {
		*	AvustusTaulukko = JOptionPane.showInputDialog("Mihin kohteeseen lisätään avustuksia?");
		*	taulukkoAvustus[mAvustusKohtLkm]= AvustusTaulukko;
		*	mAvustusKohtLkm++;
		*	jatko1 = JOptionPane.showInputDialog("Vieläkö lisää? kyllä/ei");
		*	
		*	} while (mNimienLkm < taulukkoAvustus.length && 
		*			jatko1.equalsIgnoreCase("kyllä"));
		*/
		
		
		
		// lisataan taulukkoon nimiä
		
		String tiedostonimi = "taulukko.tmp";
		// kirjoitetaan taulukko kokonaisena
		/*
		try {
		FileOutputStream kirj = new FileOutputStream(tiedostonimi);
		ObjectOutputStream oKirj =
			new ObjectOutputStream(kirj);
		
		//kirjoittaminen
		oKirj.writeObject(taulukko);
		oKirj.flush();
		oKirj.close();
		
		} catch (Exception e)
		{
			//tulostaa tietoa virhetilanteesta
			e.printStackTrace();
		}
		//tyhjennetaan taulukko
		taulukko = null;
		//System.out.println(taulukko[0]);
		try {
			FileInputStream luku = 
				new FileInputStream(tiedostonimi);
			ObjectInputStream oLuku =
				new ObjectInputStream(luku);
			// luetaan nimet tiedostosta taulukko.tmp
			taulukko = (String[])oLuku.readObject();
			oLuku.close();
			// testataan , mita on taulukossa
			for ( int i = 0; i < taulukko.length; i++)
			{
				System.out.println(taulukko[i]);
			}
			
		}catch (Exception e)
		{
			e.printStackTrace();
		}
		*/
	}
}
