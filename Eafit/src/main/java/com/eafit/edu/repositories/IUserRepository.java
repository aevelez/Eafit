package com.eafit.edu.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eafit.edu.models.UserEafit;

@Repository
public interface IUserRepository extends JpaRepository<UserEafit, String>{

}
