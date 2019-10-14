package repository.book;

import domain.book.BookDesc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookDescRepository extends JpaRepository<BookDesc,String> {
}
