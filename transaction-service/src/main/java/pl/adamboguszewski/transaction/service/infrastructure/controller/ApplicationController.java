package pl.adamboguszewski.transaction.service.infrastructure.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.adamboguszewski.transaction.service.api.transaction.CreateTransactionRequest;

@RestController
@RequestMapping("/")
public class ApplicationController {

//     [TODO]:
//
//    At this moment our service, module, controller is doing pretty nothing, we need to change that behaviour.
//    As you can see I added ("/") param to @RequestMapping annotation above this class, what it does? Read by yourself.
//    Our controller should AT LEAST have some basic functionality, the most basic functionality are named CRUD which is
//    acronym of Create (post), Read (get), Update (put) and Delete (delete). In the braces are Http methods that correspond
//    with basic CRUD functionality (https://www.restapitutorial.com/lessons/httpmethods.html). Controller responsibility
//    is to create api which can be called by some client app (for example postman or just the browser), we already implemented
//    one get method (printRequest()). If we send a proper request as GET method our application is called (and do shit
//    but we will change that); We need to create http api for our CRUD methods here and then implement those CRUD
//    methods in our TransactionService, which we don't have yet.
//    Your first job is to publish api with five paths:
//    GET     /transaction-service/api/       to get all transactions
//    GET     /transaction-service/api/id     to get transaction by ID
//    POST    /transaction-service/api/       to create new transaction
//    PUT     /transaction-service/api/id     to edit existing transaction
//    DELETE  /transaction-service/api/id     to delete existing transaction
//    Every path is one method here. How to create methods here? Read about @RestController. What should our methods do?
//    Call the TransactionService for proper CRUD method. The only implementation in TransactionService should be the C letter
//    (public Transaction createTransaction(CreateTransactionRequest) { ... }) but do at least callable functions in the class
//    for every method implemented here. What should our controller return? CreateReturnTransactionResponse for POST method and String
//    with some info in others.

    @GetMapping("/")
    public String printRequest(CreateTransactionRequest request) {
        return "Request of total price: " + request.getTotalPrice() +
                " and products: " + request.getProducts().toString() + " received successfully.";
    }
}
