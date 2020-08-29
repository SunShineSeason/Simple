package learning.factory.challenge;

import java.util.*;

public abstract class Calendar {
	Zone zone;
	public void print() {
		System.out.println("--- " + zone.getDisplayName() + " Calendar ---");
		// print all appointments in correct time zone
		System.out.println("Offset from GMT: " + zone.getOffset());
		System.out.println("Hello");
		new String s;
		System.out.println("I am user fwu3!");
		System.out.println("This is sunshineseason");
	}
	public abstract void createCalendar(List<String> appointments);
	Hello!!!!!!!!!!!!!!!!!!!!
}
