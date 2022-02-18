package com.github.mustafaj;

import com.google.protobuf.MessageLite;
import example.simple.Boolean1.MyMessage;

import com.google.protobuf.Message;

import java.util.Arrays;

public class BooleanDemo1 {
    public static void main(String[] args) {
//        extracted();
        MessageLite.Builder builder=MyMessage.newBuilder();
        Arrays.stream(builder.getClass().getMethods()).forEach(c->{
            System.out.println(c.getName()+ " "+c.toString());
        });
        


    }

    private static void extracted() {
        MyMessage.Builder builder = MyMessage.newBuilder();
//        boolean nonOptionalBool1 = builder.setNonOptionalBool1(false).getNonOptionalBool1();
//        boolean nonOptionalBool1 = builder.getNonOptionalBool1();
        System.out.println("result of nonOptionalBool " + builder.getNonOptionalBool1());
        System.out.println("-------");
//        builder.newBuilderForField()

        System.out.println("result of optionalBool has: " + builder.hasOptionalBool2() + " get: " + builder.getOptionalBool2());
        System.out.println("changing ...");

        builder.setOptionalBool2(false);
        System.out.println("result of optionalBool has: " + builder.hasOptionalBool2() + " get: " + builder.getOptionalBool2());
        builder.clearOptionalBool2();
        System.out.println("changing ...");

        System.out.println("result of optionalBool has: " + builder.hasOptionalBool2() + " get: " + builder.getOptionalBool2());


//        optional -> three states
//            non optional -> two states -> off and default = off
    }
}
