import java.util.ArrayList;
import java.util.Arrays;

class Book {
    String title;
    String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
}

public class Catalog {
    public static void main(String[] args) {
        Book[] catalogA = {new Book("태백산맥", "조정래"), new Book("이기적 유전자", "리처드 도킨스"),
                new Book("자전거 도둑", "박완서"), new Book("토지", "박경리"), new Book("대변동", "제레드 다이아몬드")};

        Book[] catalogA_Copy = catalogA;
        Book[] catalogB = catalogA.clone();

        catalogA[2] = new Book("그 많던 싱아는 누가 다 먹었을까", "박완서");

        ArrayList<Book> arrayListB = new ArrayList<>(Arrays.asList(catalogB));
        arrayListB.add(new Book("사피엔스", "유발 하라리"));
        Book[] newCatalogB = arrayListB.toArray(new Book[0]);
}
