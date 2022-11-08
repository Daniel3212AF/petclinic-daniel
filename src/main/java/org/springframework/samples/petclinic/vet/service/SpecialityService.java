package org.springframework.samples.petclinic.vet.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.samples.petclinic.vet.dao.SpecialityRepository;
import org.springframework.samples.petclinic.vet.dao.VetRepository;
import org.springframework.samples.petclinic.vet.dto.Specialty;
import org.springframework.samples.petclinic.vet.dto.Vet;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

@Service
public class SpecialityService {

	@Autowired
	SpecialityRepository sr;

	public Specialty findById(Integer id) {
		return sr.findById(id);
	}

}
