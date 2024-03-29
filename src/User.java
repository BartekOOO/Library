import java.util.ArrayList;

class User{
    private String firstName;
    private String lastName;
    private ArrayList<Item> wypozyczonePrzedmioty;

    public User(String firstName,String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        this.wypozyczonePrzedmioty = new ArrayList<Item>();
    }

    public void dodajPrzedmiot(Item przedmiot)
    {
        wypozyczonePrzedmioty.add(przedmiot);
    }


    public void wypiszCoWypozyczyles()
    {
        if(wypozyczonePrzedmioty.size()>0) {
            System.out.println(getUserInformation());
            for(int i=0;i<wypozyczonePrzedmioty.size();i++)
            {
                System.out.println(this.wypozyczonePrzedmioty.get(i).getItemInformation());
            }
        }
        else
        {
            System.out.println("Uzytkownik "+this.getUserInformation()+" nie posiada zadnych wypozyczonych ksiazek");
        }
    }

    public void usunPrzedmiot(Item przedmiot)
    {
        this.wypozyczonePrzedmioty.remove(przedmiot);
    }

    public String getUserInformation(){
        return this.firstName+" "+this.lastName;
    }



}