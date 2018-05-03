package com.makooslee.makoosleeapp.User.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.makooslee.makoosleeapp.User.User;

public interface UserRepository extends JpaRepository<User, Long> {

}

