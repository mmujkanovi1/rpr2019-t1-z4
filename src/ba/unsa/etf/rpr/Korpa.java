package ba.unsa.etf.rpr;

public class Korpa {

   Artikl[] artikli=new Artikl[50];
  //  Artikl[] artikli=new Artikl[50];
    public boolean dodajArtikl(Artikl a) {int i=0;
 while(artikli[i]!=null)i++;
artikli[i]=a;

return true;

      //  return true;
    }
public Artikl[] getArtikli(){



return artikli;


}


    public Artikl izbaciArtiklSaKodom(String s) {
        Artikl neki = new Artikl();
        int i = 0;
        while (artikli[i] != null) {
            Artikl a = artikli[i];
            if (s.equals(a.kod)) {


                int j = i;
               /* if(artikli[j+1]==null) {

                    neki = artikli[j];
                   // artikli[j]=artikli[j+1];

                    artikli[j] = null;
                    return neki;
                }

                */


                while (artikli[j + 1] != null) {
                    artikli[j] = artikli[j + 1];
                     j++;
                }
                //artikli[j-1]=null;
                neki=artikli[i];
               // return artikli[i];

            }


            i++;
        }
        artikli[i-1]=null;
        return neki;
    }


public int dajUkupnuCijenuArtikala() {
        int suma=0;
        int i=0;
        while(artikli[i]!=null) {
            suma+=artikli[i].cijena;


            i++;
        }

        return suma;


}





}