import java.util.*;
public class Event {
	
	private int startTime;
	private int endTime;
	private String eventName;
	private GregorianCalendar cal = new GregorianCalendar();  
	
	public Event(int startTime, int endTime, String eventName, int year, int month, int day) {
		this.startTime = startTime;
		this.endTime = endTime;
		this.eventName = eventName;
		cal.set(year, month, day);
		}
	
	public Event(int startTime, int endTime, String eventName) {
		this.startTime = startTime;
		this.endTime = endTime;
		this.eventName = eventName;
		}

	public GregorianCalendar getDate(){
		return cal;
	}
	// Travis Made This
	public int getStartTime(){ 
		return startTime;
	}
	
	public int getEndTime(){ 
		return endTime;
	}
	
	public int getDay(){ 
		return cal.get(GregorianCalendar.DAY_OF_MONTH);
	}
	public void setStartTime(int startTime){
		this.startTime = startTime;
	}
	public void setEndTime(int startTime){
		this.endTime = endTime;
	}
	public void setEventName(String name){
		eventName = name; 
	}
	public void setDate(int year, int month, int day){
		cal.set(year, month, day);
	}
}
