package elisadaria.UN5W3d3praticaS3L3.es2;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@Order(1)
public class Es2Runner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        Book book=new Book(Arrays.asList("author1"),23.99);
        Section section1= new Section();
        section1.addToElementList(new Page());
        section1.addToElementList(new Page());
        book.addBookE(section1);
        Section section= new Section();
        section.addToElementList(new Page());
        section.addToElementList(new Page());
        section.addToElementList(new Page());
        section.addToElementList(new Page());
        book.addBookE(section);
        System.out.println("tot pagine del libro: "+book.getNofPages());
        book.printEntireBook();

    }
}
