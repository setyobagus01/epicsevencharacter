package com.gabut.projection.myfirstapp;

import android.os.Parcel;
import android.os.Parcelable;

public class Character implements Parcelable {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }

    private String name;
    private String detail;
    private int photo;

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public String getSkilldesc() {
        return skilldesc;
    }

    public void setSkilldesc(String skilldesc) {
        this.skilldesc = skilldesc;
    }

    public int getSkillpict() {
        return skillpict;
    }

    public void setSkillpict(int skillpict) {
        this.skillpict = skillpict;
    }

    private String skill;
    private String skilldesc;
    private int skillpict;
    private String skillb;

    public String getSkillb() {
        return skillb;
    }

    public void setSkillb(String skillb) {
        this.skillb = skillb;
    }

    public String getSkillc() {
        return skillc;
    }

    public void setSkillc(String skillc) {
        this.skillc = skillc;
    }

    public String getSkilldescb() {
        return skilldescb;
    }

    public void setSkilldescb(String skilldescb) {
        this.skilldescb = skilldescb;
    }

    public String getSkilldescc() {
        return skilldescc;
    }

    public void setSkilldescc(String skilldescc) {
        this.skilldescc = skilldescc;
    }

    public int getSkillpictb() {
        return skillpictb;
    }

    public void setSkillpictb(int skillpictb) {
        this.skillpictb = skillpictb;
    }

    public int getSkillpictc() {
        return skillpictc;
    }

    public void setSkillpictc(int skillpictc) {
        this.skillpictc = skillpictc;
    }

    private String skillc;
    private String skilldescb;
    private String skilldescc;
    private int skillpictb;
    private int skillpictc;

    public Character() {
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.name);
        dest.writeString(this.detail);
        dest.writeInt(this.photo);
        dest.writeString(this.skill);
        dest.writeString(this.skilldesc);
        dest.writeInt(this.skillpict);
        dest.writeString(this.skillb);
        dest.writeString(this.skillc);
        dest.writeString(this.skilldescb);
        dest.writeString(this.skilldescc);
        dest.writeInt(this.skillpictb);
        dest.writeInt(this.skillpictc);
    }

    protected Character(Parcel in) {
        this.name = in.readString();
        this.detail = in.readString();
        this.photo = in.readInt();
        this.skill = in.readString();
        this.skilldesc = in.readString();
        this.skillpict = in.readInt();
        this.skillb = in.readString();
        this.skillc = in.readString();
        this.skilldescb = in.readString();
        this.skilldescc = in.readString();
        this.skillpictb = in.readInt();
        this.skillpictc = in.readInt();
    }

    public static final Creator<Character> CREATOR = new Creator<Character>() {
        @Override
        public Character createFromParcel(Parcel source) {
            return new Character(source);
        }

        @Override
        public Character[] newArray(int size) {
            return new Character[size];
        }
    };
}
