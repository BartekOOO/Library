import java.util.ArrayList;

class Library{

    private ArrayList<Item> itemList;
    private ArrayList<User> userList;
    private  ArrayList<Presentation> presentations;


    public Library(){
        this.itemList = new ArrayList<Item>();
        this.userList = new ArrayList<User>();
        this.presentations = new ArrayList<Presentation>();
    }

    public void users()
    {
        for(int i=0;i<this.userList.size();i++)
        {
            System.out.println((i+1)+"."+this.userList.get(i).getUserInformation());
        }
    }

    public void items()
    {
        for(int i=0;i<this.itemList.size();i++)
        {
            System.out.println(i+1+". "+itemList.get(i).getItemInformation());
        }
    }

    public void addUser(User user)
    {
        this.userList.add(user);
    }

    public void addItem(Item item)
    {
        this.itemList.add(item);
    }

    public void wypozycz(int userId,int przedmiotId) {
        if(itemList.get(przedmiotId-1).isAvailable) {
            itemList.get(przedmiotId - 1).zmienDostepnosc();
            userList.get(userId - 1).dodajPrzedmiot(itemList.get(przedmiotId - 1));
        }
        else{
            System.out.println("Książka jest wypożyczona przez kogos innego");
        }
    }

    public  void  oddaj(int userId, int itemId)
    {
        if(!itemList.get(itemId-1).isAvailable) {
            itemList.get(itemId - 1).zmienDostepnosc();
            userList.get(userId - 1).usunPrzedmiot(itemList.get(itemId-1));
        }
        else{
            System.out.println("Książka jest dostępna");
        }
    }

}