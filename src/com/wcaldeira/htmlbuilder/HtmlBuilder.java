package com.wcaldeira.htmlbuilder;

public class HtmlBuilder {

    private String rootName;
    private HtmlElement root = new HtmlElement();

    public HtmlBuilder(String rootName) {
        this.rootName = rootName;
        root.name = rootName;
    }

    // Not Fluent
    public void addChild(String childNmae, String childText){
        HtmlElement htmlElement = new HtmlElement(childNmae, childText);
        root.elements.add(htmlElement);
    }

    // Fluent
    public HtmlBuilder addChildFluent(String childNmae, String childText){
        HtmlElement htmlElement = new HtmlElement(childNmae, childText);
        root.elements.add(htmlElement);

        return this;
    }

    public void clear(){
        root = new HtmlElement();
        root.name = rootName;
    }

    @Override
    public String toString() {
        return root.toString();
    }
}
