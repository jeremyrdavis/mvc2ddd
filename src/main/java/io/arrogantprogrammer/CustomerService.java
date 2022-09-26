package io.arrogantprogrammer;

import org.eclipse.microprofile.reactive.messaging.Channel;
import org.eclipse.microprofile.reactive.messaging.Emitter;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.List;
import java.util.stream.Collectors;

@ApplicationScoped
public class CustomerService {

    @Inject
    CustomerRepository customerRepository;

    public CustomerRecord createCustomer(CustomerRecord customerRecord) {

        Customer customer = Customer.createFromCustomerRecord(customerRecord);
        customerRepository.persist(customer);
        return customer.toCustomerRecord();
    }

    public List<CustomerRecord> allCustomers() {

        return customerRepository.listAll().stream().map(customer -> {
            return customer.toCustomerRecord();
        }).collect(Collectors.toList());
    }
}
