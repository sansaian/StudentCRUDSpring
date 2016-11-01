package ru.innopolis.course.fall.common.service;

import ru.innopolis.course.fall.server.entity.Student;

import java.util.List;

/**
 * Service-bussines logic for work with dao Entity
 */
public interface Service {

    /**
     * List<Student> getList() method which give list of Entity to Servlet
     *
     * @return
     */
     List<Student> getList();

    /**
     * service take id from servlet and calls the method delete from DAO
     *
     * @param id
     * @return
     */
     boolean delete(Long id);


    /**
     * method return student by Id
     *
     * @param id
     * @return
     */
    Object getById(Long id) ;

    /**
     * create new user in DB
     *
     * @param student
     * @return
     */
     boolean add(Student student);

    /**
     * Update
     * @param id
     * @param student
     * @return
     */
     Long update(Long id, Student student);
}
