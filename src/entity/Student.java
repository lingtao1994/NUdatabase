package entity;

/**
 * Created by LT on 2018/11/12
 */
public class Student {
    private int id;
    private String name;
    private String password;
    private String address;

    public Student(int id, String password) {
        this.id = id;
        this.password = password;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
