package date.format;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class FormatSimpleDate {

	public static void main(String[] args) {


				SimpleDateFormat sdf = new SimpleDateFormat("'hoy es 'dd' del mes 'MM' del año 'yyyy' y son las 'hh' horas con 'mm' minutos'");
				
				Date d=new Date();
				
				sdf.format(d);
				
				Calendar c = Calendar.getInstance();
				
				Date date = c.getTime();
				
				System.out.println(sdf.format(date));
				
				

			}




	}


