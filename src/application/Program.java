package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import model.dao.DaoFactory;
import model.entities.Department;
import model.entities.Seller;

/**
 *
 * @author marcos
 */
public class Program {

    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Locale.setDefault(Locale.US);
        
        Department d = new Department(1,"Desenvolvimento");
        Seller seller = new Seller(1,"Marcos", "marcos@gmail.com", sdf.parse("02/04/2003"), 6000.00,d);
        
        SellerDao sellerDao = DaoFactory.crateSellerDao();
        
        System.out.println(seller);
    }
    
}
