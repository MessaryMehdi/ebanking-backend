package com.example.ebankingbackend.services;

import com.example.ebankingbackend.entities.BankAccount;
import com.example.ebankingbackend.entities.CurrentAccount;
import com.example.ebankingbackend.entities.Customer;
import com.example.ebankingbackend.entities.SavingAccount;
import com.example.ebankingbackend.exceptions.BalanceNotSufficientException;
import com.example.ebankingbackend.exceptions.BankAccountNorFoundException;
import com.example.ebankingbackend.exceptions.CustomerNotFoundException;

import java.util.List;
public interface BankAccountService {
     Customer saveCustomer(Customer customer);
     CurrentAccount saveCurrentBankAccount(Double initialBalance, double overDraft , Long customerId) throws CustomerNotFoundException;
     SavingAccount saveSavingBankAccount(Double initialBalance, double interestRate , Long customerId) throws CustomerNotFoundException;
     List<Customer> listCustomer();
     BankAccount getBankAccount(String accountId) throws BankAccountNorFoundException;
     void debit(String accountId, double amount, String description ) throws BankAccountNorFoundException, BalanceNotSufficientException;
     void credit(String accountId, double amount, String description ) throws BankAccountNorFoundException;
     void transfer(String accountIdSource, String accountIdDestination, double amount) throws BankAccountNorFoundException, BalanceNotSufficientException;


     List<BankAccount>bankAccountList();
}
