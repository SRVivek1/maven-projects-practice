/**
 * This application can be used to take screenshot of desktop
 */

package com.rp.take.screenshot.of.desktop;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import javax.imageio.ImageIO;

public class FullScreenCaptureApplication {

    Robot robot = null;

    Dimension screenSize = null;

    String filePath = "z:\\ScrenShots\\FullScreenshot";

    int fileNameCounter = 1;

    // String fileName = "FullScreenshot";

    String format = "jpg";

    public FullScreenCaptureApplication() {
        this(Toolkit.getDefaultToolkit().getScreenSize());
    }

    public FullScreenCaptureApplication(Dimension dimension) {
        try {
            this.robot = new Robot();
        } catch (AWTException e) {
            e.printStackTrace();
        }
        this.setScreenSize(dimension);
    }

    public static void main(String[] args) {

        // By default it will take screenshot of full window
    	FullScreenCaptureApplication application = new FullScreenCaptureApplication();

        Scanner scanner = new Scanner(System.in);


        while (true) {
            System.out.println("Enter negative value to exit. eg. -1");
            System.out.print("Enter elapsed time(Seconds) to take SS after that : ");
            int secondsToWait = scanner.nextInt();

            if (secondsToWait < 0) {
                System.out.println("Shutting down application.");
                scanner.close();
                System.exit(0);
            } else if (secondsToWait < 5) {
                // making min 10 sec to wait
                secondsToWait = 6;
            }

            System.out.println("App in sleep mode for " + secondsToWait + " seconds.");
            // making app to sleep

            try {
                Thread.sleep(((secondsToWait) * 1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            application.mimizeWindows();
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            BufferedImage screenFullImage = application.takeScreenShot(application.getScreenSize());
            String fileLocation = application.saveScreenShot(screenFullImage);
            boolean success = application.openFileWithMSPaint(fileLocation);
            if (success) {
                System.out.println("Job " + application.fileNameCounter + " executed Succssfully.");
            } else {
                System.out.println("Some issue occured please check.");
            }

        }
    }

    /**
     * Mimize the current running window
     */
    private void mimizeWindows() {
        this.robot.keyPress(KeyEvent.VK_ALT);
        this.robot.keyPress(KeyEvent.VK_SPACE);

        this.robot.keyRelease(KeyEvent.VK_ALT);
        this.robot.keyRelease(KeyEvent.VK_SPACE);

        this.robot.keyPress(KeyEvent.VK_N);
        this.robot.keyRelease(KeyEvent.VK_N);
    }

    /**
     * this method will capture the full screen window
     */
    private BufferedImage takeScreenShot(Dimension screenSize) {
        Rectangle screenRect = new Rectangle(screenSize);
        return this.robot.createScreenCapture(screenRect);

    }

    /**
     * save the screenshot
     */
    private String saveScreenShot(BufferedImage screenFullImage) {

        final String fileLocation = this.filePath + this.fileNameCounter + "." + this.format;

        System.out.println("Filepath : " + fileLocation);

        File file = new File(fileLocation);
        try {
            ImageIO.write(screenFullImage, this.format, file);
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("A full screenshot saved!");
        this.fileNameCounter++;
        return fileLocation;

    }

    /**
     * Open the saved SS with microsoft paint
     */
    private boolean openFileWithMSPaint(String fileLocation) {

        String application = "mspaint";
        String command = application + " " + fileLocation;
        Runtime runtime = Runtime.getRuntime();
        try {
            runtime.exec(command);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return Boolean.TRUE;
    }

    /**
     * @return the screenSize
     */
    private Dimension getScreenSize() {
        return this.screenSize;
    }

    /**
     * @param screenSize
     *            the screenSize to set
     */
    private void setScreenSize(Dimension screenSize) {
        this.screenSize = screenSize;
    }
}
