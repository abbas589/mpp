package com.miu.mpp.lab10.q6;

//Show the methods are not threadsafe.
//Then modify so that they are threadsafe.
public class Queue {
    class Node {
        Object value;
        Node next;
    }

    private Node head;
    private Node tail;

    public synchronized void add(Object newValue) {
        Node n = new Node();
        if (head == null) head = n;
        else tail.next = n;
        tail = n;
        tail.value = newValue;
    }

    public Object remove() {
        if (head == null) return null;
        Node n = head;
        head = n.next;
        return n.value;
    }

    public static void main(String[] args) {

        Queue queue = new Queue();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                queue.add(i);
            }
        });
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                queue.add(i);
            }
        });

        t1.start();
        t2.start();

		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// Check if the queue contains the expected number of elements
		int count = 0;
		Node node = queue.head;
		while (node != null) {
			count++;
			node = node.next;
		}
		System.out.println("Expected: 2000, Found: " + count);

    }
}
