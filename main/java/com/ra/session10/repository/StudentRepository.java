package com.ra.session10.repository;

import com.ra.session10.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StudentRepository {
    @Autowired
    private SessionFactory sessionFactory;
    public List<Student>findAll(){
       try {
           Session session=sessionFactory.openSession();
           return session.createQuery("from Student ",Student.class).getResultList();
       }catch (Exception e){
           e.printStackTrace();
           return null;
       }
    }
    public Student findById(long id){
        try {
            Session session=sessionFactory.openSession();
            return session.get(Student.class,id);
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
    public boolean save(Student student){
        try {
            Session session=sessionFactory.openSession();
            Transaction transaction= session.beginTransaction();//tu bay gio moi thao
            //tac them,sua ,xoa tren session deu thuoc ve trasaction
            session.saveOrUpdate((student));
            transaction.commit();//neu khong say ra loi thi xac nhan va thuc hien thay doi xuong database
            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }
    public boolean deleteById(long id){
        Student student=findById(id);
        if(student!=null){
            try {
                Session session=sessionFactory.openSession();
                Transaction transaction=session.beginTransaction();
                session.delete(student);
                transaction.commit();
                return true;
            }catch (Exception e){
                e.printStackTrace();
                return false;
            }
        }else return false;
    }
}
