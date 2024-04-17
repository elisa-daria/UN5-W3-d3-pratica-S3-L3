package elisadaria.UN5W3d3praticaS3L3.es2;

import java.util.ArrayList;
import java.util.List;

public class Section implements BookElement{
    private List<BookElement> bookElementList=new ArrayList<>();
    @Override
    public int getNofPages() {
        int nOfPages=0;
        for(BookElement element:bookElementList){
            nOfPages+=element.getNofPages();
        }
        return nOfPages;
    }

    @Override
    public void print() {
        for(BookElement element:bookElementList){
            element.print();
        }

    }
    public void addToElementList(BookElement be){
        bookElementList.add(be);
    }
    public void removeToElementList(BookElement be){
        bookElementList.remove(be);
    }
}
