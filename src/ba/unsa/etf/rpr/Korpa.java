package ba.unsa.etf.rpr;

public class Korpa {

Artikl[] artikli=new Artikl[50];
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
Artikl neki=new Artikl();
//int i=0;
/*while(artikli[i]!=null){

    if(s==artikli[i].kod) {


    }
}

*/

for(int i=0;i<artikli.length-1;i++) {
    Artikl a = artikli[i];
    if (artikli[i] != null)
        if ((s).equals(a.kod)) {
            int j = i;
            neki = artikli[i];
            j++;
            while (artikli[j] != null) {
                artikli[j - 1] = artikli[j];
                j++;
            }




/*
    neki=artikli[i];
    for(int j=i;j<artikli.length-2;i++) {
        artikli[j]=artikli[j+1];

    }
    //break;
}

artikli[artikli.length-1]=null;
*/
        }
}
return neki;
}
public int dajUkupnuCijenuArtikala() {
        int suma=0;
        for(int i=0;i<artikli.length-1;i++) {
          //  if(artikli[i]==null) break;
            suma+=artikli[i].cijena;
        }
        return suma;


}





}