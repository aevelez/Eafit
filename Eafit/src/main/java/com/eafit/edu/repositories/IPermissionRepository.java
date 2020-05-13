package com.eafit.edu.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eafit.edu.models.Permission;

@Repository
public interface IPermissionRepository extends JpaRepository<Permission,String>{

}
