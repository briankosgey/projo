public class custom {
    int images;
    String Name,RATING;
    //generate constructor to initialize values
    public custom(int images, String Name, String RATING) {
        this.images = images;
        this.Name = Name;
        this.RATING = RATING;
    }
    //generate a getter to fetch values

    public int getImages() {

        return images;
    }

    public String getItem() {
        return Name;
    }

    public String getPrice() {
        return RATING;
    }
}


