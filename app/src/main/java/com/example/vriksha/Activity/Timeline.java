package com.example.vriksha.Activity;


import androidx.recyclerview.widget.RecyclerView;

public class Timeline {

    private String Name;
    private String Address;
    private String Message;
    private int Profile_Image;
    private int Main_Image;

    public Timeline() {

    }

    public Timeline(String name, String address, String message, int profile_image, int main_image) {
        Name = name;
        Address = address;
        Message = message;
        Profile_Image = profile_image;
        Main_Image = main_image;
    }

    //Getter

    public String getName() {
        return Name;
    }

    public String getAddress() {
        return Address;
    }
    public String getMessage()
    {
        return Message;
    }
    public int getProfile_Image()
    {
        return Profile_Image;
    }
    public int getMain_Image()
    {
        return  Main_Image;
    }


    //Setter


    public void setName(String name) {
        Name = name;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public void setMessage(String message) {
        Message = message;
    }

    public void setProfile_Image(int profile_Image) {
        Profile_Image = profile_Image;
    }

    public void setMain_Image(int main_Image) {
        Main_Image = main_Image;
    }
}
