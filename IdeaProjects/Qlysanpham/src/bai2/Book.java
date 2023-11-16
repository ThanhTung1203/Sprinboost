package bai2;

public class Book extends Library {
    private String nameAuthor;
    private int numberOfpage;

    public Book(int id, String publishingcompany, int releasequantity, String nameAuthor, int numberOfpage) {
        super(id, publishingcompany, releasequantity);
        this.nameAuthor = nameAuthor;
        this.numberOfpage = numberOfpage;
    }

    public String getNameAuthor() {
        return nameAuthor;
    }

    public void setNameAuthor(String nameAuthor) {
        this.nameAuthor = nameAuthor;
    }

    public int getNumberOfpage() {
        return numberOfpage;
    }

    public void setNumberOfpage(int numberOfpage) {
        this.numberOfpage = numberOfpage;
    }

    @Override
    public String toString() {
        return "Book" +
                "\nId :"+getId()+
                "\nNha xuat ban :"+getPublishingcompany()+
                "\nSo luogn xuat ban :"+getReleasequantity()+
                "\nnameAuthor : " + nameAuthor +
                "\nnumberOfpage : " + numberOfpage
                ;
    }
}




