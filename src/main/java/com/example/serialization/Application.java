package com.example.serialization;

import com.example.serialization.model.ContactInfo;
import com.example.serialization.model.Customer;
import com.example.serialization.model.Employee;
import com.example.serialization.model.Player;
import com.example.serialization.service.Deserialization;
import com.example.serialization.service.Serialization;
import java.util.UUID;

public class Application {
    public static void main(String[] args) {
        //Case 1 (All is okay status)
        Employee orkhan = Employee.builder()
                .email("mail@gmail.com")
                .name("Orkhan")
                .phone("050000000")
                .position("Middle Software engineer").build();

        Serialization.serializeEmployee(orkhan);
        Deserialization.deserializeEmployee();

        //Case 2 (transient keyword)
        Customer customer = Customer.builder()
                .name("Shamistan")
                .contactInfo(
                        ContactInfo.builder().id(UUID.randomUUID()).shippingAddress("Baku").build()
                ).build();
        Serialization.serializeCustomer(customer);
        Deserialization.deserializeCustomer();


        //Case 3 ExternalSerialize
        Player player = Player.builder().hp(100)
                .contactInfo(ContactInfo.builder().id(UUID.randomUUID()).shippingAddress("Address").build())
                .nickname("Super player").build();
        Serialization.serializePlayer(player);
        Deserialization.deserializePlayer();

    }
}