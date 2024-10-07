package Pregunta1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class DateUtilsTest {

    @Test
    public void testValidDateLeapYear(){
        DateUtils dateUtils = new DateUtils();
        String result = dateUtils.getDayOfWeek("2024-02-29");
        assertEquals("SATURDAY", result);
    }
    @Test
    public void testValidDateNonLeapYear(){
        DateUtils dateUtils = new DateUtils();
        String result = dateUtils.getDayOfWeek("2024-05-27");
        assertEquals("MONDAY", result);
    }
    @Test
    public void testInvalidDateFormat(){
        DateUtils dateUtils = new DateUtils();
        Exception exception = assertThrows(IllegalArgumentException.class, () ->{
            dateUtils.getDayOfWeek("27-05-2024");
        });
        assertEquals("Invalid Date Format. Expect: YYYY-MM-dd", exception.getMessage());
    }
    @Test
    public void testInvalidDayInMonth(){
        DateUtils dateUtils = new DateUtils();
        Exception exception = assertThrows(IllegalArgumentException.class, () ->{
            dateUtils.getDayOfWeek("2024-02-30");
        });
        assertEquals("Invalid Date Format. Expect: YYYY-MM-dd", exception.getMessage());
    }
    @Test
    public void testInvalidMonth(){
        DateUtils dateUtils = new DateUtils();
        Exception exception = assertThrows(IllegalArgumentException.class, () ->{
            dateUtils.getDayOfWeek("2024-15-29");
        });
        assertEquals("Invalid Date Format. Expect: YYYY-MM-dd", exception.getMessage());
    }
    @Test
    public void testInvalidYear(){
        DateUtils dateUtils = new DateUtils();
        Exception exception = assertThrows(IllegalArgumentException.class, () ->{
            dateUtils.getDayOfWeek("weee-02-29");
        });
        assertEquals("Invalid Date Format. Expect: YYYY-MM-dd", exception.getMessage());
    }
    @Test
    public void testFebruary(){
        DateUtils dateUtils = new DateUtils();
        Exception exception = assertThrows(IllegalArgumentException.class, () ->{
            dateUtils.getDayOfWeek("2023-03-29");
        });
        assertEquals("Invalid Date Format. Expect: YYYY-MM-dd", exception.getMessage());
    }
    @Test
    public void testDateWeekend(){
        DateUtils dateUtils = new DateUtils();
        String result = dateUtils.getDayOfWeek("2024-10-13");
        assertEquals("SUNDAY", result);
    }
    @Test
    public void testDateOfWeek(){
        DateUtils dateUtils = new DateUtils();
        String result = dateUtils.getDayOfWeek("2024-01-01");
        assertEquals("INVALID", result);
    }
}
