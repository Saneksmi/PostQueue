package com.company;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;

/**
 * Класс Почта, содержит метод добавления людей в очередь
 * и удаления из очереди.
 * */
public final class Post {

    private Integer clientAge;
    private Queue<Integer> postQue;
    public static final int CLIENT_NUMBER = 20;
    public static final int RETIREMENT_AGE = 65;
    public static final int MIN_AGE = 16;
    public static final int MAX_AGE = 87;

    public Post() {
        this.postQue = new PriorityQueue<>(CLIENT_NUMBER, comparator);
    }

    private Comparator<Integer> comparator = new Comparator<Integer>() {
        @Override
        public int compare(final Integer o1, final Integer o2) {
            if (o1 > RETIREMENT_AGE) {
                return -1;
            }
            if (o1 < RETIREMENT_AGE) {
                return 1;
            }
            return 0;
        }
    };

    public void addClientToQue() {
        for (int i = 0; i < CLIENT_NUMBER; i++) {
            //задаём диапазон возрастов клиентов от 16 до 87
            clientAge = MIN_AGE + (new Random().nextInt(MAX_AGE - MIN_AGE));
            postQue.add(clientAge);
        }
    }

    public void removeClientFromQue() {
        while (!(postQue.isEmpty())) {
            System.out.println(postQue.remove());
        }
    }

}
