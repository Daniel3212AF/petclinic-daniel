package org.springframework.samples.petclinic.visit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.samples.petclinic.visit.dao.VisitRepository;
import org.springframework.samples.petclinic.visit.dto.Visit;
import org.springframework.stereotype.Service;

import java.awt.print.Pageable;
import java.util.List;

@Service
public class VisitService {

	@Autowired
	private VisitRepository vr;

	public List<Visit> buscarUltimas(PageRequest paginacion) {
		return vr.buscarUltimas(paginacion);
	}

	public Visit buscarVisita(Integer id) {
		return vr.findById(id);
	}

}
