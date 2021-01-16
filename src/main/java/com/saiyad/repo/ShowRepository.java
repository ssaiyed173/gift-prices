package com.saiyad.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.saiyad.model.Show;

public interface ShowRepository extends JpaRepository<Show, Long> {

	List<Show> findByActive(String string);

}
