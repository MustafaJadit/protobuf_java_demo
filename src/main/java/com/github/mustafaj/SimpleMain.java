package com.github.mustafaj;

import com.google.protobuf.BoolValue;
import com.google.protobuf.ExtensionRegistryLite;
import example.simple.Simple.SimpleMessage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class SimpleMain {

    public static void main(String[] args) {

//        extracted();

//        extracted2();

        extracted3();
    }

    private static void extracted3() {
        SimpleMessage.Builder builder = SimpleMessage.newBuilder();
        builder.setIsSimple(false);
        System.out.println("builder.getIsSimple() "+builder.getIsSimple());
    }

    private static void extracted2() {
        SimpleMessage.Builder builder = SimpleMessage.newBuilder();
        builder.setOptionalBool(BoolValue.newBuilder().setValue(false));


        System.out.println("builder.getOptionalBool() "+builder.getOptionalBool().getValue());
        System.out.println("builder.hasOptionalBool() "+builder.hasOptionalBool());
    }


    private static void extracted() {
        System.out.println("Hello world!");

        SimpleMessage.Builder builder = SimpleMessage.newBuilder();

        // simple fields
        builder.setId(42)  // set the id field
                .setIsSimple(true)  // set the is_simple field
                .setName("My Simple Message Name"); // set the name field


        builder.addSampleList(1)
                .addSampleList(2)
                .addAllSampleList(Arrays.asList(56, 2, 4));
        // repeated field

        System.out.println(builder.toString());
        System.out.println("END");
        SimpleMessage message = builder.build();

        try {
            FileOutputStream fileOutputStream = new FileOutputStream("fos.bin");
            message.writeTo(fileOutputStream);
            fileOutputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            FileInputStream fileInputStream = new FileInputStream("fos.bin");
            SimpleMessage simpleMessage = SimpleMessage.parseFrom(fileInputStream, ExtensionRegistryLite.newInstance());
            System.out.println(simpleMessage);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
