/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package csbd_ex6;

import java.util.List;

/**
 *
 * @author svish
 */
public class Csbd_ex6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Student std1 = new Student(1, "Lyon", 4.0);
        Student std2 = new Student(2, "Time", 3.5);
        //Insert
//        StudentTable.insertStudent(std1);
//        StudentTable.insertStudent(std2);
        //Update
        StudentTable.updateStudent(std1);
        StudentTable.updateStudent(std2);
        //Delete
//        StudentTable.removeStudent(std1);
//        StudentTable.removeStudent(std2);
        //ShowRecord
        List<Student> stdList = StudentTable.showAllStudent();
        printAllStudent(stdList);
    }
    public static void printAllStudent(List<Student> studentList) {
        for (Student std : studentList) {
            System.out.println(std.getId() + " " + std.getName() + " " + std.getGPA());
        }
    }
    
}
