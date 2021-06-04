import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Calendar;

/*public aspect Log {
    FileWriter file = new FileWriter("log.txt");
    Calendar cal = Calendar.getInstance();
    int hora, minutos, segundos;
    if(Bank.menu == 2) {
    	try {
    		file.write("Realizar transaccion");
    		hora =cal.get(Calendar.HOUR_OF_DAY);
    		minutos = cal.get(Calendar.MINUTE);
    		segundos = cal.get(Calendar.SECOND);
    		String_hora = Integer.toString(hora);
    		String_minutos = Integer.toString(minutos);
    		String_segundos = Integer.toString(segundos);
    		hora_completa = String_hora + "/" + String_minutos + "/" + String_segundos;
    		file.write(hora_completa);
    	}catch(IOException e) {
    		e.printStackTrace();
    	}
    }if(Bank.menu == 3) {
    	try {
    		file.write("Retirar dinero");
    		hora =cal.get(Calendar.HOUR_OF_DAY);
    		minutos = cal.get(Calendar.MINUTE);
    		segundos = cal.get(Calendar.SECOND);
    		String_hora = Integer.toString(hora);
    		String_minutos = Integer.toString(minutos);
    		String_segundos = Integer.toString(segundos);
    		hora_completa = String_hora + "/" + String_minutos + "/" + String_segundos;
    		file.write(hora_completa);
    	}catch(IOException e)
    		e.printStackTrace();
    	}
    }else{
    	print("null");
    }
    //Aspecto: Deben hacer los puntos de cortes (pointcut) para crear un log con los tipos de transacciones realizadas.

    pointcut success() : call(* create*(..) );
    after() : success() {
    	System.out.println("**** User created ****");
    }
}*/

public aspect Log {
    
    
    //Aspecto: Deben hacer los puntos de cortes (pointcut) para crear un log con los tipos de transacciones realizadas.
    pointcut success() : call(* create*(..) );
    before() : success() {
    	try {
    		FileWriter file = new FileWriter("log.txt");
			file.write("Retirar dinero");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	System.out.println("**** User created ****");
    }
}

