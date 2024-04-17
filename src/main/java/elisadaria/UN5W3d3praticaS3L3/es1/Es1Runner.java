package elisadaria.UN5W3d3praticaS3L3.es1;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
@Component
@Order(0)
public class Es1Runner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        Info info=  Info.builder().nome("Aldo").cognome("Baglio").dataDiNascita(LocalDate.of(1961,5,9)).build();

        UserData ud=new UserData();
        DataAdapter adapter=new DataAdapter(info);
        ud.getData(adapter);

        System.out.println(ud.getNomeCompleto());
        System.out.println(ud.getEta());
        System.out.println("*************************************");


    }
}
