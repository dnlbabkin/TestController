package com.example.TestController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TestService {

    @Autowired
    private TestRepository testRepository;

    public List<TestModel> getAllTests(){
        List<TestModel> models = new ArrayList<>();
        testRepository.findAll().forEach(models :: add);

        return models;
    }

    public void createTest(TestModel testModel){
        testRepository.save(testModel);
    }

    public void deleteTest(TestModel testModel){
        testRepository.delete(testModel);
    }
}
