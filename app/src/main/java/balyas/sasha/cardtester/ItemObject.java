package balyas.sasha.cardtester;
public class ItemObject {

    private String name;
    private String date;
    private String place;
    private String address;

    public ItemObject(final String name, final String date, final String place, final String address) {
        this.name = name;
        this.date = date;
        this.place = place;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(final String date) {
        this.date = date;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(final String place) {
        this.place = place;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(final String address) {
        this.address = address;
    }
}