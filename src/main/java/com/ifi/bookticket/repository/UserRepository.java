package com.ifi.bookticket.repository;

import com.ifi.bookticket.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

@org.springframework.stereotype.Repository
public interface UserRepository extends JpaRepository<User,Integer> {
}
