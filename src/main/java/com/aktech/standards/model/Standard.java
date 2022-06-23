package com.aktech.standards.model;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@JsonSerialize
public class Standard {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long standardId;
	private String name;
	private String subjects;
	private String clasTeacher;
}
