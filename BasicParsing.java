import java.time.LocalTime;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class BasicParsing {
    public static void main(String[] args){
        String datastr="16-06-2025";
        try{
            DateTimeFormatter dataFormatter= DateTimeFormatter.ofPattern("dd-MM-yyyy");
            LocalDate date=LocalDate.parse(datastr,dataFormatter);
            System.out.println("Parsed date: "+date);
        }
        catch(Exception e){
            System.err.println("Invalid data format"+e.getMessage());
        }
        String timestr="16:17:00";
        try{
            DateTimeFormatter timeformatter=DateTimeFormatter.ofPattern("HH:mm:ss");
            LocalTime time=LocalTime.parse(timestr,timeformatter);
            System.out.println("Parsed time:"+time);
        }
        catch(Exception e){
            System.err.println("Invalid Time Format"+e.getMessage());
        }
        String dateTimestr="2025/06/16 04:22 PM";
        try{
            DateTimeFormatter datetimeFormatter=DateTimeFormatter.ofPattern("yyyy/MM/dd hh:mm a");
            LocalDateTime dateTime=LocalDateTime.parse(dateTimestr,datetimeFormatter);
            System.out.println("Parsed dateTime: "+dateTime);

        }
        catch(Exception e){
            System.err.println("Invalid datetime Format: "+e.getMessage());
        }

    }
}