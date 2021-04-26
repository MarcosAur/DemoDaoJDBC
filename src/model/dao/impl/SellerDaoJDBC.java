package model.dao.impl;

import db.DB;
import db.DbException;
import java.util.List;
import model.dao.SellerDao;
import model.entities.Seller;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Date;

/**
 *
 * @author marcos
 */
public class SellerDaoJDBC implements SellerDao {
    
    @Override
    public void insert(Seller seller) {
        String comando = "INSERT INTO seller "
                       + "(Name,Email,BirthDate,BaseSalary,DepartmentId) "
                       + "VALUES "
                       + "?,?,?,?,?";
        
        Connection conn = null;
        PreparedStatement pst = null;
        
        try{
            conn = DB.getConnection();
            pst = conn.prepareStatement(comando);
            
            pst.setString(1, seller.getName());
            pst.setString(2, seller.getEmail());
            pst.setDate(3, new java.sql.Date(seller.getBirthDate().getTime()));
            pst.setDouble(4, seller.getBaseSalary());
            pst.setInt(5, seller.getDepartment().getId());
            
        }catch(SQLException e){
            throw new DbException(e.getMessage());
        }
                
    }

    @Override
    public void update(Seller seller) {
        
    }

    @Override
    public void deleteById(Integer id) {
        
    }

    @Override
    public Seller findById(Integer id) {
        return null;
    }

    @Override
    public List<Seller> findAll() {
        return null;
    }
    
}
