package com.example.TestController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {

    @Autowired
    private TestService testService;

    @RequestMapping("/tests")
    public List<TestModel> getAllTests(){
        return testService.getAllTests();
    }

    @RequestMapping(method = RequestMethod.POST, value = "/tests")
    public void createTest(@RequestBody TestModel testModel){
        testService.createTest(testModel);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/tests")
    public void deleteTest(@RequestBody TestModel testModel){
        testService.deleteTest(testModel);
    }
}
