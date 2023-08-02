package ru.gb.oop.homework_4.view;

import ru.gb.oop.homework_4.data.User;

import java.util.List;

public interface UserViewInterface<T extends User> {
    public void sendOnConsole(List<T> listT);
}
