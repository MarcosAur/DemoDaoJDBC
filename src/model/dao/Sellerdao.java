package model.dao;

import java.util.List;
import model.entities.Seller;

/**
 *
 * @author marcos
 */
public interface Sellerdao {
    
    public void insert(Seller seller);
    public void update(Seller seller);
    public void deleteById(Integer id);
    public Seller findById(Integer id);
    public List<Seller> findAll();
}
