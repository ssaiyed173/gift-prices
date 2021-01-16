package com.saiyad.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.saiyad.model.Price;
import com.saiyad.model.Show;

public interface PriceRepository extends JpaRepository<Price, Long> {

	@Override
	List<Price> findAll();

	@Query("SELECT SUM(amount) FROM Price WHERE credited = false AND type = 'Gift Voucher'")
	Integer findPendingGiftVouchers();

	@Query("SELECT SUM(amount) FROM Price WHERE credited = false AND type = 'Super Coin'")
	Integer findPendingSuperCoins();

}
