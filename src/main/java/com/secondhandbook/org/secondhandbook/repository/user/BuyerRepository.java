package com.secondhandbook.org.secondhandbook.repository.user;

import com.secondhandbook.org.secondhandbook.domain.user.Buyer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BuyerRepository  extends JpaRepository<Buyer,String> {
}
