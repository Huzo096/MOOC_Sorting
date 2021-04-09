
/*
    Kreirati metode za ispis najmanje vrijednosti u nizu, ispis indeksa najmanje vrijednosti u nizu,
    ispis indeksa najmanje vrijednosti u nizu od određenog indeksa, te metodu za zamjenu vrijednosti u nizu
 */



import java.util.Arrays;

public class MainProgram {
    public static void main(String[] args) {


        int[] numbers = {6, 5, 8, 7, 11};
        System.out.println(Arrays.toString(numbers));
        //pozivanje metode koja prikazuje najmanju vrijednost iz niza numbers
        System.out.println("Smallest: " + smallest(numbers));
        //pozivanje metode koja prikazuje indeks najmanje vrijednosti iz niza numbers
        System.out.println("Index of smallest number: " +indexOfSmallest(numbers));
        System.out.println();


        int[] numbers2 = {-1, 6, 9, 8, 12};
        System.out.println(Arrays.toString(numbers2));
        //pozivanje metode koja prikazuje index najmanje vrijednosti od odabranog indeksa
        //prikaz indexa najmanje vrijednosti iz niza numbers2 od indexa 0
        System.out.println("Index of smallest number from index 0: " +indexOfSmallestFrom(numbers2, 0));
        //prikaz indexa najmanje vrijednosti iz niza numbers2 od indexa 1
        System.out.println("Index of smallest number from index 1: " +indexOfSmallestFrom(numbers2, 1));
        //prikaz indexa najmanje vrijednosti iz niza numbers2 od indexa 2
        System.out.println("Index of smallest number from index 2: " +indexOfSmallestFrom(numbers2, 2));
        System.out.println();

        //pozivanje metode koja zamjenjuje vrijednosti na mjestima čije indekse unesemo
        int[] numbers3 = {3, 2, 5, 4, 8};
        //ispis kreiranog niza - [3, 2, 5, 4, 8]
        System.out.println(Arrays.toString(numbers3));
        System.out.println("Swap index1 = 2 and index0 = 3");
        //zamjena vrijednosti pod indeksima 0 i 1 iz prethodnog niza (prethodni niz je 3, 2, 5, 4, 8)
        MainProgram.swap(numbers3, 1, 0);
        //ispis niza sa zamjenjenim vrijednostima - [2, 3, 5, 4, 8]
        System.out.println(Arrays.toString(numbers3));
        System.out.println("Swap index0 = 2 and index3 = 4");
        //zamjena vrijednosti pod indeksima 0 i 3 iz prethodnog niza (prethodni niz je 2, 3, 5, 4, 8)
        MainProgram.swap(numbers3, 0, 3);
        //ispis niza sa zamjenjenim vrijednostima - [4, 3, 5, 2, 8]
        System.out.println(Arrays.toString(numbers3));


    }

    //metoda za pretragu najmanje vrijednosti u nizu
    public static int smallest(int[] array){
        //pretpostavljamo da je najmanja vrijednost na početnom indeksu
        int smallest = array[0];
        //for petlja prolazi kroz vrijednosti niza
        for (int i = 0; i < array.length; i++) {
            //kada pronađe vrijednost koja je manja od prethodne spremljene najmanje
            if (array[i] < smallest) {
                //ta nova vrijednost postaje najmanja
                smallest = array[i];
            }
        }
        //metoda je tipa int stoga vraća najmanju vrijednost
        return smallest;
    }

    //metoda za pretragu indeksa najmanje vrijednosti u nizu
    public static int indexOfSmallest(int[] array){
        int smallest = array[0];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
                //index pohranjuje indeks najmanje vrijednosti
                index = i;
            }
        }
        //metoda je tipa int stoga vraća indeks najmanje vrijednosti
        return index;
    }

    //metoda za pretragu indeksa najmanje vrijednosti u nizu od odabranog indeksa
    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        //index je jednak vrijednosti početnog indeksa kojeg zadajemo prilikom pozivanja metode
        int index = startIndex;
        //pretpostavljamo da je najmanja vrijednost jednaka onoj čiji indeks zadamo u pozivu metode
        int smallest = table[index];
        //for petlja prolazi kroz vrijednosti niza od zadanog početnog indeksa
        for (int i = startIndex; i < table.length; i++) {
            if (table[i] < smallest) {
                smallest = table[i];
                index = i;
            }
        }
        return index;
    }

    //metoda koja zamjenjuje vrijednosti na mjestima čije indekse unesemo
    public static void swap(int[] array, int index1, int index2) {
        //broj sprema vrijednosti koja se nalazi pod indeksom kojeg definiramo u pozivu metode
        int number = array[index1];
        //vrijednost pod prvim definiranim indeksom će zamjeniti vrijednost pod drugim definiranim indeksom
        array[index1] = array[index2];
        //vrijednost pod drugim definiranim indeksom će zamjeniti vrijednost koja je spremljena u varijablu broja
        //odnosno početna vrijednost koja se nalazila pod prvim definiranim indeksom
        array[index2] = number;
    }

}
