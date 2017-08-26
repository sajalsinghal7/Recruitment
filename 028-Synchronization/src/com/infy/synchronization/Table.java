package com.infy.synchronization;
class Table {
// synchronized method	
public synchronized void printTable(int n) {
		System.out.println("Printing table of " + n);
		for (int i = 1; i <= 5; i++) {
			System.out.println(n * i);
			try {
				Thread.sleep(400);
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}
}
