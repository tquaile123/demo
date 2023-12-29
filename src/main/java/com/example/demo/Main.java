package com.example.demo;

import org.jetbrains.annotations.NotNull;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

import java.util.*;

/**
 * The Main class implements an application that reads lines from the standard input
 * and prints them to the standard output.
 */
public class Main {

    /**
     * Iterate through each line of input.
     */

    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
        BufferedReader in = new BufferedReader(reader);
        String line;

        int maxCapacity = Integer.parseInt(in.readLine());
        int order = 0;
        PriorityQueue<Element> priorityQueue = new PriorityQueue<>(new QueueComparator());
        while ((line = in.readLine()) != null) {
            List<String> row = new ArrayList<String>(Arrays.asList(line.split(" ")));

            String operation = row.get(0);
            if (operation.equals("enqueue")) {
                int value = Integer.parseInt(row.get(1));
                int priority = Integer.parseInt(row.get(2));
                enqueue(priorityQueue, new Element(value, priority, order), maxCapacity);
            } else if (operation.equals("dequeue")) {
                dequeue(priorityQueue);
            }
            order++;
        }
        reader.close();

        printQueue(priorityQueue);
    }

    private static void enqueue(@NotNull PriorityQueue<Element> priorityQueue, Element element, int capacity) {
        if (priorityQueue.size() < capacity) {
            priorityQueue.add(element);
        } else  {
            PriorityQueue<Element> pqCopy = new PriorityQueue<Element>(priorityQueue);
            Element lowestPriorityElement = null;
            while(!pqCopy.isEmpty()){
                Element copyElement = pqCopy.peek();
                if (copyElement.priority < element.priority) {
                    lowestPriorityElement = copyElement;
                }
                pqCopy.poll();
            }

            if (lowestPriorityElement != null) {
                priorityQueue.remove(lowestPriorityElement);
                priorityQueue.add(element);
            }
        }
    }

    private static void dequeue(PriorityQueue<Element> priorityQueue) {
        if (!priorityQueue.isEmpty()) {
            priorityQueue.poll();
        }
    }

    private static void printQueue(PriorityQueue<Element> priorityQueue) {
        if (priorityQueue.isEmpty()) {
            System.out.println("Empty");
        } else {
            while (!priorityQueue.isEmpty()) {
                Element element = priorityQueue.poll();
                System.out.println(element.value + " " + element.priority);
            }
        }
    }

    static class Element {
        int value;
        int priority;

        int order;

        Element(int value, int priority, int order) {
            this.value = value;
            this.priority = priority;
            this.order = order;
        }
    }

    public static class QueueComparator implements Comparator<Element> {
        public int compare(Element e1, Element e2) {
           int retVal = Integer.compare(e2.priority, e1.priority);
            if (retVal == 0)
                retVal = Integer.compare(e1.order, e2.order);

            return retVal;
        }
    }
}