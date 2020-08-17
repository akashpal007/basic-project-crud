package basicprojectcrud.controller;

import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import basicprojectcrud.entity.Student;
import basicprojectcrud.service.StudentService;

@RestController
public class StudentController {
	@Autowired
	StudentService studentService;

	@PostMapping("/student")
	public Student saveStudent(@Valid @RequestBody Student student) {
		Student savedStudent = studentService.saveStudentService(student);
		return savedStudent;
	}

	@GetMapping("/student")
	public Student getStudent(@RequestParam @NotNull Long studentId) {
		Student fetchedStudent = studentService.getStudentService(studentId);
		return fetchedStudent;
	}

	@GetMapping("/students")
	public List<Student> getAllStudents() {
		List<Student> fetchedStudents = studentService.getStudentsService();
		return fetchedStudents;
	}

	@PutMapping("/student")
	public Student updateStudent(@Valid @RequestBody Student student) {
		Student updatedStudent = studentService.updateStudentService(student);
		return updatedStudent;
	}

	@DeleteMapping("/student")
	public String deleteStudent(@RequestParam @NotNull Long studentId) {
		studentService.deleteStudentService(studentId);
		return "Deleted Successfully";
	}
}
