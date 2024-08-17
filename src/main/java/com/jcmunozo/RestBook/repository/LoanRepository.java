package com.jcmunozo.RestBook.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jcmunozo.RestBook.model.Loan;

@Repository
public interface LoanRepository extends JpaRepository<Loan, Integer> {
}