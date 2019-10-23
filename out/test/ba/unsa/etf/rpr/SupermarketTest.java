package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SupermarketTest {

    private static Supermarket supermarket=new Supermarket();
    private Artikl artikl;

    @Test
    void dodajArtikl() {
        //supermarket=new Supermarket();
        boolean p=supermarket.dodajArtikl(new Artikl("Auto", 1234, "3"));
     assertTrue(p);

    }

    @Test
    void izbaciArtiklSaKodom() {
        //supermarket=
        supermarket.dodajArtikl(new Artikl("Auto", 1234, "5"));
        supermarket.dodajArtikl(new Artikl("Biciklo", 4567, "10"));
        Artikl a=supermarket.izbaciArtiklSaKodom("10");
        assertEquals("10",a.getKod());


    }

    @Test
    void getArtikli() {

        int p=supermarket.getArtikli().length;
//assertEquals(3,p);

            assertEquals("3", supermarket.getArtikli()[0].getKod());
         //   assertEquals(2,  supermarket.getArtikli()[1].getKod());
          //  assertEquals(3,  supermarket.getArtikli()[2].getKod());

    }
}