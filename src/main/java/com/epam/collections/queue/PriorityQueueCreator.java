package com.epam.collections.queue;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class PriorityQueueCreator {
    public PriorityQueue<String> createPriorityQueue(List<String> firstList, List<String> secondList) {
        PriorityQueue<String> priorityQueue = new PriorityQueue<>(Comparator.reverseOrder());
        for (String s:
             firstList) {
            priorityQueue.add(s);
        }
        for (String s:
                secondList) {
            priorityQueue.add(s);
        }
        return priorityQueue;

    }
}
