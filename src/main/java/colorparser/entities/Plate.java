package colorparser.entities;

import org.springframework.data.mongodb.core.mapping.Document;
import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;


@Document(collection = "plates")
public class Plate implements Serializable  {

   @Id
   int _id;
   String number;
   String name;
   String color;
   Integer hight;
   Integer lenght;
   Integer width;
   private Set<Miks> Miks;
   private Set<Glue> Glues;
   private int idManufacturer;

    public Plate(int id, String number, String name, String color, Integer hight, Integer lenght, Integer width, int idManufacturer) {
        this._id = id;
        this.number = number;
        this.name = name;
        this.color = color;
        this.hight = hight;
        this.lenght = lenght;
        this.width = width;
        this.idManufacturer = idManufacturer;
    }

    public Plate() {
    }

    @Override
    public String toString() {
        return "Plate{" +
                "id=" + _id +
                ", number='" + number + '\'' +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", hight=" + hight +
                ", lenght=" + lenght +
                ", width=" + width +
                ", Miks=" + Miks +
                ", Glues=" + Glues +
                ", idManufacturer=" + idManufacturer +
                '}';
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

    public Integer getHight() {
        return hight;
    }

    public void setHight(Integer hight) {
        this.hight = hight;
    }

    public Integer getLenght() {
        return lenght;
    }

    public void setLenght(Integer lenght) {
        this.lenght = lenght;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public int getIdManufacturer() {
        return idManufacturer;
    }

    public void setIdManufacturer(int idManufacturer) {
        this.idManufacturer = idManufacturer;
    }
}
