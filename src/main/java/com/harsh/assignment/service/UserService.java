package com.harsh.assignment.service;

import com.harsh.assignment.entity.Booking;

import java.util.List;

public interface UserService {
    String bookticket(Booking book);

    List<Booking> showMyticket();

    String cancelTicket(Integer id);

}
