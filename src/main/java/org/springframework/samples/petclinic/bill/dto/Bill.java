package org.springframework.samples.petclinic.bill.dto;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.samples.petclinic.model.BaseEntity;
import org.springframework.samples.petclinic.visit.dto.Visit;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "bills")
@Data
public class Bill extends BaseEntity {

	@Column(name = "bill_date")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate billdate;

	@Column(name = "importe")
	private Double importe;

	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "visit_id", referencedColumnName = "id")
	private Visit visit;

}
