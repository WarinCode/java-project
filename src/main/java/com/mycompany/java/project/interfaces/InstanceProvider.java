package com.mycompany.java.project.interfaces;

@FunctionalInterface
public interface InstanceProvider<T> {
    public T getInstance();
}
