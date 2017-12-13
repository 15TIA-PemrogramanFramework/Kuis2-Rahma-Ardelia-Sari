/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kuis_1064.kuis1064.repo;
import com.kuis_1064.kuis1064.entity.ipk;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author PC-5-320
 */
public interface ipk_repo extends CrudRepository<ipk, Long> {

    @Query("select c from ipk c")
    public List<ipk> findAllipk();
     
    
}
     
