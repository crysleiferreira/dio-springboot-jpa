package com.spring_data_jpa.projeto_jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring_data_jpa.projeto_jpa.model.User;

public interface UserRepository extends JpaRepository<User,Integer> {

     
}
