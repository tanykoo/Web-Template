package com.tanykoo.h2;

import org.h2.tools.Server;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import java.sql.SQLException;

/**
 * @Author ThinkPad
 * @Since 1.0
 */
public class H2DBServerListener implements ServletContextListener {

    private Server server;
    private Logger logger = LoggerFactory.getLogger(H2DBServerListener.class);
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        try {
            logger.info("H2 DataBase Server is starting...");
            server = Server.createTcpServer().start();
            logger.info("H2 DataBase Server is started");
        } catch (SQLException e) {
            logger.error("H2 DataBase Server start error!", e);
        }
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        if(this.server != null){
            logger.info("H2 DataBase Server is stoping");
            server.stop();
            logger.info("H2 DataBase Server is stoped");
            server = null;
        }
    }
}
