package com.example.greenflag;

import android.os.Parcel;
import android.os.Parcelable;
import android.widget.ImageView;

public class User implements Parcelable {
    private String name;
    private String userName;
    private String password;
    //private ImageView picture;
    private String age;
    private String birthday;
    private String country;
    private String gender;
    private String postal;

    public User() {

    }

    protected User(Parcel in) {
        name = in.readString();
        userName = in.readString();
        password = in.readString();
        age = in.readString();
        birthday = in.readString();
        country = in.readString();
        gender = in.readString();
        postal = in.readString();
    }

    public static final Creator<User> CREATOR = new Creator<User>() {
        @Override
        public User createFromParcel(Parcel in) {
            return new User(in);
        }

        @Override
        public User[] newArray(int size) {
            return new User[size];
        }
    };

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                ", birthday='" + birthday + '\'' +
                ", country='" + country + '\'' +
                ", gender='" + gender + '\'' +
                ", postal='" + postal + '\'' +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeString(userName);
        dest.writeString(password);
        dest.writeString(age);
        dest.writeString(birthday);
        dest.writeString(country);
        dest.writeString(gender);
        dest.writeString(postal);
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPostal() {
        return postal;
    }

    public void setPostal(String postal) {
        this.postal = postal;
    }
}
