/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kuis_1064.kuis1064.entity;
import java.io.Serializable;
import java.sql.Blob;
import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "ipk_1064")


/**
 *
 * @author PC-5-320
 */
public class ipk implements Serializable {
  @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 255, nullable = false)
    private Long nim;
    private String jumlah_ipk;
    private String keterangan;
    private String golongan;
    
   

   
    
    public Long getId() {
        return id;
    }

   
    public void setId(Long id) {
        this.id = id;
    }

    
    public Long getNim() {
        return nim;
    }


    public void setNim(Long kode_cv) {
        this.nim = nim;
    }

   
    public String getJumlah_ipk() {
        return jumlah_ipk;
    }

  
    public void setJumlah_ipk(String jumlah_ipk) {
        this.jumlah_ipk = jumlah_ipk;
    }

    
    public String getKeterangan() {
        return keterangan;
    }

 
    public void setGolongan(String golongan) {
        this.golongan = golongan;
    }
    
    public String getGolongan() {
        return golongan;
    }


}