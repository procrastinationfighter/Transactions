package pl.adamboguszewski.transactionservice.service;

import org.springframework.stereotype.Service;

@Service
public class TransactionRequest {

    private final String id;

    private final String name;

    public TransactionRequest(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
