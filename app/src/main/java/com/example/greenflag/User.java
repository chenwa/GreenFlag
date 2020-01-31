package com.example.greenflag;

import android.os.Parcel;
import android.os.Parcelable;
import android.widget.ImageView;

public class User implements Parcelable {
    private String name;
    private String userName;
    private String password;
    private ImageView picture;
    private int age;
    private String birthday;
    private String country;
    private String gender;
    private String postal;


    protected User(Parcel in) {
        name = in.readString();
        userName = in.readString();
        password = in.readString();
        age = in.readInt();
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
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeString(userName);
        dest.writeString(password);
        dest.writeInt(age);
        dest.writeString(birthday);
        dest.writeString(country);
        dest.writeString(gender);
        dest.writeString(postal);
    }
}
