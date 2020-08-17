package basicprojectcrud.service;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import basicprojectcrud.dao.StudentDao;
import basicprojectcrud.entity.Student;

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
		return student.get();
	}

	@Override
	public List<Student> getStudentsService() {
		List<Student> students = studentDao.findAll();
		return students;
	}

	@Override
	public Student updateStudentService(@Valid Student student) {
		return studentDao.save(student);
	}

	@Override
	public void deleteStudentService(Long studentId) {
		studentDao.deleteById(studentId);
	}

}
