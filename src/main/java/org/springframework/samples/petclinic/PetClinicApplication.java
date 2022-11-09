/*
 * Copyright 2012-2019 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.samples.petclinic;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.domain.PageRequest;
import org.springframework.samples.petclinic.pet.dao.PetRepository;
import org.springframework.samples.petclinic.visit.dao.VisitRepository;
import org.springframework.samples.petclinic.pet.dto.Pet;
import org.springframework.samples.petclinic.visit.dto.Visit;
import org.springframework.samples.petclinic.vet.dao.SpecialityRepository;
import org.springframework.samples.petclinic.vet.dto.Specialty;
import org.springframework.samples.petclinic.vet.dto.Vet;
import org.springframework.samples.petclinic.vet.dao.VetRepository;

import java.time.LocalDate;

/**
 * PetClinic Spring Boot Application.
 *
 * @author Dave Syer
 *
 */
@SpringBootApplication
@Slf4j
public class PetClinicApplication {

	public static void main(String[] args) {
		SpringApplication.run(PetClinicApplication.class, args);
	}
	// Practica

	// @Bean
	// public CommandLineRunner demoVetRepository(VetRepository vetRepository,
	// SpecialityRepository specialityRepository,
	// PetRepository pr, VisitRepository vr) {
	//
	// return (args) -> {
	// System.out.println("Texto");
	// log.info("*****************************************************");
	//
	// log.info("BOOTCAMP - Spring y Spring Data - vetRepository");
	//
	// log.info("*****************************************************");
	//
	// log.info("Creamos un objeto Vet");
	//
	// Vet vet = new Vet();
	//
	// vet.setFirstName("Sergio");
	//
	// vet.setLastName("Raposo Vargas");
	//
	// log.info("Persistimos en BBDD");
	//
	// vetRepository.BorrarPorNombre("Sergio");
	//
	// vet = vetRepository.save(vet);
	//
	// log.info("Comprobamos que se ha creado correctamente");
	//
	// Vet vetAux = vetRepository.findById(vet.getId());
	//
	// log.info(vetAux.toString());
	//
	// log.info("Editamos el objeto y añadimos una Speciality");
	//
	// Specialty s = specialityRepository.findById(1);
	//
	// vet.addSpecialty(s);
	//
	// vet = vetRepository.save(vet);
	//
	// log.info(vet.toString());
	//
	// log.info("Listamos todos los veterinarios");
	//
	// for (Vet v : vetRepository.findAll()) {
	//
	// log.info("Vet: " + v.getFirstName());
	//
	// }
	//
	// for (Vet v : vetRepository.buscarPorRadiology()) {
	//
	// log.info("Vet: " + v.getFirstName() + "Especialidad " + v.getSpecialties());
	//
	// }
	//
	// // Obtener las mascotas nacidas en 2010 ordenadas por fecha de nacimiento
	// // ascendente
	// log.info("Obtener las mascotas nacidas en 2010 ordenadas por fecha de nacimiento
	// ascendente");
	// for (Pet v : pr.buscarPorOrden(LocalDate.parse("2010-01-01"),
	// LocalDate.parse("2010-12-31"))) {
	//
	// log.info(v.toString());
	//
	// }
	//
	// // Crear 3 visitas nuevas para diferentes mascotas
	// log.info("Crear 3 visitas nuevas para diferentes mascotas");
	// Pet pet = pr.findById(2);
	// Visit visit = new Visit(LocalDate.parse("2023-11-08"), "prueba1");
	// pet.addVisit(visit);
	// visit = new Visit(LocalDate.parse("2022-11-10"), "prueba2");
	// pet.addVisit(visit);
	// visit = new Visit(LocalDate.parse("2022-11-12"), "prueba3");
	// pet.addVisit(visit);
	// pr.save(pet);
	//
	// // Obtener todas las visitas para una mascota
	// log.info("Obtener todas las visitas para una mascota");
	// pet = pr.findById(1);
	//
	// for (Visit visit2 : pet.getVisits()) {
	// log.info(visit2.toString());
	// }
	//
	// log.info("Obtener las 4 visitas más recientes de todo el sistema");
	// // Obtener las 4 visitas más recientes de todo el sistema
	// for (Visit visit3 : vr.buscarUltimas(PageRequest.of(0, 4))) {
	// log.info(visit3.toString());
	// }
	// };
	//
	// }

}
