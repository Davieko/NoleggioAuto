package polito.it.noleggio.model;

import java.time.LocalTime;

public class Event implements Comparable<Event>{
	
	public enum EventType {
		NUOVO_CLIENTE,
		RITORNO_AUTO
	}
	
	private LocalTime time ;
	private EventType type ;
	
	@Override
	public int compareTo(Event other) {
		// il confronto temporale tra due oggetti di tipo evento 
		//coincide con il confronto temporale dell'attributo time in ciascuno di essi, il primo è quello che ha tempo più basso
		return this.time.compareTo(other.time) ;
	}

	public Event(LocalTime time, EventType type) {
		super();
		this.time = time;
		this.type = type;
	}

	public LocalTime getTime() {
		return time;
	}

	public void setTime(LocalTime time) {
		this.time = time;
	}

	public EventType getType() {
		return type;
	}

	public void setType(EventType type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Event [time=" + time + ", type=" + type + "]";
	}
	
	
	
	
}
