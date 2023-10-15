package com.gk.rest.api.user.repo;

import com.gk.rest.api.user.dto.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
