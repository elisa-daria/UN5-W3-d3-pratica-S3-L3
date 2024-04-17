package elisadaria.UN5W3d3praticaS3L3.es2;

import lombok.Builder;

import java.util.ArrayList;
import java.util.List;

public class Book implements BookElement{
    private List<BookElement> bookElementList=new ArrayList<>();
    private List<String> authors=new ArrayList<>();
    private double price;

    public Book(List<String> authors, double price) {
        this.authors = authors;
        this.price = price;
    }
    public void addBookE(BookElement be){
        bookElementList.add(be);
    }
    public void removeBookE(BookElement be){
        bookElementList.remove(be);
    }

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
    public void printEntireBook(){
        System.out.println("stampa dell'intero libro");
        print();
    }
}
