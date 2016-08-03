/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.silpelogic;

/**
 *
 * @author Mahesh
 */
public class program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double passMark=32;
        double FullMarks = 500;
        double sec = 45, eng = 55, nep = 65, cm = 55, sc = 60, op = 75;

        System.out.println("========================");
        System.out.println("      Marks Sheet       ");
        System.out.println("========================");
        System.out.println("Subject\t\tmarks");
        System.out.println("Secince\t\t" + sec);
        System.out.println("English\t\t" + eng);
        System.out.println("Nepali\t\t" + nep);
        System.out.println("Math\t\t" + cm);
        System.out.println("Social\t\t" + sc);
        System.out.println("Opt.Math\t" + op);
        double total = (sec + eng + nep + cm + sc + op);
        System.out.println("Total:" + total);

        if (sec <passMark || eng <passMark || nep <passMark || cm <passMark || sc <passMark || op <passMark) {
            
        System.out.println("Grade:Fail");
    }
        else{
            double percentage = (total / FullMarks) * 100;

            String grade = "";
            if (percentage >= 80) {
                grade = "Distinction";

            } else if (percentage < 80 && percentage >= 60) {
                grade = "first Division";
            } else if (percentage < 60 && percentage >= 45) {
                grade = "Second Division";
            } else if (percentage < 45 && percentage >= 32) {
                grade = "Third Division";
            }
            
            System.out.println("Percentage:" + percentage);
            System.out.println("Grade:" + grade);
        }
        }
    }

