package com.secondhandbook.org.secondhandbook.repository.user;

import com.secondhandbook.org.secondhandbook.domain.user.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepository extends JpaRepository<Admin,String> {
}
