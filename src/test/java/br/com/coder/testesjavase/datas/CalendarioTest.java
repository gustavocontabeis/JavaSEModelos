package br.com.coder.testesjavase.datas;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import org.joda.time.DateTime;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author caixa
 */
public class CalendarioTest {
    
    public CalendarioTest() {
    }

    @Test
    public void testSomeMethod() {
        
        List<Date> datas = new ArrayList<>();
        for (int i = 0; i < 31; i++) {
            Calendar cal = new GregorianCalendar(2000, Calendar.JANUARY, i+1);
            Date time = cal.getTime();
            System.out.println(time+" - "+cal.get(Calendar.DAY_OF_WEEK)+"ª feira - "+cal.get(Calendar.DAY_OF_WEEK_IN_MONTH)+"ª semana");
            datas.add(time);
        }
        
        Object[][] semanas = montarCalendario(datas);
        imprimeCalendario(semanas);
        
        System.out.println("------------------------------------------------");
        
        datas = new ArrayList<>();
        for (int i = 0; i < 31; i++) {
            Calendar cal = new GregorianCalendar(2001, Calendar.JANUARY, i+1);
            Date time = cal.getTime();
            System.out.println(time+" - "+cal.get(Calendar.DAY_OF_WEEK)+"ª feira - "+cal.get(Calendar.DAY_OF_WEEK_IN_MONTH)+"ª semana");
            datas.add(time);
        }
        
        Object[][] semanas2 = montarCalendario(datas);
        imprimeCalendario(semanas2);
        
        System.out.println("------------------------------------------------");
        
    }

    private void imprimeCalendario(Object[][] semanas) {
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        for (Object[] semana : semanas) {
            for (Object obj : semana) {
                if(obj instanceof Date){
                    Date data = (Date) obj;
                    System.out.printf("%10s\t", data!=null?df.format(data):"");
                }else{
                    System.out.printf("%10s\t",obj!=null?obj:"");
                }
            }
            System.out.println("");
        }
    }

    private Object[][] montarCalendario(List<Date> datas) {
        Object[][] semanas = new Object[7][7];
        
        semanas[0] = new Object[]{ "Dom", "Seg", "Ter", "Qua", "Quin", "Sex", "Sab" };

        boolean init = false;
        int x = 0;
        for (int i = 1; i < semanas.length; i++) {
            for (int j = 0; j < 7; j++) {
                if(x == datas.size()){
                    break;
                }
                Date data = datas.get(x);
                if(!init && new DateTime(data).getDayOfWeek() == j){
                    init = true;
                }
                if(init){
                    semanas[i][j] = data;
                    x++;
                }
            }
        }
        return semanas;
    }
    
}
