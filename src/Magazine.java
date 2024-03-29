class Magazine extends Item{
    private int issueNumber;
    private int month;
    private String theme;
    public Magazine(String title,String author,int year,boolean isAvailable,int issueNumber,int month,String theme)
    {
        super(title,author,year,isAvailable);
        this.issueNumber = issueNumber;
        this.theme = theme;
        this.month = month;
        if(this.month>12)
        {
            this.month = 12;
        }

    }
    @Override
    public String getItemInformation(){
        return super.getItemInformation()+this.issueNumber+" miesiąc wydania: "+this.month+" tematyka: "+this.theme;
    }
}