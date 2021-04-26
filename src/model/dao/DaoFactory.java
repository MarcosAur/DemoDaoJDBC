package model.dao;

import model.dao.impl.SellerDaoJDBC;

/**
 *
 * @author marcos
 */
public class DaoFactory {
    public static SellerDao crateSellerDao(){
        return new SellerDaoJDBC();
    }
}
