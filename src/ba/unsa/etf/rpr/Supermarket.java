package ba.unsa.etf.rpr;

public class Supermarket {
Artikl[] artikli = new Artikl[1000];


    public void dodajArtikl(Artikl a) {
        int i=0;
     while(artikli[i]!=null) i++;
     artikli[i]=a;
    }
public void izbaciArtiklSaKodom(String kod) {

        int i=0;
        for(i=0;i<1000;i++) {
            if(artikli[i].kod=kod) {
                for(int j=i;j<999;j++) {
                    artikli[j]=artikli[j+1];
                }
            }
        }


}

public Artikl[] getArtikli() {
        return artikli;
}






}
