package br.com.agcontas.util;

import javax.faces.context.FacesContext;
import org.hibernate.Session;

/**
 *
 * @author roberto
 */
public class FacesContextUtil {

    public static final String HIBERNATE_SESSION = "hibernate_session";

    public static void setRequestSession(Session session) {
        FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put(HIBERNATE_SESSION, session);
    }

    public static Session getRequestSession() {
        return (Session) FacesContext.getCurrentInstance().getExternalContext().getRequestMap().get(HIBERNATE_SESSION);
    }

}