package com.ra.session10.repository;

import com.ra.session10.entity.Customer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import java.util.List;

@Repository
public class CustomerRepository {

    @Autowired
    private SessionFactory sessionFactory;
    @Autowired
    private EntityManager entityManager;

    public List<Customer>findAll(){
      try {
          return entityManager.createQuery("from Customer ",Customer.class).getResultList();
      }catch (Exception e){
          e.printStackTrace();
          return null;
      }

    }
    //lay
    public List<Customer> getCustomerWithPagination(int page,int size){
        TypedQuery<Customer> query=entityManager.createQuery("from Customer ",Customer.class);
        //lay tat ca danh sach customer, bat buoc phai tra ve kieu Customer
        query.setFirstResult((page-1)*size).setMaxResults(size);
        //vi du page=2, size =5 thi lay tu customer thu 6-10
        return query.getResultList();//tra ve list
    }
    public Customer findById(Long id){
        try {
            Session session=sessionFactory.getCurrentSession();
            return session.get(Customer.class,id);
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
    public boolean save(Customer customer){
        try {
            Session session=sessionFactory.openSession();
            Transaction transaction=session.beginTransaction();
            session.saveOrUpdate(customer);
            transaction.commit();
            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }
    public  boolean delete(Customer customer){
        try {
            Session session=sessionFactory.openSession();
            Transaction transaction=session.beginTransaction();
            session.delete(customer);
            transaction.commit();
            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;

        }
    }
    public boolean checkEmailExisted(String email){
        try {
            Session session=sessionFactory.getCurrentSession();
            String hql="select count(c) from Customer c where c.email=:email";
            return session.createQuery(hql,Long.class).setParameter("email",email)
                    .uniqueResult()>0;
        }catch (Exception e){
            e.printStackTrace();
            return false;

        }
    }
    public boolean checkUserName(String name){
        try {
            Session session=sessionFactory.getCurrentSession();
            String hql="select count(c) from Customer c where c.username=:name";
            return session.createQuery(hql,Long.class).setParameter("name",name)
                    .uniqueResult()>0;
        }catch (Exception e){
            e.printStackTrace();
            return false;

        }
    }
    public  boolean checkPhoneExisted(String phone){
        try {
            Session session=sessionFactory.getCurrentSession();
            String hql="select count(c) from Customer c where c.phone=:phone";
            return session.createQuery(hql,Long.class).setParameter("phone",phone)
                    .uniqueResult()>0;
        }catch (Exception e){
            e.printStackTrace();
            return false;

        }
    }


}
