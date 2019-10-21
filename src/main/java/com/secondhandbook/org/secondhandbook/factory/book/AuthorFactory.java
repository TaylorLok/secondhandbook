package com.secondhandbook.org.secondhandbook.factory.book;

import com.secondhandbook.org.secondhandbook.domain.book.Author;

public class AuthorFactory
{
    public static Author getAuthor(String name,String bio)
    {
        return new Author.Builder()
                         .name(name)
                         .bio(bio)
                         .build();
    }
}
