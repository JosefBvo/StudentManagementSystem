/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.studentmanagementsystem_1;

/**
 *
 */
public class Subject {
    private String SubjectName;
    //Constructor
    public Subject(String SubjectName) {
        this.SubjectName = SubjectName;
    }
    //Accessor
    public String getSubjectName() {
        return SubjectName;
    }
    //Ensures a string is returned
    @Override
    public String toString() {
        return SubjectName;
    }
}


