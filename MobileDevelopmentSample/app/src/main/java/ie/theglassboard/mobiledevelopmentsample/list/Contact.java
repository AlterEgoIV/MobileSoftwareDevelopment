package ie.theglassboard.mobiledevelopmentsample.list;

/**
 * Created by Kevin on 04/11/2016.
 */

public class Contact {

    private String name;
    private String email;
    private String phone;
    private int age;
    private String homePhone;

    public Contact(String name, String email, String phone, int age, String homePhone) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.age = age;
        this.homePhone = homePhone;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public int getAge() { return age; }

    public String getHomePhone() { return homePhone; }
}
