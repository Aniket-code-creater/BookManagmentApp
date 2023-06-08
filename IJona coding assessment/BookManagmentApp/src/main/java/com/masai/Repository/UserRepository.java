package com.masai.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.masai.Entiy.User;

public interface UserRepository extends JpaRepository<User, Integer>{

}
