package com.example.serialization.model;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Employee implements Serializable {
    private String name;
    private String email;
    private String phone;
    private String position;

    private static final long serialVersionUID = 1L;

    @Override
    public String toString() {
        return "Name: " + this.getName() + " Email: " + this.getEmail() +
                " Phone: " + this.getPhone() + " Position: " + this.getPosition();
    }
}