package com.eafit.edu.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eafit.edu.models.Role;

@Repository
public interface IRoleRepository extends JpaRepository<Role, String>{ 

}
