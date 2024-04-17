package elisadaria.UN5W3d3praticaS3L3.es1;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import java.time.LocalDate;
@Getter
@Builder
public class Info {
    private String nome;
    private String cognome;
    private LocalDate dataDiNascita;


}
