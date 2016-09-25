package ticketProject;

import java.time.LocalDate;

public class Main {
	
	public static void main(String[] args) {
        Ticket t1 = new Ticket("childern", LocalDate.now(), 5.50);
        Ticket t2 = new Ticket("student", LocalDate.now(), 8.0);
        Ticket t3 = new Ticket("old_aged", LocalDate.now(), 6.0);
        Ticket t4 = new Ticket("student_card", LocalDate.now(), 6.0);
        
        t1.calculatePrice("children", LocalDate.now());
        System.out.println(t1);

        t2.calculatePrice("student", LocalDate.now());
        System.out.println(t2);
        
        t3.calculatePrice("old_aged", LocalDate.now());
        System.out.println(t3);
        
        t4.calculatePrice("student_card", LocalDate.now());
        System.out.println(t4);
    }

}
