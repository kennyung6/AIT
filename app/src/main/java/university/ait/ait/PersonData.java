package university.ait.ait;


public class PersonData {


    String name;
    int image;
    int id_;

    public PersonData(String name,int image, int id_) {
        this.name = name;
        this.image = image;
        this.id_ = id_;
    }


    public String getName() {
        return name;
    }

    public int getImage() {
        return image;
    }

    public int getId() {
        return id_;
    }
}