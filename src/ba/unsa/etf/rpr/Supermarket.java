package ba.unsa.etf.rpr;

public class Supermarket {
Artikl[] artikli = new Artikl[1000];


    public void dodajArtikl(Artikl a) {
        int i=0;
     while(artikli[i]!=null) i++;
     artikli[i]=a;
    }


}
