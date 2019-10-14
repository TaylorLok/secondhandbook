package repository.user;

import domain.user.Buyer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BuyerRepository  extends JpaRepository<Buyer,String> {
}
