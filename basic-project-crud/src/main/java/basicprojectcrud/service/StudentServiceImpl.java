package basicprojectcrud.service;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import basicprojectcrud.dao.StudentDao;
import basicprojectcrud.entity.Student;
import basicprojectcrud.exception.StudentNotFoundException;

@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
	StudentDao studentDao;

	@Override
	public Student saveStudentService(@Valid Student student) {
		return studentDao.save(student);
	}

	@Override
	public Student getStudentService(Long studentId) {
		Optional<Student> student = studentDao.findById(studentId);
		student.orElseThrow(()-> new StudentNotFoundException("No student found with student id-"+studentId));
		return student.get();
	}

	@Override
	public List<Student> getStudentsService() {
		List<Student> students = studentDao.findAll();
		if(students.isEmpty()) {
			throw new StudentNotFoundException("No student data found");
		}
		return students;
	}

	@Override
	public Student updateStudentService(@Valid Student student) {
		getStudentService(student.getStudentId());
		return studentDao.save(student);
	}

	@Override
	public void deleteStudentService(Long studentId) {
		getStudentService(studentId);
		studentDao.deleteById(studentId);
	}

}
