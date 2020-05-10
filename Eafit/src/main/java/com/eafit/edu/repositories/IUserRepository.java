package com.eafit.edu.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eafit.edu.models.UserEafit;

public interface IUserRepository extends JpaRepository<UserEafit, String>{

}
