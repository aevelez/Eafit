package com.eafit.edu.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eafit.edu.models.LogHistory;

@Repository
public interface ILogHistoryRepository extends JpaRepository<LogHistory,Integer>{

}
