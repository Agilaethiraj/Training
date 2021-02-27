package io.assignment.guest;

public class Gues {
    private String name;
    private long phone;
    private int age;
    private Integer guest_id;

    public Gues( String name, long phone, int age) {
        this.name = name;
        this.phone = phone;
        this.age = age;

    }

    public Integer getGuest_id() {
        return guest_id;
    }

    public String getName() {
        return name;
    }

    public long getPhone() {
        return phone;
    }

    public int getAge() {
        return age;
    }

    public void setGuest_id(Integer guest_id) {
        this.guest_id = guest_id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
