package com.harsh.assignment.controller;

import com.harsh.assignment.entity.Booking;
import com.harsh.assignment.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/noauth")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/bookticket")
    public String bookTicket(@RequestBody() Booking book){
        return userService.bookticket(book);
    }

    @GetMapping("/getticket")
    public List<Booking> getTicket(){
        return userService.showMyticket();
    }

    @DeleteMapping("/delticket")
    public String cancelTicket(@RequestParam("id") Integer id){
        return userService.cancelTicket(id);
    }
}
