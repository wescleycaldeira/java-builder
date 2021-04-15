package com.wcaldeira.facets;

public class Demo {

    public static void main(String[] args) {
        PersonBuilder personBuilder = new PersonBuilder();

        Person person = personBuilder
                .lives()
                .at("SHCN 105 Asa Sul")
                .in("Brasilia")
                .withPostcode("11111-111")
                .works()
                .at("Marie")
                .asA("Engineer")
                .earning(250000)
                .build();

        System.out.println(person);
    }

}
