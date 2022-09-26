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
    CustomerService customerService;


    @GET
    public List<CustomerRecord> allCustomers() {

        return customerService.allCustomers();
    }

    @POST@Transactional
    public CustomerRecord addCustomer(CustomerRecord customerRecord) {

        return customerService.createCustomer(customerRecord);
    }
}
