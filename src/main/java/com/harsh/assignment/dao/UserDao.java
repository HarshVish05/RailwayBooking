package com.harsh.assignment.dao;

import com.harsh.assignment.entity.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<Booking,Integer> {
}
