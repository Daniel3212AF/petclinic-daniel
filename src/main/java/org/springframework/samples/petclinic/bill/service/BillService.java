package org.springframework.samples.petclinic.bill.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.samples.petclinic.bill.dao.BillRepository;
import org.springframework.samples.petclinic.bill.dto.Bill;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BillService {

	@Autowired
	private BillRepository billRepository;

	public List<Bill> buscarBillsPagadas() {
		return this.billRepository.findByBilldateIsNotNull();
	}

	public List<Bill> buscarBillsNoPagadas() {
		return this.billRepository.findByBilldateIsNull();
	}

	public Bill findById(Integer id) {
		return this.billRepository.findById(id);
	}

	public void save(Bill bill) {
		this.billRepository.save(bill);
	}

}
