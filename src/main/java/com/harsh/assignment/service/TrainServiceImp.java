package com.harsh.assignment.service;

import com.harsh.assignment.dao.AdminDao;
import com.harsh.assignment.entity.TrainDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class TrainServiceImp implements TrainService{

    @Autowired
    private AdminDao admindao;
    @Override
    public String saveTrains(List<TrainDetails> details) {
        admindao.saveAll(details);
        return "Train details added successfully";
    }

    @Override
    public List<TrainDetails> getTrains() {
        return admindao.findAll();
    }

    @Override
    public Optional<TrainDetails> getTrain(Integer trainId) {
        return (Optional<TrainDetails>)admindao.findById(trainId);
    }

    @Override
    public String updateDetails(TrainDetails details) {
        admindao.save(details);
        return "Train Details Updated";
    }

    @Override
    public String deleteTrain(Integer trainId) {
        admindao.deleteById(trainId);
        return "Train Details Deleted";
    }
}
