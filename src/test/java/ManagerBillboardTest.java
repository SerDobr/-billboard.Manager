import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ManagerBillboardTest {
    InformationPoster poster1 = new InformationPoster("Film 1");
    InformationPoster poster2 = new InformationPoster("Film 2");
    InformationPoster poster3 = new InformationPoster("Film 3");
    InformationPoster poster4 = new InformationPoster("Film 4");
    InformationPoster poster5 = new InformationPoster("Film 5");
    InformationPoster poster6 = new InformationPoster("Film 6");
    InformationPoster poster7 = new InformationPoster("Film 7");
    InformationPoster poster8 = new InformationPoster("Film 8");
    InformationPoster poster9 = new InformationPoster("Film 9");
    InformationPoster poster10 = new InformationPoster("Film 10");
    InformationPoster poster11 = new InformationPoster("Film 11");
    InformationPoster poster12 = new InformationPoster("Film 12");



    @Test
    public void test() {
        ManagerBillboard menager = new ManagerBillboard();
        menager.addFilm(poster1);
        menager.addFilm(poster2);
        menager.addFilm(poster3);
        menager.addFilm(poster4);
        menager.addFilm(poster5);
        menager.addFilm(poster6);
        menager.addFilm(poster7);
        menager.addFilm(poster8);
        menager.addFilm(poster9);
        menager.addFilm(poster10);
        menager.addFilm(poster11);
        menager.addFilm(poster12);



        InformationPoster[] expected = {poster1, poster2, poster3, poster4, poster5, poster6, poster7, poster8, poster9, poster10,poster11,poster12};
        InformationPoster[] actual = menager.findAll();
        Assertions.assertArrayEquals(expected, actual);


    }

    @Test
    public void reversTest() {

        ManagerBillboard menager = new ManagerBillboard();
        menager.addFilm(poster1);
        menager.addFilm(poster2);
        menager.addFilm(poster3);
        menager.addFilm(poster4);
        menager.addFilm(poster5);
        menager.addFilm(poster6);
        menager.addFilm(poster7);
        menager.addFilm(poster8);
        menager.addFilm(poster9);
        menager.addFilm(poster10);
        menager.addFilm(poster11);
        menager.addFilm(poster12);


        InformationPoster[] expected = {poster12, poster11, poster10, poster9, poster8, poster7, poster6, poster5, poster4,poster3};
        InformationPoster[] actual = menager.findLast();
        Assertions.assertArrayEquals(expected, actual);
     
    }
    @Test
    public void reversTestLimit12() {

        ManagerBillboard menager = new ManagerBillboard(12);
        menager.addFilm(poster1);
        menager.addFilm(poster2);
        menager.addFilm(poster3);
        menager.addFilm(poster4);
        menager.addFilm(poster5);
        menager.addFilm(poster6);
        menager.addFilm(poster7);
        menager.addFilm(poster8);
        menager.addFilm(poster9);
        menager.addFilm(poster10);
        menager.addFilm(poster11);
        menager.addFilm(poster12);


        InformationPoster[] expected = {poster12, poster11, poster10, poster9, poster8, poster7, poster6, poster5, poster4,poster3,poster2,poster1};
        InformationPoster[] actual = menager.findLast();
        Assertions.assertArrayEquals(expected, actual);

    }
   @Test
    public void reversTestMinLimit() {

        ManagerBillboard menager = new ManagerBillboard();
        menager.addFilm(poster1);
        menager.addFilm(poster2);
        menager.addFilm(poster3);
        menager.addFilm(poster4);
        menager.addFilm(poster5);
        menager.addFilm(poster6);
        menager.addFilm(poster7);
        menager.addFilm(poster8);
        menager.addFilm(poster9);


        InformationPoster[] expected = { poster9, poster8, poster7, poster6, poster5, poster4,poster3,poster2,poster1};
        InformationPoster[] actual = menager.findLast();
        Assertions.assertArrayEquals(expected, actual);

    }
}