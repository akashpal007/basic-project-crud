package basicprojectcrud.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;

import com.fasterxml.jackson.annotation.JsonFormat;

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
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "STU_ID_SEQ")
	@SequenceGenerator(name = "STU_ID_SEQ", sequenceName = "STUDENT_ID_SEQ", initialValue=1)
	@Column(name = "STUDENT_ID", updatable = false, nullable = false)
	private Long studentId;

	@Column(name = "NAME")
	@NotBlank(message = "Name is required")
	private String name;

	@Column(name = "PHONE_NUMBER")
	@Pattern(regexp = "(^$|[0-9]{10})")
	private String phoneNumber;
	
	@NotEmpty(message = "Email is required")
	@Email(regexp = "^[\\w-\\+]+(\\.[\\w]+)*@[\\w-]+(\\.[\\w]+)*(\\.[a-z]{2,})$",message = "Email should be valid")
    private String email;
	
	@Past
    @JsonFormat(pattern = "dd-MM-yyyy")
    private LocalDate birthday;
}
