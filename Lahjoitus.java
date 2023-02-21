import javax.swing.JOptionPane;

/*
 * Created on 6.3.2006
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

public class Lahjoitus {

	public static void main(String[] args) {
		String jatko = "kyllä";
	
		{
			double rahaa = 0;
			double lahjoituksenMaara = 0;
			System.out.print(
				"Anna kohde johon lahjoitat: (1,2,3,4,5)");
			// valitaan kohde johon lahjoitetaan
			rahaa = Oma.lueDouble();
			System.out.print(
				"Anna lahjoitettava summa: ");
			lahjoituksenMaara = Oma.lueDouble();
			// Kirjoitetaan kuinka paljon ja mihin kohteeseen laitettiin rahaa
			if (rahaa >= lahjoituksenMaara)
			{
				System.out.print(
			// "Lahjoituksen jälkeen kohteessa on rahaa "
			+ (rahaa + lahjoituksenMaara) + " euroa");
			}
			 else
			{
			 	
			System.out.print("");
			jatko = JOptionPane.showInputDialog("Vieläkö lisää? kyllä/ei");
				// siirrytään jatkamaan lahjoituksia jos "kyllä", mikäli "ei" niin palataan valintavalikkoon
			}
		}
	}
}
		
	
