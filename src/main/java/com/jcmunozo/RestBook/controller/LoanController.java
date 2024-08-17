package com.jcmunozo.RestBook.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.jcmunozo.RestBook.model.Loan;
import com.jcmunozo.RestBook.service.LoanService;

import java.util.List;

@RestController
@RequestMapping("/api/loans")
public class LoanController {
    @Autowired
    private LoanService loanService;

    @GetMapping
    public List<Loan> getAllLoans() {
        return loanService.getAllLoans();
    }

    @GetMapping("/{id}")
    public Loan getLoanById(@PathVariable Integer id) {
        return loanService.getLoanById(id);
    }

    @PostMapping
    public ResponseEntity<Loan> createLoan(@RequestBody Loan loan) {
        Loan savedLoan = loanService.create(loan);
        return new ResponseEntity<>(savedLoan, HttpStatus.CREATED);
    }
    
    @PutMapping
    public Loan updateLoan(@RequestBody Loan loan) {
    	return loanService.update(loan);
    }

    @DeleteMapping("/{id}")
    public void deleteLoan(@PathVariable Integer id) {
        loanService.deleteLoan(id);
    }
}
