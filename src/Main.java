public class Main {
    public static void main(String[] args) {

        //Dodawanie uzytkownikow
    User uzytkownik1 = new User("Bartłomiej","Władimiruk");
    User uzytkownik2 = new User("Ola","Kocyk");
    User uzytkownik3 = new User("Mikołaj","Władimiruk");
    User uzytkownik4 = new User("Grzegorz","Dudziak");


        //Dodawanie książek
    Book ksiazka1 = new Book("Chłopcy z placu broni","Ferenc Molnár",1907,true,178,"Powiesc","Polski");
    Book ksiazka2 = new Book("Harry Potter i Kamień Filozoficzny", "J.K. Rowling", 1997, true, 320, "Fantastyka", "Angielski");
    Book ksiazka3 = new Book("Władca Pierścieni: Drużyna Pierścienia", "J.R.R. Tolkien", 1954, true, 432, "Fantasy", "Polski");
    Book ksiazka4 = new Book("Zabójstwo Rogera Ackroyda", "Agatha Christie", 1926, true, 250, "Kryminał", "Angielski");

        //Dodawanie magazynów
    Magazine magazyn1 = new Magazine("National Geographic", "Various", 2023, true, 150, 3, "Przyroda");
    Magazine magazyn2 = new Magazine("Time", "Various", 2023, true, 100, 5, "Aktualności");

        //Inicjowanie biblioteki
    Library biblioteka = new Library();

        //Dodawanie uzytkownikow do biblioteki
    biblioteka.addUser(uzytkownik1);
    biblioteka.addUser(uzytkownik2);
    biblioteka.addUser(uzytkownik3);
    biblioteka.addUser(uzytkownik4);

    //Dodawanie ksiązek i magazynów do biblioteki
    biblioteka.addItem(ksiazka1);
    biblioteka.addItem(ksiazka2);
    biblioteka.addItem(ksiazka3);
    biblioteka.addItem(ksiazka4);
    biblioteka.addItem(magazyn1);
    biblioteka.addItem(magazyn2);


    System.out.println("Uzytkownicy biblioteki:");
    biblioteka.users();
    System.out.println("Ksiazki biblioteki:");
    biblioteka.items();

    biblioteka.wypozycz(1,6);
    biblioteka.wypozycz(2,6);
    biblioteka.wypozycz(2,5);
    biblioteka.wypozycz(2,1);

    uzytkownik1.wypiszCoWypozyczyles();
    uzytkownik2.wypiszCoWypozyczyles();
    uzytkownik3.wypiszCoWypozyczyles();
    uzytkownik4.wypiszCoWypozyczyles();

    System.out.println("Ksiazki biblioteki po wypozyczeniu: ");
    biblioteka.items();

    biblioteka.oddaj(1,6);

    uzytkownik1.wypiszCoWypozyczyles();


    biblioteka.wypozycz(4,6);

    uzytkownik4.wypiszCoWypozyczyles();

    }
}