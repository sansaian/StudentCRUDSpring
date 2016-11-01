package ru.innopolis.course.fall.server.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.innopolis.course.fall.common.service.Service;
import ru.innopolis.course.fall.server.dao.DbPool;
import ru.innopolis.course.fall.server.dao.StudentDAO;
import ru.innopolis.course.fall.server.entity.Student;

import java.util.ArrayList;
import java.util.List;

/**
 * StudentService-bussines logic for work with dao Student
 */

@Component
public class StudentService implements Service {
    @Autowired
    DbPool dbPool;
    @Autowired
    StudentDAO studentDAO;


    @Override
    public List<Student> getList() {
        return studentDAO.getList();
    }

    public List<Student> searchingList(String inputSymbols){
        List<Student> listStudent = studentDAO.getList();
        List<Student> listSearchingStudent = new ArrayList<>();
        for (Student student:listStudent){
            if(student.getFirstName().contains(inputSymbols))
                listSearchingStudent.add(student);
        }
        return listSearchingStudent;
    }

    @Override
    public boolean delete(Long id) {
        return studentDAO.delete(id);
    }

    @Override
    public Object getById(Long id) {
        Student student = studentDAO.getById(id);
        return student;
    }

    @Override
    public boolean add(Student student) {
        boolean result = false;
        if (studentDAO.add(student) != null) {
            result = true;
        }
        return result;
    }

    @Override
    public Long update(Long id, Student student) {
        return studentDAO.update(id, student);
    }
}

