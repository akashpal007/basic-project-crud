package basicprojectcrud.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "STUDENT")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "STUDENT_ID", updatable = false, nullable = false)
	private Long studentId;

	@Column(name = "NAME")
	@NotBlank(message = "Name must be non null.")
	private String name;

	@Column(name = "PHONE_NUMBER")
	@NotNull(message = "Phone Number must be non null.")
	private Integer phoneNumber;
}
