package factory.book;


import domain.book.BookDesc;

public class BookDescFactory
{
  public static BookDesc getBookDescription(String bookTitle,String author,String bookPrice,
                                            String IBNnumber,String publicationDate,String bookLanguage)
  {
      return new BookDesc.Builder()
                          .Author(author)
                          .bookTitle(bookTitle)
                          .bookLanguage(bookLanguage)
                          .publicationDate(publicationDate)
                          .bookPrice(bookPrice)
                          .IBNnumber(IBNnumber)
                           .build();
  }
}
