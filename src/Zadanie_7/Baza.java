package Zadanie_7;

import java.util.Scanner;

public class Baza {
    Scanner sc = new Scanner (System.in);

        void readDate ( Person [] names){
            for (int i=0 ;i<5;i++) {
                System.out.printf("Podaj %d imię\n", i+1);
                String name = sc.nextLine();
                names [i] =new Person(name);
            }
        }

        void writeData (Person[] names){
            int i = names.length;
            do {
                --i;
                System.out.println("Cześć " + names[i].getName());
            }while (i>0);
        }


}
