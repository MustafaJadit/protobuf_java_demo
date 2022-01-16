package com.github.mustafaj;

import com.example.tutorial.protos.AddressBook;
import com.example.tutorial.protos.AddressBookProtos;
import com.example.tutorial.protos.Person;
import com.google.protobuf.util.JsonFormat;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class AddressbookMain {
    public static void main(String[] args) {
        AddressBook.Builder builder = AddressBook.newBuilder();
        builder.addPeople(Person.newBuilder().setId(1).setName("Elshat").setEmail("elshat009@gmail.com").addPhones(Person.PhoneNumber.newBuilder().setType(Person.PhoneType.MOBILE).setNumber("5108568864")));
        builder.addPeople(Person.newBuilder().setId(1).setName("Israfil").setEmail("Israfil@gmail.com").addPhones(Person.PhoneNumber.newBuilder().setType(Person.PhoneType.MOBILE).setNumber("4508528654")).addPhones(Person.PhoneNumber.newBuilder().setType(Person.PhoneType.HOME).setNumber("8513567")));
        AddressBook build = builder.build();
        System.out.println(build.toString());
        FileOutputStream fileOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream("addressbook.bin");
            build.writeTo(fileOutputStream);
            System.out.println("file is written");
            AddressBook.Builder builder1 = AddressBook.newBuilder();
            String print = JsonFormat.printer().includingDefaultValueFields().print(builder);
            JsonFormat.parser().merge(print, builder1);
            System.out.println(builder1.toString());

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
