package com.csse.csse_tms_back_end.services;

import com.csse.csse_tms_back_end.exceptions.TransactionIdException;
import com.csse.csse_tms_back_end.model.Transaction;
import com.csse.csse_tms_back_end.repositories.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransactionService {

    @Autowired
    private TransactionRepository transactionRepository;

    public Transaction saveOrUpdateTransaction(Transaction transaction){

        try{
            transaction.setTransactionId(transaction.getTransactionId());
            return transactionRepository.save(transaction);
        }catch (Exception e){
            throw new TransactionIdException("Transaction ID '"+ transaction.getTransactionId() + "' already exists");
        }
    }

    public Iterable<Transaction> findAllTransactions(){
        return transactionRepository.findAll();
    }
}
