/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kuis_1064.kuis1064.entity;
import java.io.Serializable;
import java.sql.Blob;
import java.sql.Timestamp;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "identitas_1064")

/**
 *
 * @author PC-5-320
 */
public class identitas implements Serializable {
     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
 
    private Long nim;
    @Column(length = 255, nullable = false)
    private String nama;
    @Column(length = 255, nullable = false)
    private String alamat;
    @Column(length = 255, nullable = false)
    private String prodi;
   
    
    @OneToMany
   
    @JoinColumn(name="nim")
    private Set<ipk> ipk;

    
    /**
     * @return the 
     * 
     */
    public Long getNim() {
        return nim;
    }

    /**
     * @param nim t to set
     */
    public void setNim(Long nim) {
        this.nim = nim;
    }

 
    
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }


    public String getAlamat() {
        return alamat;
    }

   
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    public String getProdi() {
        return prodi;
    }

    /**
     * @param ttl the ttl to set
     */
    public void setProdi(String prodi) {
        this.prodi = prodi;
    }
    

    

    
    
  
}




