class Book extends Item{

    private int pageCount;
    private String genre;
    private String language;
    public Book(String title,String author,int year,boolean isAvailable,int pageCount,String genre,String language)
    {
        super(title,author,year,isAvailable);
        this.pageCount = pageCount;
        this.genre = genre;
        this.language = language;
    }

    @Override
    public String getItemInformation(){
        return super.getItemInformation()+this.pageCount+" stron, gatunek: "+this.genre+", język: "+this.language;
    }

}