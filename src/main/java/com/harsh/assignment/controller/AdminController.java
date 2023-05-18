package com.harsh.assignment.controller;

import com.harsh.assignment.entity.TrainDetails;
import com.harsh.assignment.service.TrainServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/rest/auth")
public class AdminController {

    @Autowired
    private TrainServiceImp trainService;

    @PostMapping("/savetrains")
    public String saveTrain(@RequestBody() List<TrainDetails> details){
        return trainService.saveTrains(details);
    }

    @GetMapping("/gettrains")
    public List<TrainDetails> getTrains(){
        return trainService.getTrains();
    }

    @GetMapping("/gettrain")
    public Optional<TrainDetails> getTrain(@RequestParam("trainId") Integer trainId){
        return trainService.getTrain(trainId);
    }

    @PutMapping("/updatetrains")
    public String updateTrain(@RequestBody TrainDetails details){
        return trainService.updateDetails(details);
    }

    @DeleteMapping("/deletetrains")
    public String deleteTrain(@RequestParam("id")Integer id){
        return trainService.deleteTrain(id);
    }
}
