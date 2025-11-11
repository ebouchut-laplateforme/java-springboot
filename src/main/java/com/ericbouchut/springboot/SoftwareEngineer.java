package com.ericbouchut.springboot;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.Objects;

/**
 * A Spring Boot Entity that models a software engineer.
 */
@Entity
public class SoftwareEngineer {
    @Id
    private Integer id;
    private String name;
    private String techStack;

    public SoftwareEngineer() {
    }

    public SoftwareEngineer(Integer id, String name, String techStack) {
        this();

        this.techStack = techStack;
        this.id = id;
        this.name = name;
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

    public String getTechStack() {
        return techStack;
    }

    public void setTechStack(String techStack) {
        this.techStack = techStack;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        SoftwareEngineer that = (SoftwareEngineer) o;
        return Objects.equals(id, that.id)
                && Objects.equals(name, that.name)
                && Objects.equals(techStack, techStack);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, techStack);
    }
}
