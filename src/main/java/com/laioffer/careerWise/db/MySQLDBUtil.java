package com.laioffer.careerWise.db;

public class MySQLDBUtil {
    private static final String INSTANCE = "careerwise-spring.cl7av55e6sfr.us-east-2.rds.amazonaws.com";
    private static final String PORT_NUM = "3306";
    public static final String DB_NAME = "careerWise";
    private static final String USERNAME = "admin";
    private static final String PASSWORD = "Aws_0218";
    public static final String URL = "jdbc:mysql://"
            + INSTANCE + ":" + PORT_NUM + "/" + DB_NAME
            + "?user=" + USERNAME + "&password=" + PASSWORD
            + "&autoReconnect=true&serverTimezone=UTC";
}