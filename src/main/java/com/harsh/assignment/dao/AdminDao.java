package com.harsh.assignment.dao;

import com.harsh.assignment.entity.TrainDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminDao extends JpaRepository<TrainDetails,Integer> {
}
