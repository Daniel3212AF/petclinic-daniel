package org.springframework.samples.petclinic.bill.dao;

import org.springframework.data.repository.Repository;
import org.springframework.samples.petclinic.bill.dto.Bill;

import java.time.LocalDate;
import java.util.List;

public interface BillRepository extends Repository<Bill, Integer> {

	List<Bill> findByBilldateIsNull();

	List<Bill> findByBilldateIsNotNull();

	Bill findById(Integer id);

	void save(Bill bill);

}
