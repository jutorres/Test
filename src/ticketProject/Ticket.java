package ticketProject;

import java.time.LocalDate;

public class Ticket {
	private String client;
	private LocalDate date;
	private double price;

	public Ticket(String client, LocalDate date, double price) {
		this.client = client;
		this.date = date;
		this.price = price;
	}

	public String getClient() {
		return client;
	}

	public LocalDate getDate() {
		return date;
	}

	public double getPrice() {
		return price;
	}

	public double calculatePrice(String client, LocalDate date) {
		if (client.equals("children")) {
			if (date.getDayOfWeek().getValue() == 2) {
				return price * 0.15;
			} else if (date.getDayOfWeek().getValue() == 3) {
				return price * 0.3;
			} else if (date.getDayOfWeek().getValue() == 6) {
				return price * 0.11;
			} else if (date.getDayOfWeek().getValue() == 1) {
				return price * 0.1;
			}
		} else if (client.equals("student")) {
			if (date.getDayOfWeek().getValue() == 2) {
				return price * 0.05;
			} else if (date.getDayOfWeek().getValue() == 3) {
				return price * 0.5;
			} else if (date.getDayOfWeek().getValue() == 4) {
				return price * 0.3;
			} else if (date.getDayOfWeek().getValue() == 1) {
				return price * 0.1;
			}
		} else if (client.equals("old_aged")) {
			if (date.getDayOfWeek().getValue() == 2) {
				return price * 0.15;
			} else if (date.getDayOfWeek().getValue() == 3) {
				return price * 0.4;
			} else if (date.getDayOfWeek().getValue() == 4) {
				return price * 0.3;
			} else if (date.getDayOfWeek().getValue() >= 6) {
				return price * 0.05;
			} else if (date.getDayOfWeek().getValue() == 1) {
				return price * 0.1;
			}
		} else if (client.equals("student_card")) {
			if (date.getDayOfWeek().getValue() < 6) {
				return price * 0.35;
			} else {
				return price;
			}
		}
		return price;
	}

	@Override
	public String toString() {
		return "Ticket [client=" + client + ", date=" + date + ", price=" + calculatePrice(client, date) + "]";
	}

}
