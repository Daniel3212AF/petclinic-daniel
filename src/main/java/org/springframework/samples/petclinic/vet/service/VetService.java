package org.springframework.samples.petclinic.vet.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.samples.petclinic.vet.dao.VetRepository;
import org.springframework.samples.petclinic.vet.dto.Vet;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

@Service
public class VetService {

	@Autowired
	VetRepository vr;

	public Collection<Vet> findAll() {
		return vr.findAll();
	}

	public Page<Vet> findAll(Pageable pageable) {
		return vr.findAll(pageable);
	}

	public Vet findById(Integer id) {
		return vr.findById(id);
	}

	public Vet save(Vet vet) {
		return vr.save(vet);
	}

	public List<Vet> buscarPorRadiology() {
		return vr.buscarPorRadiology();
	}

}
