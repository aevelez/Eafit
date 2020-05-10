package com.eafit.edu.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eafit.edu.models.User;

public interface IUserRepository extends JpaRepository<User, String>{

}
