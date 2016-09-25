package ticketTest;

import static org.junit.Assert.*;

import java.time.LocalDate;
import java.time.Month;

import org.junit.Test;

import ticketProject.Ticket;

public class TicketTest {
	
	private static final double DELTA = 1e-15;


	Ticket t1 = new Ticket("student", LocalDate.now(), 8.0);
	
	@Test
	public void testRegularDayOfWeek() throws Exception {
        double result = t1.calculatePrice("student", LocalDate.of(2016, Month.SEPTEMBER, 24));
        assertEquals(8.0, result, DELTA);
    }

}
