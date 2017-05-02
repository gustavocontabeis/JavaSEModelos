package br.com.coder.testesjavase.java8.ordenalist;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import org.junit.Test;

/**
 *
 * @author gustavo
 */
public class OrdenaListaTest {
    
    @Test
    public void testOrdenaLista(){
        
        List<String> list = Arrays.asList("Lautenir", "Romilda", "Giana", "Gustavo", "Leonardo", "Arthur");
        
        System.out.println(list);
        
        System.out.println("----------------");
        
        list.sort(new Comparator<String>(){
            @Override
            public int compare(String t1, String t2) {
                return t2.compareTo(t1);
            }
        });
        
        System.out.println(list);
        
        /* Interface funcional */
        Comparator<String> comparator = (t1, t2) -> 
        	t1.compareTo(t2);
        
        System.out.println("----------------");
        
        list.sort(comparator);
        
        System.out.println(list);
    }
    
}
