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
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;


/**
 *
 * @author Dory
 */

/**

@Repository
public interface ProduitRepository extends CrudRepository<Produit, Integer> {
    List<Produit> findAll();
 }

**/
@Repository
public class ProduitRepository {
    
   @Autowired
   private JdbcTemplate jdbcTemplate; 
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
    
      class ProduitPriceRowMapper implements RowMapper <Produit>{
        @Override 
        public Produit mapRow(ResultSet rs,int rowNum) throws SQLException{
            Produit produit = new Produit();
            produit.setPrice(rs.getInt("price"));
      
            return produit;
        }
    }
    
    public  Produit  findById(Integer id) {
        return jdbcTemplate.queryForObject("select name,price from produit where id=?", new Object[] {
                id
            },
            new BeanPropertyRowMapper <Produit> (Produit.class));
    }
    
    
     public  Produit  findByIdPrice(long id) {
        return jdbcTemplate.queryForObject("select price from produit where id=?", new Object[] {
                id
            },
            new BeanPropertyRowMapper <Produit> (Produit.class));
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
    
    
  
 
   
   
    
    
     
        public int update(Produit produit) {
        return jdbcTemplate.update("update produit " + " set name = ?, price = ?, status= ? " + " where id = ?",
            new Object[] {
                produit.getName(), produit.getPrice(),produit.getStatus(), produit.getId()
            });
    }
    
}

