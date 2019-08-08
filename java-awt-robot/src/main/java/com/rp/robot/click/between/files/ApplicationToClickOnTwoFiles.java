/**
 * This class will raise keyboard and mouse events and keep writing on the
 * files opened before running this file.
 * 
 * ...................:: Prerequisite :: .....................................
 * ...........................................................................
 * ... 1. IDE : RAD ..........................................................
 * ... 2. Perspective : Java EE (Reset the perspective before use.) ..........
 * ... 3. Files has to be opened : ApplicationToClickOnTwoFiles, dumbfile1.txt
 * & dumbfile2.txt open the files in the same order given here ...............
 * 
 * Note : This application is tested only in RAD IDE. So if you are using other
 * IDE you must have to set the cordinates based on your IDE view. It's
 * recommended to reset the perspective of view which ever you are using to
 * make is more robust. If you are using RAD IDE only than use "Java EE"
 * perspective and it is must to reset the perspective , as the pixels are set
 * in default perspective view otherwise will exibits some funny behaviour.
 */

package com.rp.robot.click.between.files;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;


public class ApplicationToClickOnTwoFiles {

    public static void main(final String[] args) {

        ApplicationToClickOnTwoFiles myApp = new ApplicationToClickOnTwoFiles();

        System.out.println("Application active....");
        myApp.loopTabEvent();
        System.out.println("Application terminated....");
    }

    /*
     * This method will execute the event in loop
     */
    private void loopTabEvent() {

        Robot robot = null;

        try {
            robot = new Robot();
        } catch (AWTException e) {
            e.printStackTrace();
        }

        /*
         * this counter will be used to determine when to clean the file
         */
        int counter = 50;

        while (true) {

            boolean contentResetFlag = false;
            if (counter == 0) {
                contentResetFlag = true;
            }
            /*
             * These are cordinates for default perspective view Note : before
             * execution restet the perspective
             */
            // write data to first files
            this.writePredefinedData(robot, contentResetFlag, 630, 105);

            // Write data to second file
            this.writePredefinedData(robot, contentResetFlag, 750, 105);

            counter--;
        }
    }

    /*
     * Write data to file
     */
    private void writePredefinedData(final Robot robot, boolean contentResetFlag, final int xCordinate, final int yCordinate) {

        // make the file in focus to write by clicking on that
        // robot.mouseMove(550, 105);
        robot.mouseMove(xCordinate, yCordinate);
        this.sleepMe(1000);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        this.sleepMe(1000);

        // clearing file content if is full or more than 150 lines
        if (contentResetFlag) {
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_A);
            robot.keyRelease(KeyEvent.VK_CONTROL);
            robot.keyRelease(KeyEvent.VK_A);
            this.sleepMe(100);
            robot.keyPress(KeyEvent.VK_DELETE);
            robot.keyRelease(KeyEvent.VK_DELETE);
            this.sleepMe(150);
        }

        // Send key events
        robot.keyPress(KeyEvent.VK_H);
        robot.keyRelease(KeyEvent.VK_H);
        this.sleepMe(100);
        robot.keyPress(KeyEvent.VK_E);
        robot.keyRelease(KeyEvent.VK_E);
        this.sleepMe(100);
        robot.keyPress(KeyEvent.VK_L);
        robot.keyRelease(KeyEvent.VK_L);
        this.sleepMe(500);
        robot.keyPress(KeyEvent.VK_L);
        robot.keyRelease(KeyEvent.VK_L);
        this.sleepMe(100);
        robot.keyPress(KeyEvent.VK_O);
        robot.keyRelease(KeyEvent.VK_O);
        this.sleepMe(100);
        robot.keyPress(KeyEvent.VK_SPACE);
        robot.keyRelease(KeyEvent.VK_SPACE);

        this.sleepMe(1000);

        robot.keyPress(KeyEvent.VK_B);
        robot.keyRelease(KeyEvent.VK_B);
        this.sleepMe(100);
        robot.keyPress(KeyEvent.VK_U);
        robot.keyRelease(KeyEvent.VK_U);
        this.sleepMe(100);
        robot.keyPress(KeyEvent.VK_D);
        robot.keyRelease(KeyEvent.VK_D);
        this.sleepMe(500);
        robot.keyPress(KeyEvent.VK_D);
        robot.keyRelease(KeyEvent.VK_D);
        this.sleepMe(100);
        robot.keyPress(KeyEvent.VK_Y);
        robot.keyRelease(KeyEvent.VK_Y);
        this.sleepMe(100);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        this.sleepMe(100);
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_S);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_S);

        this.sleepMe(1000);


    }

    /*
     * Makes the current thread to sleep for given amount of time.
     */
    private void sleepMe(final long miliSecs) {
        try {
            Thread.sleep(miliSecs);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}