package bai2;

public class Library {
    private int id;
    private String publishingcompany;
    private int releasequantity;


    public Library(int id, String publishingcompany, int releasequantity) {
        this.id = id;
        this.publishingcompany = publishingcompany;
        this.releasequantity = releasequantity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPublishingcompany() {
        return publishingcompany;
    }

    public void setPublishingcompany(String publishingcompany) {
        this.publishingcompany = publishingcompany;
    }

    public int getReleasequantity() {
        return releasequantity;
    }

    public void setReleasequantity(int releasequantity) {
        this.releasequantity = releasequantity;
    }

    @Override
    public String toString() {
        return "Library{" +
                "id=" + id +
                ", publishingcompany='" + publishingcompany + '\'' +
                ", releasequantity=" + releasequantity +
                '}';
    }
}
