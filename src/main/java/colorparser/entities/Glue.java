package colorparser.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;



@Document(collection = "glues")
public class Glue implements Serializable {
    @Id
    Integer _id;

     String number;
     String name;
     String color;
     String picture;
     private int idManufacturer;
     private Set<Miks> Miks;

    public Glue(int _id, String number, String name, String color, String picture,int idManufacturer,Set<Miks> miks ) {
        this._id = _id;
        this.number = number;
        this.name = name;
        this.color = color;
        this.picture = picture;
        this.idManufacturer = idManufacturer;
        this.Miks = miks;
    }

    @Override
    public String toString() {
        return "Glue{" +
                "_id=" + _id +
                ", number='" + number + '\'' +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", picture='" + picture + '\'' +
                ", idManufacturer=" + idManufacturer +
                ", Miks=" + Miks +
                '}';
    }

    public Glue() {
    }

    public int getId() {
        return _id;
    }

    public void setId(int id) {
        this._id = id;
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public int getIdManufacturer() {
        return idManufacturer;
    }

    public void setIdManufacturer(int idManufacturer) {
        this.idManufacturer = idManufacturer;
    }

    public Set<colorparser.entities.Miks> getMiks() {
        return Miks;
    }

    public void setMiks(Set<colorparser.entities.Miks> miks) {
        Miks = miks;
    }
}
