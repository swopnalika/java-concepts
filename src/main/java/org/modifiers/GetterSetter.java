package org.modifiers;

public class GetterSetter {

    private String name;

    // getter method
    public String getName() {
        return this.name;
    }

    // setter method
    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] main) {
        GetterSetter d = new GetterSetter();

        // access the private variable using the getter and setter
        d.setName("Private variable accessed");
        System.out.println(d.getName());
    }

}
