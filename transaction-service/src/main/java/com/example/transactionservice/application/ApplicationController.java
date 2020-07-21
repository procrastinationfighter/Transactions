package com.example.transactionservice.application;

import com.example.transactionservice.service.TransactionRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class ApplicationController {

    @GetMapping("/")
    public String printRequest(TransactionRequest request) {
        return "Request with id: " + request.getId() +
                " and name: " + request.getName() +
                " received successfully.";
    }
}
