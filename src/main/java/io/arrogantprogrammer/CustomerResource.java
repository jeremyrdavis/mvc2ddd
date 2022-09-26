package io.arrogantprogrammer;

import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;
import java.util.stream.Collectors;

@Path("/customers")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class CustomerResource {

    @Inject
    CustomerRepository customerRepository;


    @GET
    public List<CustomerRecord> allCustomers(CustomerRecord customerRecord) {

        return customerRepository.listAll().stream().map(customer -> {
            return new CustomerRecord(customer.id, customer.email, customer.firstName, customer.lastName);
        }).collect(Collectors.toList());
    }

    @POST@Transactional
    public CustomerRecord addCustomer(CustomerRecord customerRecord) {

        Customer customer = new Customer();
        customer.email = customerRecord.email();
        customer.firstName = customerRecord.firstName();
        customer.lastName = customerRecord.lastName();

        customerRepository.persist(customer);
        return new CustomerRecord(customer.id, customer.email, customer.firstName, customer.lastName);
    }
}
