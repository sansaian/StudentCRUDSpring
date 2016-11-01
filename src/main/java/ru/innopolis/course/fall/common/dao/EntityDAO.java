package ru.innopolis.course.fall.common.dao;

import ru.innopolis.course.fall.server.entity.Student;

import java.util.List;

/**
 * Created by Max Shalavin on 01.11.2016.
 */
public interface EntityDAO {

    /**
     * @return list of Student
     */
     List<Student> getList();

    /**
     * delete student by id
     * @param id student's id
     * @return true if operation finished whithout error
     */
     boolean delete(Long id);

    /**
     * return Student By Id
     * @param id
     * @return Student
     */
     Student getById(Long id);

    /**
     * add new Student
     * @param student
     * @return Student's id
     */
     Long add(Student student);

    /**
     * Update data about  Student
     * @param id
     * @param student
     * @return
     */
     Long update(Long id, Student student);
}
