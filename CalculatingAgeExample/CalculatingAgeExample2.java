import java.time.LocalDate;  
import java.time.Period;  
import java.time.temporal.ChronoUnit;  
import java.util.Scanner;  
public class  CalculatingAgeExample2 
{  
public static void main(String args[])   
{  
LocalDate startDate = LocalDate.of(1998, 01, 28);  
LocalDate endDate = LocalDate.of(2023, 01, 28); //alternative of LocalDate.now() method  
//calculates the amount of time between two specified temporal objects  
long years = ChronoUnit.YEARS.between(startDate, endDate);  
//prints age in years  
System.out.println("You are " + years+" years old.");  
}  
}  