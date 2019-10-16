package ba.unsa.etf.rpr;

public class Korpa {

Artikl[] artikl=new Artikl[50];
    public void dodajArtikl(Artikl a) {int i=0;
 while(a[i]==null)i++;
artikl[i]=a;



}
public Artikl[] getArtikli(){

return artikl;


}






}