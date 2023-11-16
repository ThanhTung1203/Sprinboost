package bai2;

public class Magazine extends Library{
    private int issueNumber;
    private String releaseMonth;

    public Magazine(int id, String publishingcompany, int releasequantity, int issueNumber, String releaseMonth) {
        super(id, publishingcompany, releasequantity);
        this.issueNumber = issueNumber;
        this.releaseMonth = releaseMonth;
    }

    public int getIssueNumber() {
        return issueNumber;
    }

    public void setIssueNumber(int issueNumber) {
        this.issueNumber = issueNumber;
    }

    public String getReleaseMonth() {
        return releaseMonth;
    }

    public void setReleaseMonth(String releaseMonth) {
        this.releaseMonth = releaseMonth;
    }

    @Override
    public String toString() {
        return "Magezine" +
                "\nId :"+getId()+
                "\nNha xuat ban :"+getPublishingcompany()+
                "\nSo luogn xuat ban :"+getReleasequantity()+
                "\nissueNumber ;" + issueNumber +
                "\nreleaseMonth :" + releaseMonth
                ;
    }
}
