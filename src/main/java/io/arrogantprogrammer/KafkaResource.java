package io.arrogantprogrammer;

import org.eclipse.microprofile.reactive.messaging.Channel;
import org.eclipse.microprofile.reactive.messaging.Emitter;
import org.eclipse.microprofile.reactive.messaging.Incoming;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;

@ApplicationScoped
public class KafkaResource {

    private static final Logger LOGGER = LoggerFactory.getLogger(KafkaResource.class);

    @Inject
    CustomerService customerService;

    @Incoming("customers-in")
    @Transactional
    public void addCustomer(CustomerRecord customerRecordToCreate) {

        LOGGER.debug("received CustomerRecord: {}", customerRecordToCreate);
        CustomerRecord customerRecord = customerService.createCustomer(customerRecordToCreate);
        LOGGER.debug("created: {}", customerRecord);
    }
}
