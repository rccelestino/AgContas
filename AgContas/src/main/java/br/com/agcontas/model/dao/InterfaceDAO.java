package br.com.agcontas.model.dao;

import java.io.Serializable;
import java.util.List;
import org.hibernate.criterion.DetachedCriteria;
/**
 *
 * @author roberto
 * @param <T>
 */
public interface InterfaceDAO<T> {

    public void merge(T entity);

    public void save(T entity);

    public void update(T entity);

    public void delete(T entity);

    public T getEntity(Serializable id);

    public T getEntityByDetachedCriteria(DetachedCriteria criteria);

    public List<T> getEntities();

    public List<T> getListByDetachedCriteria(DetachedCriteria criteria);

}
