public class Demo {
    public static void main(String[] args) {
        Book b=new Book("java  ","ab");
        System.out.println(b.getdiscription());


        Printedbook printedbook=new Printedbook("aaaaa","bbbb");
        System.out.println(printedbook.getdiscription());


        Ebook ebook=new Ebook("ccccc","dddd");
        System.out.println(ebook.getdiscription());

    }
}
