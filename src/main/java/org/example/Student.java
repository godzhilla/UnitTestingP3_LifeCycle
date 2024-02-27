package org.example;

public class Student {
    String name = "Mark Lee";
    int semester = 4;
    boolean isActive = true;

    public boolean isDoingMBKM (int semester, boolean isActive) {
        if(semester >= 6 && isActive) {
            return true;
        }else {
            return false;
        }
    }
}
