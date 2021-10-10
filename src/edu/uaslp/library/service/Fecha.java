package edu.uaslp.library.service;

import java.time.LocalDate;
import java.time.Period;

public class Fecha {

    public static final int JULIO=7;
    public static final int AGOSTO=8;
    public static final int ENERO=1;
    public static final int NOVIEMBRE=11;

    private int year;
    private int month;
    private int day;

    public Fecha(){
        LocalDate date = LocalDate.now();
    }

    public Fecha(int year, int month, int day) {
        this.year = year;

        if(month>=1&&month<=12)
        this.month = month;

        if ((month==1||month==3||month==5||month==7||month==8||month==10||month==12)&&day<=31)
            this.day = day;

        else if ((month==4||month==6||month==9||month==11)&&day<=30)
            this.day = day;

        else if (month==2){
            if (year%4==00&&day<=29)
                this.day = day;
            else if(day<=28)
                this.day = day;
        }
    }

    public Boolean esAntes(Fecha fecha){
        if (this.year <= fecha.year && this.month <= fecha.month && this.day <= fecha.day)
            return false;
        else
            return true;
    }

    public Boolean esDespues(Fecha fecha) {
        if (this.year >= fecha.year && this.month >= fecha.month && this.day >= fecha.day)
            return true;
        else
            return false;
    }

    public Boolean esMismoDia(Fecha fecha) {
        if (this.year == fecha.year && this.month == fecha.month && this.day == fecha.day)
            return true;
        else
            return false;
    }


    public void avanzaDays(int days){
        this.day += days;
    }

    public void retrocedeDays(int days){
        this.day -= days;
    }

    public int tiempoTranscurridoenAnios(Fecha fecha){
        int aux;

        aux = this.year%2000 - fecha.year;
        return (aux);
    }

    public int tiempoTranscurridoenDias(Fecha fecha){
        int aux;
        int mes = (fecha.month --) *30;
        int anio =(fecha.year--)*365;

        aux = fecha.day + mes + anio;
        return aux;
    }

    public String format(String formato){
        return this.day + "/" + this.month +"/" + this.year;
    }
}
