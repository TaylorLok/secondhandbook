package factory.book;

import domain.book.Author;

public class AuthorFactory
{
    public static Author getAuthor(String name,String bio,String authorRegNum)
    {
        return new Author.Builder()
                         .name(name)
                         .bio(bio)
                         .authorRegNum(authorRegNum)
                         .build();
    }
}
