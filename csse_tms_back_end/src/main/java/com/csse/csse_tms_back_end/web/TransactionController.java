package com.csse.csse_tms_back_end.web;

import com.csse.csse_tms_back_end.model.Transaction;
import com.csse.csse_tms_back_end.services.MapValidationErrorService;
import com.csse.csse_tms_back_end.services.PassengerService;
import com.csse.csse_tms_back_end.services.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/transaction")
public class TransactionController {

    @Autowired
    private TransactionService transactionService;

    @Autowired
    private MapValidationErrorService mapValidationErrorService;

    @PostMapping("")
    public ResponseEntity<?> createNewTransaction(@Valid @RequestBody Transaction transaction, BindingResult result){

        ResponseEntity<?> errorMap = mapValidationErrorService.MapValidationService(result);
        if(errorMap!=null) return errorMap;

        Transaction transactionObj = transactionService.saveOrUpdateTransaction(transaction);
        return new ResponseEntity<Transaction>(transactionObj, HttpStatus.CREATED);
    }

    @GetMapping("/all")
    public Iterable<Transaction> getAllTransactions(){return transactionService.findAllTransactions();}
}
