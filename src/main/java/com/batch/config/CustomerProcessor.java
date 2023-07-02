package com.batch.config;


import com.batch.entity.Customer;
import org.springframework.batch.item.ItemProcessor;

public class CustomerProcessor implements ItemProcessor<Customer,Customer> {

    //TODO Filter by Country wise
    /*
    @Override
    public Customer process(Customer customer) throws Exception {
        if(customer.getCountry().equals("United States")) {
            return customer;
        }else{
            return null;
        }
    }

     */
    @Override
    public Customer process(Customer customer) throws Exception {
       return customer;
    }
}
