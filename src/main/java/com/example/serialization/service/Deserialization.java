package com.example.serialization.service;

import com.example.serialization.model.Customer;
import com.example.serialization.model.Employee;
import com.example.serialization.model.Player;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserialization {
    public static void deserializeEmployee() {
        Employee employee = new Employee();
        try {
            FileInputStream fileIn = new FileInputStream("employee.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            employee = (Employee) in.readObject();
            in.close();
            fileIn.close();
        } catch (IOException i) {
            i.printStackTrace();
            System.out.println("File not found");
        } catch (ClassNotFoundException c) {
            System.out.println("Employee class not found");
            c.printStackTrace();
        }

        System.out.println("Deserialized Employee...");
        System.out.println(employee.toString());
    }

    public static void deserializeCustomer() {
        Customer customer = new Customer();
        try {
            FileInputStream fileIn = new FileInputStream("customer.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            customer = (Customer) in.readObject();
            in.close();
            fileIn.close();
        } catch (IOException i) {
            i.printStackTrace();
            System.out.println("File not found");
        } catch (ClassNotFoundException c) {
            System.out.println("Employee class not found");
            c.printStackTrace();
        }

        System.out.println("Deserialized Customer...");
        System.out.println(customer.toString());
    }

    public static void deserializePlayer() {
        Player player = new Player();
        try {
            FileInputStream fileIn = new FileInputStream("player.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            player = (Player) in.readObject();
            in.close();
            fileIn.close();
        } catch (IOException i) {
            i.printStackTrace();
            System.out.println("File not found");
        } catch (ClassNotFoundException c) {
            System.out.println("Employee class not found");
            c.printStackTrace();
        }

        System.out.println("Deserialized Player...");
        System.out.println(player.toString());
    }
}
