package Zadanie7;

public class IterNapTest {

    public static void main(String [] args) 
    {
        IterNap napis = new IterNap("prOgrAmoWanIe ObiEktOwe i Gui");

            // iteracja po znakach napisu,
            // domyœlnie zaczynaj¹c od pierwszego znaku (o indeksie 0)
            // i z krokiem iteracji = 1
        for (char z: napis) 
            System.out.print(z + " ");
    
        System.out.println();

        napis.ustawPoczatek(2);     // ustawienie pocz¹tku iteracji (tu: 2-gi znak, o indeksie 2)
        napis.ustawKrok(3);         // ustawienie kroku iteracji (tu: co 3-ci znak)
    
            // iteracja po znakach napisu,
            // od ustalonego znaku, z okreœlonym krokiem
        for (char z: napis) 
            System.out.print(z + " ");
    }
}