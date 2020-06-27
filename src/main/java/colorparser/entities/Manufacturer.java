package colorparser.entities;

import org.hibernate.search.annotations.Field;
import org.hibernate.search.annotations.Indexed;
import org.hibernate.search.annotations.TermVector;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Set;


@Document(collection = "manufactures")
public class Manufacturer implements Serializable {
    @Id
    int _id;

    String number;
    String name;
    String phone;
    String address;
    String fax;
    String email;
    HashMap<Integer,Set<?>> products;
    Set<Plate> plateSet;
    Set<Glue> glueSet;

    public Manufacturer(int id, String number, String name, String phone, String address, String fax, String email,Set<Plate> plateSet,Set<Glue> glueSet) {
        this._id = id;
        this.number = number;
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.fax = fax;
        this.email = email;
        this.plateSet = plateSet;
        this.glueSet = glueSet;
    }

    public Manufacturer() {
    }

    public HashMap<Integer, Set<?>> getProducts() {
        return products;
    }

    public void setProducts(HashMap<Integer, Set<?>> products) {
        this.products = products;
    }

    @Override
    public String toString() {
        return "Manufacturer{" +
                "id=" + _id +
                ", number='" + number + '\'' +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                ", fax='" + fax + '\'' +
                ", email='" + email + '\'' +
                ", plateSet=" + plateSet +
                ", glueSet=" + glueSet +
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Set<Plate> getPlateSet() {
        return plateSet;
    }

    public void setPlateSet(Set<Plate> plateSet) {
        this.plateSet = plateSet;
    }

    public Set<Glue> getGlueSet() {
        return glueSet;
    }

    public void setGlueSet(Set<Glue> glueSet) {
        this.glueSet = glueSet;
    }
}
