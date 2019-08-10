
package br.com.infnet.ecommerce;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import br.com.infnet.ecommerce.controller.VendaController;

/**
 * Hello world!
 *
 */
@Configuration
@ComponentScan
public class App 
{
    @SuppressWarnings("resource")
	public static void main( String[] args )
    {
    	
        AnnotationConfigApplicationContext ctx = 
        			new AnnotationConfigApplicationContext(App.class);
        //ctx.scan(App.class.getPackage().getName());
       
        VendaController venda = ctx.getBean(VendaController.class);
        System.out.print(venda.getTotalVenda());
//        
//        for( String nome : ctx.getBeanDefinitionNames() ) {
//        	System.out.println(nome);
//        }
    	
    	
    }
}
