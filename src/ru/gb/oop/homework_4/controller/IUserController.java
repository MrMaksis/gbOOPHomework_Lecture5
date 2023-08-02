package ru.gb.oop.homework_4.controller;

import ru.gb.oop.homework_4.data.User;

public interface IUserController <T extends User>{
    void create(String firstName, String surName, String lastName);
}
