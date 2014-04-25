package com.mediaiq.bi.server.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.mediaiq.bi.server.domain.Book;
import com.mediaiq.bi.server.domain.LendRecords;;

public interface LendRepo extends JpaRepository<LendRecords, Long> {
	public List<LendRecords> findByPersonName(String name);
	

	
}