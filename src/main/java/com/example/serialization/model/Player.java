package com.example.serialization.model;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Player implements Externalizable {
    private String nickname;
    private int hp;
    private ContactInfo contactInfo;
    private static final long serialVersionUID = 2L;


    //we're adding the object's properties to the ObjectOutput stream (Serialization)
    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeUTF(nickname);
        out.writeInt(hp);
    }

    //for deserializing the object, we're reading from the ObjectInput stream
    @Override
    public void readExternal(ObjectInput in) throws IOException {
        this.nickname = in.readUTF();
        this.hp = in.readInt();

    }

    @Override
    public String toString() {
        return "Nickname = " + nickname + " Hp : " + hp;
    }
}
