package com.harsh.assignment.service;

import com.harsh.assignment.dao.UserDao;
import com.harsh.assignment.entity.Booking;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserServiceImp implements UserService{
    @Autowired
    private UserDao userDao;

    @Override
    public String bookticket(Booking book) {
        userDao.save(book);
        return "Ticket Booked";
    }

    @Override
    public List<Booking> showMyticket() {
        return userDao.findAll();
    }

    @Override
    public String cancelTicket(Integer id) {
        userDao.deleteById(id);
        return "Ticket cancelled";
    }
}
