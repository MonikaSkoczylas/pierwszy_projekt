import javax.swing.*;

public class Main {
    public static void main(String[] args) {
//        System.out.println("It works!");
//        byte value1 = 3;
//        byte value2 = 127;
//        System.out.println("Zmienna value1 to " + value1 + " a value2 to " + value2);
//        int mojazmienna;  //deklaracja
//        int value3 = 4;   //inicjacja
//        int value4 = 5; // definicja
//        byte zm = (byte) 129;
//        System.out.println("Wartość po rzutowaniu to " + zm);

//        int valueToCheck = 128;
//        if (valueToCheck <= 127){
//            System.out.println("The number type is byte.");
//        }

//        int valueToCheck = 128;
//        if (valueToCheck <= 127){
//            System.out.println("The number type is byte.");
//        }
//        else {
//            System.out.println("The number type is int.");
//        }

//        int temp = -3;
//        if (temp < 0) {
//            System.out.println("Jest zimno weź czapkę");
//        } else {
//            System.out.println("Jest cieplo");
//        }
//
//        String znaki = "Dowolne znaki :/";
//        System.out.println(znaki);

//        char nowyTyp = 'c';
//        System.out.println(nowyTyp);
//
//        char nowyTyp2 = '%';
//        System.out.println(nowyTyp2);
//
//        char nowyTyp3 = 123;
//        System.out.println(nowyTyp3);
//
//        System.out.println(nowyTyp + ", " + nowyTyp2 + ", " + nowyTyp3);

//
//        String kolor = "niebieski";
//        if (kolor == "zielony")     // == operator porównania, = operator przypisania
//        {
//            System.out.println("jedź");
//        } else if (kolor == "czerwony") {
//            System.out.println("Stój");
//        }
//        else {
//            System.out.println("nieokreślony sygnał");
//        }


//        int mojaZmienna = 1;
//        System.out.println(mojaZmienna);
//
//        mojaZmienna = mojaZmienna + 1;
//        System.out.println(mojaZmienna);
//
//        mojaZmienna++;
//        System.out.println(mojaZmienna);
//
//        mojaZmienna += 1;
//        System.out.println(mojaZmienna);
//
//        mojaZmienna += 10;
//        System.out.println(mojaZmienna);
//
//        int zm = 5;
//        System.out.println(++zm);

//        int zmiennaGlobalna = 90;
//
//        while (zmiennaGlobalna > 0) {
//            zmiennaGlobalna==;
//
//            int zmiennaLokalna = 0;
//        }
//
//        zmiennaLokalna++;


/*
komentarz
wielolinijkowy
 */

//        float floatVariable = 4.3232F;
//        double doubleVariable = 6.34563222;

//        for (int licznik = 0; licznik <=10; licznik++) {
//            System.out.println("Napis po raz " + licznik);
//        }
//
//        int liczba = 11;

//        while (liczba <=10) {
//            System.out.println("liczba to " + liczba);
//            liczba++;
//        }

//        do {
//            System.out.println(liczba);
//            liczba++;
//        } while (liczba <=10);

//        int numberToCheck = 101;
//
//        if (numberToCheck %2 == 0) {
//            System.out.println("Liczba jest parzysta");
//        }
//        else {
//            System.out.println("Liczba jest nieparzysta");
//        }


//        int nowaLiczba = 77;
//        System.out.println(nowaLiczba%33);
//
//        double nowaLiczba1 = 77;
//        System.out.println(nowaLiczba1/33);


//        boolean sygnalizacja = true;
//        boolean zapory = false;
//        if (sygnalizacja && zapory){
//            System.out.println("Można jechać");
//        }
//        else {
//            System.out.println("Nie można jechać");
//        }

//        for (int i =0; i <256; i++) {
//            char znak = (char) i;
//            System.out.println(i + " = " + znak);
//        }

//        int predkosc = 10;
//        if (predkosc >=1 && predkosc <10){
//            System.out.println("male ostrzezenie");
//        }
//        else if (predkosc >=10) {
//            System.out.println("duze ostrzezenie");
//        }

//        int[] tablica = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        for (int i = 0; i <= 10; i++) {
//            System.out.println(tablica[i]);
//        }

//        int[] nowaTablica = new int[10];
//        for (int i = 0; i <= 9; i++) {
////            System.out.println(nowaTablica[1]);
//        }
//
//        for (int i = 0; i <= 9; i++) {
//            nowaTablica[i] = i + 21;
//            System.out.println(nowaTablica[i]);
//        }

//        String[] tablicaDniTygodnia = {"poniedziałek", "wtorek", "sroda", "czwartek", "piatek", "sobota", "niedziela"};
//        for (int i = 0; i < tablicaDniTygodnia.length; i++) {
//            System.out.println(tablicaDniTygodnia[i]);
//        }


//13 - nested loops

//        for (int i = 0; i < 10; i++) {
//            for (int j = 0; j < 10; j++) {
//                System.out.println("Dla i =  " + i + ", j = " + j);
//                System.out.println("A zatem " + i + " * " + j + " to " + i * j);
//            }
//        }


//        char operacja = ':';
//        int a = 3, b = 9;
//        switch (operacja) {
//            case '+':
//                System.out.println(a + b);
//                break;
//            case '-':
//                System.out.println(a - b);
//                break;
//            case '*':
//                System.out.println(a * b);
//                break;
//            case '/':
//                System.out.println(a / b);
//                break;
//            default:
//                System.out.println("Bledny znak lub wartosc.");
//        }
//        Punkt p1 = new Punkt();
//        System.out.println(p1.x);
//        System.out.println(p1.y);
//
//        Punkt p2 = new Punkt();
//        System.out.println(p2.x);
//        System.out.println(p2.y);
//
//        p2.x = 4;
//
//        System.out.println(p2.x);
//
//        Punkt p1 = new Punkt();
//        Punkt p2 = new Punkt();
//        p1.wyswietlWspolrzedne();
//        p2.wyswietlWspolrzedne();
//
//        Punkt p1 = new Punkt();
//        int poleXObiektuP1 = p1.pobierzX();
//        int poleYObiektuP1 = p1.pobierzY();
//        System.out.println(poleXObiektuP1);
//        System.out.println(poleYObiektuP1);
//
//        Punkt p2 = new Punkt();
//
//        p1.ustawX(5);
//        System.out.println(p1.pobierzX());
//
//        p1.ustawY(7);
//        System.out.println(p1.pobierzY());

        Samochod audi = new Samochod();

        audi.setIlosc_drzwi(5);
        System.out.println("Ilosc drzwi: " + audi.getIlosc_drzwi());

        audi.setModel("A5");
        System.out.println(audi.getModel());

        audi.setRok_produkcji(2015);
        System.out.println(audi.getRok_produkcji());

        audi.setV_max(230);
        System.out.println(audi.getV_max());

        boolean stan_samochodu = audi.rusz();
        System.out.println(stan_samochodu);
        stan_samochodu = audi.zatrzymajSie();

        System.out.println(stan_samochodu);

        Punkt.metodaStatyczna();
        System.out.println(Punkt.poleStatyczne);

        new Punkt();

        Punkt3D punkt3D = new Punkt3D();
        punkt3D.z = 3;
        punkt3D.x = 5;
        punkt3D.y = 7;
        System.out.println(punkt3D.z);
        System.out.println(punkt3D.x);
        System.out.println(punkt3D.y);

        Punkt punkt = new Punkt();

        OverridenMethods on1 = new OverridenMethods();

        on1.dodawaj(1,2);
        on1.dodawaj(3,4,5);
        on1.dodawaj(5,6,7,8);
        on1.dodawaj(9,1,2,3,4);

        System.out.println( on1.dodawaj(1,2));
        System.out.println(on1.dodawaj(3,4,5));
        System.out.println(on1.dodawaj(5,6,7,8));
        System.out.println(on1.dodawaj(9,1,2,3,4));


    }
}
