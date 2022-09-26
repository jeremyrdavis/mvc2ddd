package io.arrogantprogrammer;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

import javax.persistence.Entity;

@Entity
public class Customer extends PanacheEntity {

    String email;

    String firstName;

    String lastName;

    CustomerStatus status;

    public Customer() {
    }

    static Customer createFromCustomerRecord(CustomerRecord customerRecord) {

        Customer customer = new Customer();
        customer.email = customerRecord.email();
        customer.firstName = customerRecord.firstName();
        customer.lastName = customerRecord.lastName();

        if(customerRecord.firstName().equals("Jeremy")){
            customer.status = CustomerStatus.VIP;
        }else if(customerRecord.firstName().equals("Robert")){
            customer.status = CustomerStatus.NotThisGuyAgain;
        }
        return customer;
    }

    public CustomerRecord toCustomerRecord() {
        return new CustomerRecord(this.id, this.email, this.firstName, this.lastName, this.status);
    }

    public String getEmail() {
        return email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Enum getStatus() {
        return status;
    }
}
