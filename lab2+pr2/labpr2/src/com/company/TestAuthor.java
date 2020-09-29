package com.company;

public class TestAuthor {
    public static void main(String[] args){
        Author author = new Author("Jack", "lol@mail.com", 'M');
        System.out.println(author.toString());
        author.setEmail("Jack@yandex.ru");
        System.out.print(author.toString());
    }
}
