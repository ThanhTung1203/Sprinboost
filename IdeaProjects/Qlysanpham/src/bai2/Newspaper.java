package bai2;

public class Newspaper extends Library{
    private int releaseDay;

    public Newspaper(int id, String publishingcompany, int releasequantity, int releaseDay) {
        super(id, publishingcompany, releasequantity);
        this.releaseDay = releaseDay;
    }

    public int getReleaseDay() {
        return releaseDay;
    }

    public void setReleaseDay(int releaseDay) {
        this.releaseDay = releaseDay;
    }

    @Override
    public String toString() {
        return "Newspaper" +
                "\nId :"+getId()+
                "\nNha xuat ban :"+getPublishingcompany()+
                "\nSo luogn xuat ban :"+getReleasequantity()+
                "\nreleaseDay=" + releaseDay;
    }
}
