package com.example.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @author fanhuilin
 * @date 2021-10-25 18:05
 */

@Component
public class User {
    @Value("${user.username}")
    private String username;
    @Value("${user.age}")
    private Integer age;
    private Date birthday;
    private List<String> hobbies;
    private Map<Integer,String> grilFriend;
    private Address address;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public List<String> getHobbies() {
        return hobbies;
    }

    public void setHobbies(List<String> hobbies) {
        this.hobbies = hobbies;
    }

    public Map<Integer, String> getGrilFriend() {
        return grilFriend;
    }

    public void setGrilFriend(Map<Integer, String> grilFriend) {
        this.grilFriend = grilFriend;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", age=" + age +
                ", birthday=" + birthday +
                ", hobbies=" + hobbies +
                ", grilFriend=" + grilFriend +
                ", address=" + address +
                '}';
    }
}
