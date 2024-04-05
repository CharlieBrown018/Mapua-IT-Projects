package com.journfitness.DAO;

import com.journfitness.enums.SizeUnit;
import com.journfitness.enums.Gender;

import java.util.Date;


/* DataBase Object */
public class Profile {

    private long id;
    private Date mCreationDate = null;
    private Date mBirthday = null;
    private String mName = "";
    private int mSize = 0;
    private int mGender = Gender.MALE;
    private String mPhoto = "";
    private SizeUnit mSizeUnit = SizeUnit.CM;

    public Profile(long mId, Date mDate, String pName, int pSize, Date pBirthday, String pPhoto, int pGender) {
        //super();
        this.id = mId;
        this.mCreationDate = mDate;
        this.mBirthday = pBirthday;
        this.mSize = pSize;
        this.mName = pName;
        this.mPhoto = pPhoto;
        this.mGender = pGender;
    }

    public Profile(String pName, int pSize, Date pBirthday, int pGender) {
        //super();
        this.mBirthday = pBirthday;
        this.mSize = pSize;
        this.mName = pName;
        this.mGender = pGender;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getCreationDate() {
        return mCreationDate;
    }

    public Date getBirthday() {
        return mBirthday;
    }

    public void setBirthday(Date mBirthday) {
        this.mBirthday = mBirthday;
    }

    /**
     * @return size in centimeter
     * @deprecated
     */
    public int getSize() {
        return mSize;
    } /*OBSOLETE, Only used for migration*/

    public String getName() {
        return mName;
    }

    public void setName(String pName) {
        this.mName = pName;
    }

    public String getPhoto() {
        return mPhoto;
    }

    public void setPhoto(String pPhoto) {
        this.mPhoto = pPhoto;
    }

    public int getGender() {
        return mGender;
    }

    public void setGender(int gender) {
        mGender = gender;
    }

    public boolean equals(Profile p) {
        boolean birthdayEquals = false;
        if (p == null) return false;
        if (mBirthday == null && p.mBirthday == null) birthdayEquals = true;
        else if (mBirthday == null && p.getBirthday() != null) birthdayEquals = false;
        else if (mBirthday != null && p.getBirthday() == null) birthdayEquals = false;
        else if (!p.mBirthday.equals(mBirthday)) birthdayEquals = false;

        return birthdayEquals && p.mName.equals(mName) && p.mGender == mGender && p.mPhoto.equals(mPhoto);
    }
}
