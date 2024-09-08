package com.quixindo.domain.repository;

import com.quixindo.domain.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Users, Long> {
}
