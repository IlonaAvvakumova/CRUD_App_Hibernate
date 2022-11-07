package com.crud.model;

public class Label {
    private Integer id;
    private String name;

    public Integer getId() {
        return id;
    }

      public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Label{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
