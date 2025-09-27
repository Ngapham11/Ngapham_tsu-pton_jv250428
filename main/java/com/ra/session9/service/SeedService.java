package com.ra.session9.service;

import com.ra.session9.model.entity.Seed;
import com.ra.session9.repository.SeedRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class SeedService {
    @Autowired
    private SeedRepository seedRepositpry;
    @Autowired
    private CategoryService categoryService;
    @Transactional(readOnly = true)
    public List<Seed> findAll(int page,int pageSize,String searchName){
        return seedRepositpry.getAll(page,pageSize,searchName);
    }
    @Transactional(readOnly = true)
    public Seed findById(long id){
        return seedRepositpry.findById(id);
    }
    @Transactional(readOnly = true)
    public long countAll(String searchName){
        return seedRepositpry.countAll(searchName);
    }
    @Transactional
    public boolean save(Seed seed){
        return seedRepositpry.addSeed(seed);
    }
    @Transactional
    public boolean update(Seed seed){
        Seed seedCheck=seedRepositpry.findById(seed.getId());
        if (seedCheck==null){
            return false;
        }else {
            return seedRepositpry.updateSeed(seed);
        }
    }
    @Transactional
    public boolean deleteById(long id){
        Seed seed=seedRepositpry.findById(id);
        if (seed==null){
            return false;
        }else {
            seedRepositpry.deleteById(id);
            return true;
        }
    }
    @Transactional
    public boolean checkSeedNameExist(String seedName){
        return seedRepositpry.checkSeedNameExist(seedName)>0;
    }
}
