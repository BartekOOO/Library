abstract class Item implements Viewable
{
    protected String title;
    protected String author;
    protected int year;
    protected boolean isAvailable;
    protected  int views;

    public Item(String title,String author,int year,boolean isAvailable){
        this.title = title;
        this.author = author;
        this.year = year;
        this.isAvailable = isAvailable;
        this.views = 0;
    }

    public void zmienDostepnosc()
    {
        if(this.isAvailable) {
            this.isAvailable = false;
        }
        else{
            this.isAvailable = true;
        }
    }
    @Override
    public int getViewCount()
    {
        return  this.views;
    }
    @Override
    public void incrementViewCount(){
        this.views++;
    }

    boolean getIsAvailable()
    {
        return this.isAvailable;
    }

    public String getItemInformation(){
        String dostepna = "Wypozyczona";
        if(this.isAvailable)
        {
            dostepna = "Dostepna";
        }
        return this.author+" '"+this.title+"' "+this.year+" >>Status: "+dostepna+"<<";
    }
}