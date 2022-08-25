package com.example.serialization.service;

import com.example.serialization.model.Customer;
import com.example.serialization.model.Employee;
import com.example.serialization.model.Player;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;


public class Serialization {
    public static void serializeEmployee(Employee employee) {
        try {
            //For save data in file
            FileOutputStream fileOut = new FileOutputStream("employee.ser");
            //For converting object into bytes
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            //Writing object
            out.writeObject(employee);
            out.close();
            fileOut.close();
            System.out.println("Employee serialization was successful");
        } catch (IOException i) {
            System.out.println("Some problems were happened");
            i.printStackTrace();
        }
    }

    public static void serializePlayer(Player player) {
        try {
            //For save data in file
            FileOutputStream fileOut = new FileOutputStream("player.ser");
            //For converting object into bytes
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            //Writing object
            out.writeObject(player);
            out.close();
            fileOut.close();
            System.out.println("Player serialization was successful");
        } catch (IOException i) {
            System.out.println("Some problems were happened");
            i.printStackTrace();
        }
    }


    public static void serializeCustomer(Customer customer) {
        try {
            FileOutputStream fileOut = new FileOutputStream("customer.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(customer);
            out.close();
            System.out.println("Customer serialization was successful");
        } catch (IOException i) {
            System.out.println("Some problems were happened");
            i.printStackTrace();
        }
    }

}

