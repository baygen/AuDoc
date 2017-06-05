/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.audoc.model.datetime;

import java.sql.Timestamp;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Date;

/**
 *
 * @author sofia
 */
public class DateTimeAPI {
    
    /**
     *
     */
    public static final String STRING_DATE_FIRST_TABLE;
    public static final String STRING_DATE_SECOND_TABLE;
    public LocalDateTime timestampEntity;
    public static final LocalDate DATE_FIRST_TABLE;
    public static final LocalDate DATE_SECOND_TABLE;
    

    static {
        DATE_FIRST_TABLE = getFirstTableDate();
        DATE_SECOND_TABLE = getSecondTableDate();

        STRING_DATE_FIRST_TABLE = DATE_FIRST_TABLE.format(DateTimeFormatter.ofPattern("dd.MM.yyyy"));
        STRING_DATE_SECOND_TABLE = DATE_SECOND_TABLE.format(DateTimeFormatter.ofPattern("dd.MM.yyyy"));
        }

    private static LocalDate getSecondTableDate() {
        LocalDate next;
            if(DayOfWeek.SATURDAY.equals(getFirstTableDate().getDayOfWeek())){
                next = getFirstTableDate().plusDays(3);
            }else{
                next = getFirstTableDate().plusDays(2);
            }
        return next;
    }

    private static LocalDate getFirstTableDate() {
        LocalDate day;
        DayOfWeek todayDayOfWeek=LocalDate.now().getDayOfWeek();

            if(todayDayOfWeek.equals(DayOfWeek.TUESDAY)
                    ||todayDayOfWeek.equals(DayOfWeek.THURSDAY)
                    ||todayDayOfWeek.equals(DayOfWeek.SATURDAY)){
                day = LocalDate.now();
            }else{
                if(todayDayOfWeek.equals(DayOfWeek.SUNDAY)){
                   day = LocalDate.now().plusDays(2);
                }else{
                day = LocalDate.now().plusDays(1);
                }
            }
            return day;
    }

    public static Timestamp getTimestampOf(String date,String time){
        
        Timestamp stamp = Timestamp.valueOf(LocalDateTime.parse((date+" "+time)
                , DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm")));
        return stamp;     
    }
    
    public static Timestamp getTimestampOf(Date date,String time){
        
        Timestamp stamp = Timestamp.valueOf(LocalDateTime.parse((date+" "+time)
                , DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm")));
        return stamp;     
    }
    
    
}
