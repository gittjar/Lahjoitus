import java.io.*;

/**
 * Title: Luokka tietojen syöttämiseen
 * @author Simo Silander
 * @version 1.0
 */

public class Oma {

  static BufferedReader br =
    new BufferedReader(
      new InputStreamReader(System.in));


  public synchronized static int lueInt()
  {
    int luku = 0;
    String lukuStr;
    boolean ok;

    do{
      ok = true;
      try{
        lukuStr = br.readLine();
        luku = Integer.parseInt(lukuStr);
      }
      catch(Exception e){
        System.out.println("Virheellinen syöte, anna uudestaan");
        ok = false;
      }
    }while (!ok);
    return luku;
  }

  public synchronized static double lueDouble()
  {
    double luku = 0.0;
    String lukuStr;
    boolean ok;

    do{
      ok = true;
      try{
        lukuStr = br.readLine();
        luku = Double.parseDouble(lukuStr);
      }
      catch(Exception e){
        System.out.println("Virheellinen syöte, anna uudestaan");
        ok = false;
      }
    }while (!ok);
    return luku;
  }


  public synchronized static String lueString()
  {
    int luku = 0;
    String str = null;
    boolean ok;

    do{
      ok = true;
      try{
        str = br.readLine();
      }
      catch(Exception e){
        System.out.println("Virhe lukemisessa, anna uudestaan");
        ok = false;
      }
    }while (!ok);
    return str;
  }

  public synchronized static char lueChar()
  {
    char merkki = ' ';
    String str = null;
    boolean ok;

    do{
      ok = true;
      try{
        str = br.readLine();
        merkki = str.charAt(0);
      }
      catch(Exception e){
        System.out.println("Virhe lukemisessa, anna uudestaan");
        ok = false;
      }
    }while (!ok);

    return merkki;
  }

}