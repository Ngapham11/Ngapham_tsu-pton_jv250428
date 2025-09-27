package com.ra.session9.repository;

import com.ra.session9.model.entity.Seed;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class SeedRepository {
    @Autowired
    private SessionFactory sessionFactory;

    public List<Seed> getAll(int page, int pageSize, String searchName) {
        Session session = sessionFactory.getCurrentSession();
        int start = (page - 1) * pageSize;
        String hql;
        if (searchName != null && !searchName.isEmpty()) {
            hql = "from Seed s where s.seedName like :searchName";
            return session.createQuery(hql, Seed.class).setParameter("searchName", "%" + searchName + "%")
                    .setFirstResult(start).setMaxResults(pageSize).getResultList();
        } else {
            hql = "from Seed s";
            return session.createQuery(hql, Seed.class)
                    .setFirstResult(start)
                    .setMaxResults(pageSize)
                    .getResultList();
        }
    }

    public Long checkSeedNameExist(String seedName) {
        Session session = sessionFactory.getCurrentSession();
        String hql = "select count(s)from Seed s where s.seedName like :seedName";
        return session.createQuery(hql, long.class)
                .setParameter("seedName", seedName)
                .uniqueResult();
    }

    public Long countAll(String searchName) {
        Session session = sessionFactory.getCurrentSession();
        String hql;
        if (searchName != null && !searchName.isEmpty()) {
            hql = "select count(s)from Seed s where s.seedName like:searchName";
            return session.createQuery(hql, long.class).setParameter("searchName", "%" + searchName + "%")
                    .uniqueResult();
        }else {
            hql="select count(s)from Seed s" ;
            return session.createQuery(hql,long.class).uniqueResult();
        }
    }
    public boolean addSeed(Seed seed){
        Session session=sessionFactory.getCurrentSession();
        session.save(seed);
        return true;
    }
    public boolean updateSeed(Seed seed){
        Session session=sessionFactory.getCurrentSession();
        session.merge(seed);
        return true;
    }
    public Seed findById(long id){
        Session session=sessionFactory.getCurrentSession();
        return session.get(Seed.class,id);
    }public boolean deleteById(long id){
        Session session=sessionFactory.getCurrentSession();
        Seed seed=findById(id);
        session.delete(seed);
        return true;
    }
}