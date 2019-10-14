package domain.book;

import javax.persistence.*;

@Entity
public class BookDesc
{
    @Column(name = "bookTitle",columnDefinition = "VARCHAR(100)",nullable = false)
    private String bookTitle;
    @Column(name = "author",columnDefinition = "VARCHAR(35)",nullable = false)
    private String author;
    @Column(name = "bookPrice",columnDefinition = "VARCHAR(35)",nullable = false)
    private String bookPrice;
    @Id
    @Column(name = "IBNnumber",columnDefinition = "VARCHAR(50)",nullable = false)
    private String IBNnumber;
    @Column(name = "publicationDate",columnDefinition = "VARCHAR(100)",nullable = false)
    private  String publicationDate;
    @Column(name = "bookLanguage",columnDefinition = "VARCHAR(35)",nullable = false)
    private String bookLanguage;


    public BookDesc()
    {

    }

    public BookDesc (Builder builder)
    {
        this.author = builder. author;
        this.bookLanguage = builder. bookLanguage;
        this.bookPrice = builder.bookPrice;
        this.bookTitle = builder.bookTitle;
        this.publicationDate = builder. publicationDate;
        this.IBNnumber = builder.IBNnumber;
    }

    public String getBookTitle()
    {
        return bookTitle;
    }

    public String getAuthor()
    {
        return author;
    }

    public String getBookPrice()
    {
        return bookPrice;
    }

    public String getIBNnumber()
    {
        return IBNnumber;
    }

    public String getPublicationDate()
    {
        return publicationDate;
    }

    public String getBookLanguage()
    {
        return bookLanguage;
    }

    public static class Builder
    {
        private String bookTitle;
        private String author;
        private String bookPrice;
        private String IBNnumber;
        private  String publicationDate;
        private String bookLanguage;

        public Builder bookTitle(String bookTitle)
        {
            this.bookTitle = bookTitle;
            return this;
        }

        public Builder Author(String author)
        {
            this.author = author;
            return this;
        }

        public Builder bookPrice(String bookPrice)
        {
            this.bookPrice = bookPrice;
            return this;
        }

        public Builder IBNnumber(String IBNnumber)
        {
            this.IBNnumber = IBNnumber;
            return this;
        }

        public Builder publicationDate(String publicationDate)
        {
            this.publicationDate = publicationDate;
            return this;
        }

        public Builder bookLanguage(String bookLanguage)
        {
            this.bookLanguage = bookLanguage;
            return this;
        }

        public BookDesc build()
        {
            return new BookDesc(this);

        }

    }

}
