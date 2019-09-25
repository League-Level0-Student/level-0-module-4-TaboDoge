package _07_sleepy_head;
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

import javax.swing.JOptionPane;


public class SleepyHead {


    public static void main(String[] args) {
        
        boolean isWeekday;
		boolean isVacation;
        int isweekday = 0;
        /* You MUST use the above boolean variables in your code */
        
        
        int isvacation = JOptionPane.showConfirmDialog(null, "Is it a Vacation?", "Sleepy head", JOptionPane.YES_NO_OPTION);
        System.out.println(isvacation);
        isweekday = JOptionPane.showConfirmDialog(null, "Is it a weekday?", "Sleepy head", JOptionPane.YES_NO_OPTION);
        if (isvacation == 1) {
        	JOptionPane.showMessageDialog(null, "Sleep in");
        	isVacation = true;
        }
         if (isweekday == 0) {
        	JOptionPane.showMessageDialog(null, "Wake up at 7:00");
        }
         if (isweekday == 1) {
        	JOptionPane.showMessageDialog(null, "Sleep in until 10:00");
        }
        /*
         * 
         * Ask the user for these values using a confirm dialog like the one below
         * JOptionPane.showConfirmDialog(null, "Is it a weekday?", "Sleepy Head", JOptionPane.YES_NO_OPTION);
         */


        /*
         * Print “sleep in�? if it is a vacation or a weekend. If it’s a weekday,
         * print “get up lazybones!�? If it is a weekday, and we are on vacation,
         * print “sleep in�?.
         */
    }
}
