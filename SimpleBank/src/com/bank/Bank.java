package com.bank;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

public class Bank {
	static final int EXIT = 5;
    static ArrayList<User> users = new ArrayList<>();
    private static Scanner input = new Scanner(System.in);
    public static void initBank(){
        users.add(new User(1,"Usuario1",1,0.0));
        users.add(new User(2,"Usuario2",2,10000.0));
        users.add(new User(3,"Usuario3",3,1000000.0));
        users.add(new User(4,"Usuario4",4,500.0));

    }

    public static void main(String[] args) {
        int opcion = 0;
        initBank();
        while(opcion != EXIT){
            opcion = menu();
        };

    }
    public static int menu(){
        System.out.println("Banco AspectJ");
        System.out.println("------------------------------------");
        System.out.println("1 - Crear usuario");
        System.out.println("2 - Realizar transaccion");
        System.out.println("3 - Retirar dinero");
        System.out.println("4 - Ver usuarios");
        System.out.println("5 - Salir");
        System.out.println("------------------------------------");
        int option = Integer.valueOf(readConsole("Opcion"));
        switch (option) {
        case 1:
            System.out.println("Crear Usuario");
            System.out.println("------------------------------------");
            createUser();
        break;
        case 2:
            System.out.println("Realizar transaccion");
            System.out.println("------------------------------------");
             moneyMakeTransaction(); 
        break;
        case 3:
            System.out.println("Retirar dinero");
            System.out.println("------------------------------------");
             moneyWithdrawal();
        break;
        case 4:
            System.out.println("Ver Usuarios");
            viewUsers();
        break;
        case EXIT:
        break;
        default:
            System.out.println("Opcion incorrecta");
            break;
        }
        return option;
    }

    public static  String readConsole(String mensaje){
        System.out.println(mensaje);  
        String inputText;
        inputText = input.nextLine();           
        return inputText;
    }

    public static void createUser(){
        String nombre = readConsole("Nombre :");
        int id = Integer.valueOf(readConsole("Id: "));
        double money = Double.valueOf(readConsole("Dinero: "));
        users.add(new User(users.size(),nombre,id,money));
    }

    public static void moneyMakeTransaction(){
        int id = Integer.valueOf(readConsole("Key: "));
        double money = Double.valueOf(readConsole("Dinero a depositar: "));
        users.get(id-1).setMoney(users.get(id-1).getMoney() + money);
        FileWriter file;
		try {
			file = new FileWriter("log.txt");
			file.write("Deposito ");
			file.write(llenadotxt());
			file.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
    }
    public static void moneyWithdrawal(){
        int id = Integer.valueOf(readConsole("Key: "));
        double money = Double.valueOf(readConsole("Dinero a retirar: "));
        users.get(id-1).setMoney(users.get(id-1).getMoney() - money);
        FileWriter file;
		try {
			file = new FileWriter("log.txt");
			file.write("Retiro ");
			file.write(llenadotxt());
			file.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
    }
    public static void viewUsers(){
        System.out.println("------------------------------------");
        for(User u:users){  
            System.out.println(u);
        }
        System.out.println("------------------------------------");
    }
    
    public static String llenadotxt(){
    	Calendar cal = Calendar.getInstance();
        int hora, minutos, segundos;
        hora =cal.get(Calendar.HOUR_OF_DAY);
		minutos = cal.get(Calendar.MINUTE);
		segundos = cal.get(Calendar.SECOND);
		String Shora = Integer.toString(hora);
		String Sminutos = Integer.toString(minutos);
		String Ssegundos = Integer.toString(segundos);
		String hora_completa = Shora + ":" + Sminutos + ":" + Ssegundos;
		return hora_completa;
    
}
}
