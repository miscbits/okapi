package com.bubbly.blessed.okapi;

public class Okapi {

    private Integer id;
    private String name;
    private Double nightmare_index;
    private Integer age;
    private Long leaf_count;
    private Boolean white_over_black;

    public Okapi(Integer id, String name, Double nightmare_index, Integer age, Long leaf_count, Boolean white_over_black) {
        this.id = id;
        this.name = name;
        this.nightmare_index = nightmare_index;
        this.age = age;
        this.leaf_count = leaf_count;
        this.white_over_black = white_over_black;
    }

    public Okapi(String name, Double nightmare_index, Integer age, Long leaf_count, Boolean white_over_black) {
        this.name = name;
        this.nightmare_index = nightmare_index;
        this.age = age;
        this.leaf_count = leaf_count;
        this.white_over_black = white_over_black;
    }

    public Okapi() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getNightmare_index() {
        return nightmare_index;
    }

    public void setNightmare_index(Double nightmare_index) {
        this.nightmare_index = nightmare_index;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Long getLeaf_count() {
        return leaf_count;
    }

    public void setLeaf_count(Long leaf_count) {
        this.leaf_count = leaf_count;
    }

    public Boolean getWhite_over_black() {
        return white_over_black;
    }

    public void setWhite_over_black(Boolean white_over_black) {
        this.white_over_black = white_over_black;
    }
}
