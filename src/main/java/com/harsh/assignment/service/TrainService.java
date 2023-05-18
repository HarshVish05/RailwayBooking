package com.harsh.assignment.service;

import com.harsh.assignment.entity.TrainDetails;

import java.util.List;
import java.util.Optional;

public interface TrainService {
    String saveTrains(List<TrainDetails> details);
    List<TrainDetails> getTrains();
    Optional<TrainDetails> getTrain(Integer trainId);
    String updateDetails(TrainDetails details);
    String deleteTrain(Integer trainId);
}
