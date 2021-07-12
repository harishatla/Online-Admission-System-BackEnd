package com.onlineadmission.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.onlineadmission.entity.CollegeEntity;

@Repository
public interface CollegeJpaDao extends JpaRepository<CollegeEntity, Integer>{

	
}
