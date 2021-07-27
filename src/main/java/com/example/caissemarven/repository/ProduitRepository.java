/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.caissemarven.repository;

import com.example.caissemarven.model.Produit;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;


/**
 *
 * @author Dory
 */
@Repository
public class ProduitRepository {
    
    @Autowired
    JdbcTemplate jdbcTemplate;
    
    class ProduitRowMapper implements RowMapper <Produit>{
        @Override
        public Produit mapRow(ResultSet rs,int rowNum) throws SQLException{
            Produit produit = new Produit();
            produit.setId(rs.getInt("id"));
            produit.setName(rs.getString("name"));
            produit.setPrice(rs.getInt("price"));
            produit.setStatus(rs.getString("status"));
            return produit;
        }
    }
    public int insert(Produit produit) {
        return jdbcTemplate.update("insert into produit (id, name, pric,string) " + "values(?, ?, ?,?)",
            new Object[] {
                produit.getId(), produit.getName(), produit.getPrice() , produit.getStatus()
            });
    }
    

    public List <Produit> findAll(){
        return jdbcTemplate.query("select * from produit", new ProduitRowMapper());
    }
    
    
    public Optional < Produit > findById(long id) {
        return Optional.of(jdbcTemplate.queryForObject("select * from produit where id=?", new Object[] {
                id
            },
            new BeanPropertyRowMapper <Produit> (Produit.class)));
    }
   
    public Optional < Produit > findByIdPrice(long id) {
        return Optional.of(jdbcTemplate.queryForObject("select price from produit where id=?", new Object[] {
                id
            },
            new BeanPropertyRowMapper <Produit> (Produit.class)));
    }
    
    
     
        public int update(Produit produit) {
        return jdbcTemplate.update("update produit " + " set name = ?, price = ?, status= ? " + " where id = ?",
            new Object[] {
                produit.getName(), produit.getPrice(),produit.getStatus(), produit.getId()
            });
    }
    
}
