import java.util.*;
public class CalendarEvent{
  GregorianCalendar c
  String title;
  int endHr;
  int endMin;

  //
  public CalendarEvent(String title, int endHr, int endMin){
  c = new GregorianCalendar();
  endHr = this.endHr;
  endMin = this.endMin;
  title = this.title;
  }

  public CalendarEvent(String title, int startHour, int startMin, int day, int month, int endTime, int endHr, int endMin){
  c = new GregorianCalendar();
  c.set(c.MONTH, month);
  c.set(c.DATE, day);
    
  endHr = this.endHr;
  endMin = this.endMin;
  title = this.title;



  }


}
