package io.github.bitbox.bitbox.dto;

public class TestDto {
    private int id;
    private String name;

    public TestDto(int id, String name){
        this.id=id;
        this.name=name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}