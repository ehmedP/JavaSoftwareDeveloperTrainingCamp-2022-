package com.example.demo.entities.concrets;

public class Brand {
    private Integer id;
    private String name;


    public Brand() { super(); }

    public Brand(Integer id, String name) {
        super();
        this.name = name;
        this.id = id;
    }


    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return this.id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
