package com.jcmunozo.RestBook.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jcmunozo.RestBook.model.Loan;
import com.jcmunozo.RestBook.repository.LoanRepository;

import java.util.List;
import java.util.Optional;

@Service
public class LoanService {
    @Autowired
    private LoanRepository loanRepository;

    public Loan create(Loan loan) {
    	return loanRepository.save(loan);
    }
    
    public Loan update(Loan loan) {
    	return loanRepository.save(loan);
    }
    
    public List<Loan> getAllLoans() {
        return loanRepository.findAll();
    }

    public Loan getLoanById(Integer id) {
        Optional<Loan> loan = loanRepository.findById(id);
    	return loan.orElse(null);
    }
    
    public void deleteLoan(Integer id) {
        loanRepository.deleteById(id);
    }
}
