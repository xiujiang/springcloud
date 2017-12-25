package com.joel.Dao;

import com.joel.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by joel on 2017/12/16.
 * dao层
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
