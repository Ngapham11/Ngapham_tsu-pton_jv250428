package com.ra.module3.repository;

import com.ra.module3.model.dto.FlightDto;
import com.ra.module3.model.entity.Flight;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;
@Repository
public class FlightRepositoryImpl implements FlightRepository{
    @PersistenceContext
    private EntityManager entityManager;
    @Override
    public List<Flight> findAllWithPagination(int page, int size, String searchFlightName) {
        String hql="from Flight f where(:searchFlightName is null or f.flight_name like :searchFlightName)";
        TypedQuery<Flight>query=entityManager.createQuery(hql,Flight.class);
        query.setParameter("searchFlightName","%"+searchFlightName+"%")
                .setFirstResult((page-1)*size).setMaxResults(size);
        return query.getResultList();
    }

    @Override
    public Flight findById(int id) {
        return entityManager.find(Flight.class,id);
    }

    @Transactional
    @Override
    public boolean saveFlight(Flight flight) {
       try {
           entityManager.merge(flight);
           return true;
       }catch (Exception e){
           e.printStackTrace();
       }return false;
    }
@Transactional
    @Override
    public boolean deleteFlight(int id) {
       try {
           Flight flight=entityManager.find(Flight.class,id);
           if (flight!=null){
               entityManager.remove(flight);
           }return true;
       }catch (Exception e){
           e.printStackTrace();
       }return false;
    }

    @Override
    public long countFlightByFlightName(String searchFlightName) {
        String hql="from Flight f where(:searchFlightName is null or f.flight_name like :searchFlightName)";
        TypedQuery<Flight>query=entityManager.createQuery(hql,Flight.class);
        query.setParameter("searchFlightName","%"+searchFlightName+"%");
        return query.getResultList().size();
    }
}
