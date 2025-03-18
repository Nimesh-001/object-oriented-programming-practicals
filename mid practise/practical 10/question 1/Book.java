public class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

   public void addbook(String title,String author){
       System.out.println("book added: "+title+" author:"+author);

   }

   public void addbook(String title,String author,int year){
       System.out.println("book added: "+title+" author:"+author+" year:"+year);

   }

   public String getdiscription(){
	   return "title:"+title+"author:"+author;
   }
}
