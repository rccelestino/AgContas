package br.com.agcontas.util;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
/**
 *
 * @author roberto
 */
public class HibernateUtil {

    private static final SessionFactory sessionFactory;
    public static final String HIBERNATE_SESSION = "hibernate_session";

    static {
        try {
            System.out.println("Tentando criar Session Factory");
            Configuration cfg = new Configuration().configure();
            ServiceRegistry srv = new StandardServiceRegistryBuilder().applySettings(
            cfg .getProperties()).build();
            
            sessionFactory = cfg.buildSessionFactory(srv);
            System.out.println("Session Factory criada com sucesso");

        } catch (Throwable ex) {
            System.err.println("Falha na inicialização da Session Factory." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}
