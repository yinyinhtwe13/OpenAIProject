package com.yinyinhtwe.OpenAIProject;

import java.util.Objects;

public class SoftwareEngineer {

    private int Id;
    private String name;
    private String techStack;

    public SoftwareEngineer(int id, String name, String techStack) {
        Id = id;
        this.name = name;
        this.techStack = techStack;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
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
        if (o == null || getClass() != o.getClass()) return false;
        SoftwareEngineer that = (SoftwareEngineer) o;
        return Id == that.Id && Objects.equals(name, that.name) && Objects.equals(techStack, that.techStack);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Id, name, techStack);
    }
}
