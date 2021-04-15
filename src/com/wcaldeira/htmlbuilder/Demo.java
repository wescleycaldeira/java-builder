package com.wcaldeira.htmlbuilder;

public class Demo {

    public static void main(String[] args) {
        System.out.println("Testing HTMLBuilder");

        HtmlBuilder builder = new HtmlBuilder("ul");
        builder.addChild("li", "hello");
        builder.addChild("li", "world");
        System.out.println(builder);

        HtmlBuilder fluentBuilder = new HtmlBuilder("ul");
        fluentBuilder
                .addChildFluent("li", "hello")
                .addChildFluent("li", "fluent");

        System.out.println("Fluent Builder --------- ");
        System.out.println(fluentBuilder);
    }

}
