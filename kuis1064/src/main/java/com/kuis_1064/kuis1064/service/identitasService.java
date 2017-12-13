/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kuis_1064.kuis1064.service;
import com.kuis_1064.kuis1064.entity.identitas;
import com.kuis_1064.kuis1064.repo.identitas_repo;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

 @Service("identitasService")
 @Transactional
/**
 *
 * @author PC-5-320
 */
public class identitasService {
   
    @Autowired
    private identitas_repo repo;

    public identitas insert(identitas idn) {
        return repo.save(idn);
    }
    
    public identitas update(identitas idn) {
        return repo.save(idn);
    }
    
    public boolean delete(Long nim){
        repo.delete(nim);
        return true;
    }
    
    public identitas getById(Long nim){
        return repo.findOne(nim);
    }
    
    public List<identitas> getAll(){
        return repo.findAllidentitas();
    }
}

    

