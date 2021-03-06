package com.wellnessapp.demo;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.gridfs.GridFsObject;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Document(collection="Admin")
public class Admin {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String username;
    private String password;
    private String email;
    //    Possible way to store profile pictures?
    private GridFsObject profilePic;
    private String firstName;
    private String lastName;
//    private String gender;
//    // get city/state from coords in registration or manual entry
//    private String city;
//    private String state;
    private String phone;
//    private Date signUpTime;
//    //    state of user: Online/Offline
//    private Boolean online;
//    private Boolean isDeleted;

    public Admin(Long id, String username, String password, String email, GridFsObject profilePic, String firstName, String lastName, String phone) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.email = email;
//        this.profilePic = profilePic;
        this.firstName = firstName;
        this.lastName = lastName;
//        this.gender = gender;
//        this.city = city;
//        this.state = state;
        this.phone = phone;
//        this.signUpTime = signUpTime;
//        this.online = online;
//        this.isDeleted = isDeleted;
    }

    public Admin() {

    }


    public String printAdmin() {
        String r = "Username: " + getUsername() + ", Email: " + getEmail() + ", Phone: " + getPhone();
        return r;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public GridFsObject getProfilePic() {
        return profilePic;
    }

    public void setProfilePic(GridFsObject profilePic) {
        this.profilePic = profilePic;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

//    public String getGender() {
//        return gender;
//    }
//
//    public void setGender(String gender) {
//        this.gender = gender;
//    }
//
//    public String getCity() {
//        return city;
//    }
//
//    public void setCity(String city) {
//        this.city = city;
//    }
//
//    public String getState() {
//        return state;
//    }
//
//    public void setState(String state) {
//        this.state = state;
//    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

//    public Date getSignUpTime() {
//        return signUpTime;
//    }
//
//    public void setSignUpTime(Date signUpTime) {
//        this.signUpTime = signUpTime;
//    }
//
//    public Boolean getOnline() {
//        return online;
//    }
//
//    public void setOnline(Boolean online) {
//        this.online = online;
//    }
//
//    public Boolean getDeleted() {
//        return isDeleted;
//    }
//
//    public void setDeleted(Boolean deleted) {
//        isDeleted = deleted;
//    }
}