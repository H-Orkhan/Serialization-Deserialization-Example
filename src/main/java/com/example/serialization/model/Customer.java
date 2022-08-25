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
public class Customer implements Serializable {
    private String name;
    private transient ContactInfo contactInfo;

    private static final long serialVersionUID = 3L;

    @Override
    public String toString() {
        return "Name: " + this.getName() + " ContactInfo: " + this.getContactInfo();
    }
}
