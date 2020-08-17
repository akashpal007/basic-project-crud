package basicprojectcrud.service;

import java.util.List;

import javax.validation.Valid;

import basicprojectcrud.entity.Student;

public interface StudentService {

	Student saveStudentService(@Valid Student student);

	Student getStudentService(Long studentId);

	List<Student> getStudentsService();

	Student updateStudentService(@Valid Student student);

	void deleteStudentService(Long studentId);

}
