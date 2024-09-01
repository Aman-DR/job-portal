package com.example.Dotworld.Job.Portal.controller;


import com.example.Dotworld.Job.Portal.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    CustomerService customerservice;

    @GetMapping("/getjob")
    public String getJobs(){

        return customerservice.getJobs();
    }

    @GetMapping("/getjob/1")   // {jobId}
    public String getJobById(Integer jobId){  //@PathVariable
        return customerservice.getJobById(jobId);
    }

    @GetMapping("/getJob/1")  //{customerId}
    public String getJobByCustomerId(Integer customerId){  //@PathVariable
        return customerservice.getJobByCustomerId(customerId);
    }

    @PostMapping("/create")
    public String createJob(@RequestBody String Job){
        return customerservice.createJob();
    }

    @PutMapping("/update/1")   //{jobId}
    public String updateJob(Integer jobId){
        return customerservice.updateJob(jobId);
    }

    @DeleteMapping("/delete/1")
        public String deleteJob(Integer jobId){
            return customerservice.deleteJob(jobId);
        }







}
