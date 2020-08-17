package basicprojectcrud.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import basicprojectcrud.entity.Student;

public interface StudentDao extends JpaRepository<Student, Long> {

}
