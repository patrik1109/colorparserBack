package colorparser.entities;


import org.hibernate.search.annotations.Field;
import org.hibernate.search.annotations.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashMap;

@Document(collection = "mikses")
public class Miks implements Serializable {

    @Id
    int _id;
    String number;
    String name;
    private HashMap<?,Integer> consistanse;
    private HashMap<?,Integer> colorants;

    public Miks(int _id, String number, String name, HashMap<?, Integer> consistanse, HashMap<?, Integer> colorants) {
        this._id = _id;
        this.number = number;
        this.name = name;
        this.consistanse = consistanse;
        this.colorants = colorants;
    }

    public int get_id() {
        return _id;
    }

    public void set_id(int _id) {
        this._id = _id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public HashMap<?, Integer> getConsistanse() {
        return consistanse;
    }

    public void setConsistanse(HashMap<?, Integer> consistanse) {
        this.consistanse = consistanse;
    }

    public HashMap<?, Integer> getColorants() {
        return colorants;
    }

    public void setColorants(HashMap<?, Integer> colorants) {
        this.colorants = colorants;
    }

    @Override
    public String toString() {
        return "Miks{" +
                "_id=" + _id +
                ", number='" + number + '\'' +
                ", name='" + name + '\'' +
                ", consistanse=" + consistanse +
                ", colorants=" + colorants +
                '}';
    }
}
