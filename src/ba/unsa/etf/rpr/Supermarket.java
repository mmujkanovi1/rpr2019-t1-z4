package ba.unsa.etf.rpr;

public class Supermarket {

    Artikl[] artikli = new Artikl[1000];


    public boolean dodajArtikl(Artikl a) {
        int i=0;
     while(artikli[i]!=null) i++;
     artikli[i]=a;
     return true;
    }
    public Artikl izbaciArtiklSaKodom(String s) {

        int brojac=0;


        Artikl neki = new Artikl();
        int i = 0;
       // if(artikli[i]==null) throw new IllegalArgumentException ("Nema artikala u supermarketu");
        while (artikli[i] != null) {
            Artikl a = artikli[i];
            if (s.equals(a.kod)) {


                int j = i;
                neki=artikli[i];

                while (artikli[j + 1] != null) {
                    artikli[j] = artikli[j + 1];
                    j++;
                }

              //  neki=artikli[i];
//brojac++;

            }


            i++;
        }
  //      if(brojac==0) throw new IllegalArgumentException ("Nema artikla sa kodom u supermarketu");
        artikli[i-1]=null;
        return neki;
    }

public Artikl[] getArtikli() {
        return artikli;
}






}
