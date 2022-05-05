package ee.studentsystem.service;

import ee.studentsystem.model.Student;

import java.util.List;

public interface StudentService {
    public Student saveStudent(Student student);
    public List<Student> getAllStudents();
    public List<Student> deleteStudent(Integer id);
}
