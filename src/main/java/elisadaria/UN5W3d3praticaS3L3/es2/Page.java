package elisadaria.UN5W3d3praticaS3L3.es2;

public class Page implements BookElement{
    private int nOfPages=1;
    @Override
    public int getNofPages() {
        return nOfPages;
    }

    @Override
    public void print() {
        System.out.println("print della singola pagina");

    }
}
