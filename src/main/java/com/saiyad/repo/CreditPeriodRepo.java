package com.saiyad.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.saiyad.model.CreditPeriod;

public interface CreditPeriodRepo extends JpaRepository<CreditPeriod, Integer> {

}
