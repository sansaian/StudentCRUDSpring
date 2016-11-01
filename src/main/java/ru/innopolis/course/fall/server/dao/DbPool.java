package ru.innopolis.course.fall.server.dao;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import ru.innopolis.course.fall.server.controllers.StudentController;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * DbPool for Data base Postgres
 */

@Component
public class DbPool {
    private static Logger logger = LoggerFactory.getLogger(StudentController.class);
    private static DataSource dataSource;

    DbPool() throws NamingException {

        Context initContext = new InitialContext();
        Context envContext = (Context) initContext.lookup("java:/comp/env");
        dataSource = (DataSource) envContext.lookup("jdbc/mvc");
        logger.info("inizialize initContext");
    }

    /**
     * return Connecttion from Connection pool.use tomcat for create and managment Connection pool
     *
     * @return
     * @throws SQLException
     */
    public static Connection getConn() throws SQLException {
        return dataSource.getConnection();
    }
}
