package com.saiyad.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.saiyad.model.BalanceSheet;

public interface BalanceSheetRepository extends JpaRepository<BalanceSheet, Long> {

}
