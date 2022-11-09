package org.springframework.samples.petclinic.owner.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.samples.petclinic.owner.dao.OwnerRepository;
import org.springframework.samples.petclinic.owner.dto.Owner;
import org.springframework.samples.petclinic.pet.dto.PetType;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OwnerService {

	@Autowired
	private OwnerRepository or;

	public List<PetType> findPetTypes() {
		return this.or.findPetTypes();
	}

	public Page<Owner> findByLastName(String lastName, Pageable pageable) {
		return this.or.findByLastName(lastName, pageable);
	}

	public Owner findById(Integer id) {
		return this.or.findById(id);
	}

	public void save(Owner owner) {
		this.or.save(owner);
	}

	public Page<Owner> findAll(Pageable pageable) {
		return this.or.findAll(pageable);
	}

}
