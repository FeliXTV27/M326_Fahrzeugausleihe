public class Car extends Vehicle{
    private int bagcount;
    private String platform;
    private boolean navi;

    public int getBagcount() {
        return bagcount;
    }

    public void setBagcount(int bagcount) {
        this.bagcount = bagcount;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public boolean isNavi() {
        return navi;
    }

    public void setNavi(boolean navi) {
        this.navi = navi;
    }
}
