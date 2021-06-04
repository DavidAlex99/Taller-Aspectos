package com.bank;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Calendar;

public class User {

	private int key;
    private String name;
    private int id;
    private double money;


    public User(int key, String name, int id, double money){
        this.key = key;
        this.name = name;
        this.id = id;
        this.money = money;
    }
    public int getKey() {
        return key;
    }
    public void setKey(int key) {
        this.key = key;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public double getMoney() {
        return money;
    }
    public void setMoney(double money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "User [key="+key+", name=" + name + ", id=" + id + ", money=" + money + "]";
    }
    
    public void llenadotxt(){
    	Calendar cal = Calendar.getInstance();
        int hora, minutos, segundos;
        if(Bank.menu() == 2) {
        	hora =cal.get(Calendar.HOUR_OF_DAY);
			minutos = cal.get(Calendar.MINUTE);
			segundos = cal.get(Calendar.SECOND);
			String Shora = Integer.toString(hora);
			String Sminutos = Integer.toString(minutos);
			String Ssegundos = Integer.toString(segundos);
			String hora_completa = Shora + "/" + Sminutos + "/" + Ssegundos;
        }if(Bank.menu() == 3) {
        	hora =cal.get(Calendar.HOUR_OF_DAY);
			minutos = cal.get(Calendar.MINUTE);
			segundos = cal.get(Calendar.SECOND);
			String Shora = Integer.toString(hora);
			String Sminutos = Integer.toString(minutos);
			String Ssegundos = Integer.toString(segundos);
			String hora_completa = Shora + "/" + Sminutos + "/" + Ssegundos;
        }
    }
        //Aspecto: Deben hacer los puntos de cortes (pointcut) para crear un log con los tipos de transacciones realizadas.

 
        
    
}


