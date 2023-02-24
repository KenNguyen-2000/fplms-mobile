package com.ngkien299.fplms.model;

import java.io.Serializable;

public class ClassModel implements Serializable {
    private String id;
    private String enrollKey;
    private String name;
    private String semesterCode;
    private String subjectId;
    private int cycleDuration;

    public ClassModel() {
    }

    public ClassModel(String id, String enrollKey, String name, String semesterCode, String subjectId, int cycleDuration) {
        this.id = id;
        this.enrollKey = enrollKey;
        this.name = name;
        this.semesterCode = semesterCode;
        this.subjectId = subjectId;
        this.cycleDuration = cycleDuration;
    }

    public String getId() {
        return id;
    }


    public String getEnrollKey() {
        return enrollKey;
    }

    public void setEnrollKey(String enrollKey) {
        this.enrollKey = enrollKey;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSemesterCode() {
        return semesterCode;
    }

    public void setSemesterCode(String semesterCode) {
        this.semesterCode = semesterCode;
    }

    public String getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(String subjectId) {
        this.subjectId = subjectId;
    }

    public int getCycleDuration() {
        return cycleDuration;
    }

    public void setCycleDuration(int cycleDuration) {
        this.cycleDuration = cycleDuration;
    }
}
