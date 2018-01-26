package com.letv.cases.leui;

import android.os.RemoteException;
import android.support.test.uiautomator.By;
import android.support.test.uiautomator.UiObject2;
import android.support.test.uiautomator.UiObjectNotFoundException;

import com.letv.common.AppName;
import com.letv.common.CaseName;
import com.letv.common.IntentConstants;
import com.letv.common.LetvTestCase;
import com.letv.common.PkgName;

import junit.framework.Assert;

import org.junit.Test;

import java.util.regex.Pattern;



public class DesktopLeChildStressDomain extends LetvTestCase {
    int count = 0;

    @Test
    @CaseName("进入儿童桌面播放记录")
    public void testChildDesktopPlayRecording() throws UiObjectNotFoundException, RemoteException {
            addStep("切换到儿童桌面");
            gotoHomeScreen("儿童");
            press_down(1);
            press_back(3);
            try{
                ChildDesktopPlayRecording();
            }
            catch (Exception e){
                try{
                    count++;
                    failCount(count,getIntParams("Loop"),e.getMessage());
                    ChildDesktopPlayRecording();
                }
                catch (RuntimeException re){
                    screenShot();
                    Assert.fail(re.getMessage());
                }
            }
            press_back(4);
    }
    public void ChildDesktopPlayRecording() throws UiObjectNotFoundException, RemoteException {
        addStep("进入儿童桌面播放记录");
        press_down(3);
        UiObject2 item_history = waitForObj(By.clazz("android.widget.FrameLayout").res("com.stv.plugin.kids:id/item_history"));
        check("未进入儿童桌面播放记录",item_history!=null);
        item_history.click();
        item_history.click();
        desktop();
    }

    @Test
    @CaseName("进入儿童桌面搜索")
    public void testChildDesktopSearch() throws UiObjectNotFoundException, RemoteException {
        addStep("切换到儿童桌面");
        gotoHomeScreen("儿童");
        press_down(1);
        press_back(3);
        try{
            ChildDesktopSecarch();
        }
        catch (Exception e){
            try{
                count++;
                failCount(count,getIntParams("Loop"),e.getMessage());
                ChildDesktopSecarch();
            }
            catch (RuntimeException re){
                screenShot();
                Assert.fail(re.getMessage());
            }
        }
        press_back(4);
    }
    public void ChildDesktopSecarch() throws UiObjectNotFoundException, RemoteException {
        addStep("进入儿童桌面搜索");
        press_down(3);
        UiObject2 entrance_5 = waitForObj(By.clazz("android.widget.FrameLayout").res("com.stv.plugin.kids:id/entrance_5"));
        check("未进入儿童桌面搜索",entrance_5!=null);
        entrance_5.click();
        entrance_5.click();
        desktop();
    }

    @Test
    @CaseName("进入儿童桌面儿童TV")
    public void testChildDesktopChildTV() throws UiObjectNotFoundException, RemoteException {
        addStep("切换到儿童桌面");
        gotoHomeScreen("儿童");
        press_down(1);
        press_back(3);
        try{
            ChildDesktopChildTV();
        }
        catch (Exception e){
            try{
                count++;
                failCount(count,getIntParams("Loop"),e.getMessage());
                ChildDesktopChildTV();
            }
            catch (RuntimeException re){
                screenShot();
                Assert.fail(re.getMessage());
            }
        }
        press_back(4);
    }
    public void ChildDesktopChildTV() throws UiObjectNotFoundException, RemoteException {
        addStep("进入儿童桌面儿童TV");
        press_down(3);
        UiObject2 entrance_3 = waitForObj(By.clazz("android.widget.FrameLayout").res("com.stv.plugin.kids:id/entrance_3"));
        check("未进入儿童桌面儿童TV",entrance_3!=null);
        entrance_3.click();
        entrance_3.click();
        desktop();
    }

    @Test
    @CaseName("进入儿童桌面时间控制")
    public void testChildDesktopTimecontrol() throws UiObjectNotFoundException, RemoteException {
        addStep("切换到儿童桌面");
        gotoHomeScreen("儿童");
        press_down(1);
        press_back(3);
        try{
            ChildDesktopTimecontrol();
        }
        catch (Exception e){
            try{
                count++;
                failCount(count,getIntParams("Loop"),e.getMessage());
                ChildDesktopTimecontrol();
            }
            catch (RuntimeException re){
                screenShot();
                Assert.fail(re.getMessage());
            }
        }
        press_back(4);
    }
    public void ChildDesktopTimecontrol() throws UiObjectNotFoundException, RemoteException {
        addStep("进入儿童桌面时间控制");
        press_down(3);
        UiObject2 entrance_2 = waitForObj(By.clazz("android.widget.FrameLayout").res("com.stv.plugin.kids:id/entrance_2"));
        check("未进入儿童桌面时间控制",entrance_2!=null);
        entrance_2.click();
        entrance_2.click();
        desktop();
        press_back(3);
    }
    @Test
    @CaseName("进入儿童桌面海报浏览")
    public void testChildDesktopPoster() throws UiObjectNotFoundException, RemoteException {
        addStep("切换到儿童桌面");
        gotoHomeScreen("儿童");
        press_down(1);
        press_back(3);
        try{
            ChildDesktopDesktopPoster();
        }
        catch (Exception e){
            try{
                count++;
                failCount(count,getIntParams("Loop"),e.getMessage());
                ChildDesktopDesktopPoster();
            }
            catch (RuntimeException re){
                screenShot();
                Assert.fail(re.getMessage());
            }
        }
        press_back(4);
    }
    public void ChildDesktopDesktopPoster() throws UiObjectNotFoundException, RemoteException {
        addStep("进入儿童桌面海报浏览");
        press_down(4);
        for (int i =0;i<5;i++){
            sleepInt(2);

            press_down(1);
            press_right(3);


            press_center(1);
            press_back(2);

            press_left(3);
            UiObject2 desktop1=phone.findObject(By.pkg("com.stv.launcher").text(Pattern.compile("儿童")).selected(true));
            UiObject2 desktop2=phone.findObject(By.pkg("com.stv.launcher").text(Pattern.compile("儿童")).focused(true));
            verify("没有返回到视频桌面", desktop1 != null || desktop2 != null);
        }
    }




    public void desktop()throws UiObjectNotFoundException, RemoteException{
        sleepInt(3);
        press_back(4);
        UiObject2 desktop1=phone.findObject(By.pkg("com.stv.launcher").text(Pattern.compile("儿童")).selected(true));
        UiObject2 desktop2=phone.findObject(By.pkg("com.stv.launcher").text(Pattern.compile("儿童")).focused(true));
        verify("没有返回到视频桌面", desktop1 != null || desktop2 != null);
    }
}


