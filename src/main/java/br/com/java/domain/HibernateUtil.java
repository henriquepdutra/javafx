/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.java.domain;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author henrique
 */
public class HibernateUtil {

    private static SessionFactory factory = null;
    private static Configuration conf;

    private static SessionFactory buildSessionFactory() {
        try {
            conf = new Configuration();
            conf.configure("hibernate.cfg.xml");

            System.out.println("Conexão");

            factory = conf.buildSessionFactory();
            System.out.println("Construiu");

            return factory;
        } catch (Throwable ex) {
            ex.printStackTrace();

            throw new ExceptionInInitializerError(ex);
        }
    }

    public static SessionFactory getSessionFactory() {
        if (factory == null) {
            factory = buildSessionFactory();
        }
        return factory;
    }

}
