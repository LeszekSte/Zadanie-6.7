package Zadanie_7;

public class Main {


    public static void main(String[] args) {
        System.out.println("Podaj 5 imion: ");
        Person[] names = new Person[5];

        Baza baza = new Baza();
        baza.readDate(names);
        baza.writeData(names);

    }
}
