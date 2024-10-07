package Pregunta1;

import static org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import Pregunta1.DateUtils;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class DateUtilsTest {

    public void testValidDateLeapYear(){
        DateUtils dateUtils = new DateUtils();
        String result = dateUtils.getDayOfWeek("2024-02-29");
        assertEquals("SATURDAY", result);
    }

    public void testValidDateNonLeapYear(){
        DateUtils dateUtils = new DateUtils();
        String result = dateUtils.getDayOfWeek("2024-05-27");
        assertEquals("MONDAY", result);
    }

    public void testInvalidDateFormat(){
        DateUtils dateUtils = new DateUtils();
        Exception exception = assertThrows(IllegalArgumentException.class, () ->{
            dateUtils.getDayOfWeek("27-05-2024");
        });
        assertEquals("Invalid Date Format. Expect: YYYY-MM-dd", exception.getMessage());
    }

    public void testInvalidDayInMonth(){
        DateUtils dateUtils = new DateUtils();
        Exception exception = assertThrows(IllegalArgumentException.class, () ->{
            dateUtils.getDayOfWeek("2024-02-30");
        });
        assertEquals("Invalid Date Format. Expect: YYYY-MM-dd", exception.getMessage());
    }

    public void testInvalidMonth(){
        DateUtils dateUtils = new DateUtils();
        Exception exception = assertThrows(IllegalArgumentException.class, () ->{
            dateUtils.getDayOfWeek("2024-15-29");
        });
        assertEquals("Invalid Date Format. Expect: YYYY-MM-dd", exception.getMessage());
    }

    public void testInvalidYear(){
        DateUtils dateUtils = new DateUtils();
        Exception exception = assertThrows(IllegalArgumentException.class, () ->{
            dateUtils.getDayOfWeek("weee-02-29");
        });
        assertEquals("Invalid Date Format. Expect: YYYY-MM-dd", exception.getMessage());
    }

    public void testFebruary(){}


}
