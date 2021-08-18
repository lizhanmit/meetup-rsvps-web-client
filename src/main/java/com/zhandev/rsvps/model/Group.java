package com.zhandev.rsvps.model;

import java.util.List;

public class Group {

    private Long groupId;
    private String group_Name;
    private String groupCity;
    private String groupState;
    private String groupCountry;
    private Double groupLon;
    private Double groupLat;
    private String groupUrlName;
    private List<GroupTopic> groupTopics = null;

    public Long getGroupId() {
        return groupId;
    }

    public void setGroupId(Long groupId) {
        this.groupId = groupId;
    }

    public String getGroup_Name() {
        return group_Name;
    }

    public void setGroup_Name(String group_Name) {
        this.group_Name = group_Name;
    }

    public String getGroupCity() {
        return groupCity;
    }

    public void setGroupCity(String groupCity) {
        this.groupCity = groupCity;
    }

    public String getGroupState() {
        return groupState;
    }

    public void setGroupState(String groupState) {
        this.groupState = groupState;
    }

    public String getGroupCountry() {
        return groupCountry;
    }

    public void setGroupCountry(String groupCountry) {
        this.groupCountry = groupCountry;
    }

    public Double getGroupLon() {
        return groupLon;
    }

    public void setGroupLon(Double groupLon) {
        this.groupLon = groupLon;
    }

    public Double getGroupLat() {
        return groupLat;
    }

    public void setGroupLat(Double groupLat) {
        this.groupLat = groupLat;
    }

    public String getGroupUrlName() {
        return groupUrlName;
    }

    public void setGroupUrlName(String groupUrlName) {
        this.groupUrlName = groupUrlName;
    }

    public List<GroupTopic> getGroupTopics() {
        return groupTopics;
    }

    public void setGroupTopics(List<GroupTopic> groupTopics) {
        this.groupTopics = groupTopics;
    }
}
