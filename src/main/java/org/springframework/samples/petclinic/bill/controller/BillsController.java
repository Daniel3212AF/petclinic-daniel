package org.springframework.samples.petclinic.bill.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.samples.petclinic.bill.dto.Bill;
import org.springframework.samples.petclinic.bill.service.BillService;
import org.springframework.samples.petclinic.visit.service.VisitService;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/bills")
public class BillsController {

	@Autowired
	private BillService billService;

	@Autowired
	private VisitService visitService;

	@GetMapping("")
	public ResponseEntity<List<Bill>> buscarBills(@RequestParam(name = "filter") String filtro) {
		List<Bill> listBill = null;
		if (filtro.equals("pagadas")) {
			listBill = this.billService.buscarBillsPagadas();
		}
		else if (filtro.equals("no_pagadas")) {
			listBill = this.billService.buscarBillsNoPagadas();
		}
		return new ResponseEntity<>(listBill, HttpStatus.OK);
	}

	@GetMapping("{idBill}/visit/{idVisit}")
	public ResponseEntity<Bill> detallesBill(@PathVariable("idBill") Integer idBill,
			@PathVariable("idVisit") Integer idVisit) {
		return new ResponseEntity<>(this.billService.findById(idBill), HttpStatus.OK);
	}

	@PutMapping("{idBill}/visit/{idVisit}")
	public ResponseEntity<Bill> crearActualizarBill(@PathVariable("idBill") Integer idBill,
			@PathVariable("idVisit") Integer idVisit, @RequestParam("billdate") String fecha,
			@RequestParam("importe") Double importe) {
		LocalDate billdate = LocalDate.parse(fecha);
		Bill bill = new Bill();
		if (idBill == 0) {
			bill.setVisit(visitService.buscarVisita(idVisit));
			bill.setBilldate(billdate);
			bill.setImporte(importe);
		}
		else {
			bill = billService.findById(idBill);
			bill.setId(idBill);
			bill.setBilldate(billdate);
			bill.setImporte(importe);
		}
		this.billService.save(bill);
		return new ResponseEntity<>(bill, HttpStatus.OK);

	}

}
