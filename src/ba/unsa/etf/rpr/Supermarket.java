package ba.unsa.etf.rpr;

public class Supermarket {
Artikl[] artikli = new Artikl[1000];


    public boolean dodajArtikl(Artikl a) {
        int i=0;
     while(artikli[i]!=null) i++;
     artikli[i]=a;
     return true;
    }
public Artikl izbaciArtiklSaKodom(String kod) {

        Artikl neki=new Artikl();

        int i=0;
        for(i=0;i<artikli.length-1;i++) {



            if(artikli[i]!=null)
            if(artikli[i].getKod().equals(kod)) {
                neki=artikli[i];
                int j=i;
                //j++;
                while(artikli[j+1]!=null) {
                    artikli[j]=artikli[j+1];

                    j++;
                }
                artikli[j-1]=null;

                /*
                for(int j=i;j<artikli.length-2;j++) {
                    artikli[j]=artikli[j+1];
                }

                 */
            }
        }
return neki;

}

public Artikl[] getArtikli() {
        return artikli;
}






}
