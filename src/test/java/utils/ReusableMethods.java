package utils;

import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.touch.offset.PointOption;

import static io.appium.java_client.touch.offset.PointOption.point;


public class ReusableMethods extends Hooks {

    AndroidTouchAction action;

    public void waitFor(int sec) {
        try {
            Thread.sleep(sec * 1000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void tabOnThePoints(int startX, int startY) {
        action = new AndroidTouchAction(androidDriver);
        action.tap(PointOption.point(startX, startY)).perform();
    }

    public void scroll(int fromX, int fromY, int toX, int toY) {
        action = new AndroidTouchAction(androidDriver);
        action.longPress(point(fromX, fromY)).moveTo(point(toX, toY)).release().perform();
    }
}
