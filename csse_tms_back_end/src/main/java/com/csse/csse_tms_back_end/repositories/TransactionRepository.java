package com.csse.csse_tms_back_end.repositories;

import com.csse.csse_tms_back_end.model.Transaction;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionRepository extends CrudRepository<Transaction, Long> {

    @Override
    Iterable<Transaction> findAll();
}

