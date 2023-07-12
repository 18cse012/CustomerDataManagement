package com.tarun.CustomerDataManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tarun.CustomerDataManagement.entity.BankAccount;

public interface BankRepository  extends JpaRepository<BankAccount, Integer>{

}
