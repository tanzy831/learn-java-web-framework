package org.michael.chapter2.service;

import org.michael.chapter2.helper.DatabaseHelper;
import org.michael.chapter2.model.Customer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.Map;

/**
 * Created by tanzy on 11/18/2015.
 *
 * This class provide operations related to customer database.
 */
public class CustomerService {

    private static final Logger LOGGER= LoggerFactory.getLogger(CustomerService.class);

    /**
     * get customer list
     * @return
     */
    public List<Customer> getCustomerList(){
        /**
         * using thread local
         */
        String sql = "SELECT * FROM customer";
        return DatabaseHelper.queryEntityList(Customer.class,sql);

    }

    /**
     * get customer according to id
     * @param id
     * @return
     */
    public Customer getCustomer(long id){
        String sql = "SELECT * FROM customer";
        return DatabaseHelper.queryEntity(Customer.class,sql);
    }

    /**
     * create customer
     * @param fieldMap
     * @return
     */
    public boolean createCustomer(Map<String,Object> fieldMap){
        return DatabaseHelper.insertEntity(Customer.class,fieldMap);
    }

    /**
     * update customer information
     * @param id
     * @param fieldMap
     * @return
     */
    public boolean updateCustomer(long id,Map<String,Object> fieldMap){
        return DatabaseHelper.updateEntity(Customer.class,id,fieldMap);
    }

    /**
     * delete customer
     * @param id
     * @return
     */
    public boolean deleteCustomer(long id){
        return DatabaseHelper.deleteEntity(Customer.class,id);
    }
}
