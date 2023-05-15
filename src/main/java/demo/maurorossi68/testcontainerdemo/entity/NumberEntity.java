package demo.maurorossi68.testcontainerdemo.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="NUMEROS")
public class NumberEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "number_seq")
	@SequenceGenerator(name = "number_seq", sequenceName = "seq_number", allocationSize = 1)
	private Long id;
	
	@Column(name="NUMERO")
	private int number;
	
	@Column(name="FECHA")
	private Date date;
}
