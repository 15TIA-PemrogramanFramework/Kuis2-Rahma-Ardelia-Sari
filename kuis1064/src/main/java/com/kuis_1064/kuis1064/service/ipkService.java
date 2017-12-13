/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kuis_1064.kuis1064.service;
import com.kuis_1064.kuis1064.entity.ipk;
import com.kuis_1064.kuis1064.repo.ipk_repo;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service("ipkService")
@Transactional
public class ipkService {
 
    @Autowired
    private ipk_repo repo;

    public ipk insert(ipk nilai) {
        return repo.save(nilai);
    }
    
    public ipk update(ipk nilai) {
        return repo.save(nilai);
    }
    
    public boolean delete(Long kode_nilai){
        repo.delete(kode_nilai);
        return true;
    }
    
    public ipk getById(Long kode_nilai){
        return repo.findOne(kode_nilai);
    }
    
    public List<ipk> getAll(){
        return repo.findAllipk();
    }
}

