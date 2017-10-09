package com.example.hp.criminalintent;


import java.util.Date;
import java.util.UUID;

public class Crime {
    private UUID mId;
    private String title;

    public String getSuspect() {
        return mSuspect;
    }

    public void setSuspect(String suspect) {
        mSuspect = suspect;
    }

    private String mSuspect;

    public Date getDate() {
        return mDate;
    }

    public void setDate(Date date) {
        mDate = date;
    }

    public boolean isSolved() {
        return mSolved;
    }

    public void setSolved(boolean solved) {
        mSolved = solved;
    }

    private Date mDate;
    private boolean mSolved;

    public Crime()
    {
        this(UUID.randomUUID());
    }
    public Crime(UUID id) {
        mId = id;
        mDate = new Date();
    }
    public String getPhotoFilename() {
        return "IMG_" + getId().toString() + ".jpg";
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public UUID getId()
    {
        return mId;
    }

    public void setId(UUID id)
    {
        mId = id;
    }


}
