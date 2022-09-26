package io.arrogantprogrammer;

import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/customers")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class CustomerResource {

    @Inject
    CustomerRepository customerRepository;


    @GET
    public List<Customer> allCustomers() {

        return customerRepository.listAll();
    }

    @POST@Transactional
    public Customer addCustomer(Customer customer) {

        customerRepository.persist(customer);
        return customer;
    }
}
