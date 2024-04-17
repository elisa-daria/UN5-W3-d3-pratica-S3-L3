package elisadaria.UN5W3d3praticaS3L3.es1;

import lombok.AllArgsConstructor;

import java.time.LocalDate;

@AllArgsConstructor
public class DataAdapter implements DataSource{
    private Info info;

    @Override
    public String getNomeCompleto() {
        return info.getNome()+" "+info.getCognome();
    }

    @Override
    public int getEta() {
        LocalDate oggi=LocalDate.now();
        int annoDiNAscita=info.getDataDiNascita().getYear();
        return oggi.getYear()-annoDiNAscita;
    }
}
