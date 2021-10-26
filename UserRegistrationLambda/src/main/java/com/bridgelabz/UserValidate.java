package com.bridgelabz;

@FunctionalInterface
public interface UserValidate<T> {
    boolean validate(T param);
}