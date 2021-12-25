package com.example.android.myguide;

public class Word {
    private String mitem_name;
    private String maddress;
    private String mmapLocation;
    private int mimageResourceId;

    public Word(String item_name,String address,int imageResourceId,String mapLocation)
    {
        mitem_name = item_name;
        maddress = address;
        mimageResourceId = imageResourceId;
        mmapLocation = mapLocation;
    }
    public Word(String item_name,String address,int imageResourceId)
    {
        mitem_name = item_name;
        maddress = address;
        mimageResourceId = imageResourceId;
    }
    public String getItemName()
    {
        return mitem_name;
    }
    public String getAddress()
    {
        return maddress;
    }
    public int getImageResource()
    {
        return mimageResourceId;
    }
    public String getMapLocation()
    {
        return mmapLocation;
    }
}
