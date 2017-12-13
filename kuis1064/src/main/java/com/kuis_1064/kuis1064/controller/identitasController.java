/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kuis_1064.kuis1064.controller;

import com.kuis_1064.kuis1064.entity.identitas;
import com.kuis_1064.kuis1064.service.identitasService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author PC-5-320
 */
@RestController
@RequestMapping("/identitas_1064")

public class identitasController {
    
    


    @Autowired
    private identitasService identitasService;

    @RequestMapping(method = RequestMethod.POST)
    public identitas insert(@RequestBody identitas idn) {
        return identitasService.insert(idn);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public identitas update(@RequestBody identitas idn) {
        return identitasService.update(idn);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{nim}")
    public boolean delete(@PathVariable("nim") Long nim) {
        return identitasService.delete(nim);
    }
    
    @RequestMapping(method = RequestMethod.GET, value = "/{nim}")
    public identitas getById(@PathVariable("nim") Long nim){
        return identitasService.getById(nim);
    }
    
    @RequestMapping(method = RequestMethod.GET)
    public List<identitas> getAll(){
        return identitasService.getAll();
    }
}





