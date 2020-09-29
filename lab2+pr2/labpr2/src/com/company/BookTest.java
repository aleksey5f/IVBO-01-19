package com.company;

public class BookTest {
    public static void main(String[] args) {
        Book book=new Book("Aleks", "Ultrabook", 2001, 134);
        System.out.println(book.getAuthor()+" "+book.getName()+" "+book.getYear()+" "+book.getNumberofpages());
        book.setAuthor("John");
        book.setName("Loli");
        book.setYear(1960);
        book.setNumberofpages(55);
        System.out.print(book.getAuthor()+" "+book.getName()+" "+book.getYear()+" "+book.getNumberofpages());
    }
}
