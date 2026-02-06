package collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListPerformance {
        private static final int OPERATIONS = 100_000;

        public static void main(String[] args) {
            benchmarkArrayList();
            benchmarkLinkedList();
        }

        private static void benchmarkArrayList() {
            List<Integer> arrayList = new ArrayList<>();

            long startTime = System.nanoTime();
            for (int i = 0; i < OPERATIONS; i++) {
                arrayList.add(0, i); // insert at head
            }
            long endTime = System.nanoTime();

            long durationMs = (endTime - startTime) / 1_000_000;
            System.out.println("ArrayList head insertion time: " + durationMs + " ms");
        }

        private static void benchmarkLinkedList() {
            List<Integer> linkedList = new LinkedList<>();

            long startTime = System.nanoTime();
            for (int i = 0; i < OPERATIONS; i++) {
                linkedList.add(0, i); // insert at head
            }
            long endTime = System.nanoTime();

            long durationMs = (endTime - startTime) / 1_000_000;
            System.out.println("LinkedList head insertion time: " + durationMs + " ms");
        }
    }



