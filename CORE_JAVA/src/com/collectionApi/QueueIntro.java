package com.collectionApi;

import java.net.MulticastSocket;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.function.Consumer;

public class QueueIntro {

	public static void main(String[] args) {
		ArrayDeque<Integer> a = new ArrayDeque<Integer>();
		a.add('A' + 0);
		a.addLast(34);
		a.add(27);
		a.addFirst(40);
		a.addLast(50);
		a.add(200);
		a.addFirst(300);
		a.addLast(400);
		
//		a.ArrayDeque<Integer>)new ArrayDeque<Integer>();
//	   a.remove(34);
		a.forEach(new Consumer<Integer>() {

			@Override
			public void accept(Integer t) {
				System.out.println(t + 1000);

			}
		});

		System.out.println(a);

	}

}
