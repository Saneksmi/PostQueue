package com.company;

/**
 * Программа реализует очередь на почту, на вход
 * подаётся 20 человек случайного возраста, пенсионеры
 * обслуживаются в первую очередь.
 **/
public final class Main {

    private Main() {
    }

    public static void main(final String[] args) {

        Post post = new Post();
        post.addClientToQue();
        post.removeClientFromQue();
    }
}
