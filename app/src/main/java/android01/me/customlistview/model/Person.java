package android01.me.customlistview.model;

import java.io.Serializable;

/**
 * Created by mohammad on 06/10/14.
 */
public class Person implements Serializable {

    private String name;
    private String title;
    private String image;

    public Person(String name, String title, String image) {
        this.name = name;
        this.title = title;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
