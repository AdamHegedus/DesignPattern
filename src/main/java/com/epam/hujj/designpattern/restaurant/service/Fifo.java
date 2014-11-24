package com.epam.hujj.designpattern.restaurant.service;

public interface Fifo<T> {

    void put(T element);

    T pop();
}
