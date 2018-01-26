package com.letv.cases.leui;


import android.os.RemoteException;
import android.support.test.uiautomator.UiObjectNotFoundException;

import com.letv.common.CaseName;
import com.letv.common.LetvTestCase;

import org.junit.Test;
public class DesktopSwitchDomain extends LetvTestCase{

    @Test
    @CaseName("各个桌面切换")
    public void testDesktopSwitch() throws UiObjectNotFoundException, RemoteException{
        addStep("切换到应用桌面");
        gotoHomeScreen("应用");
        for (int i = 0; i < 1; i++) {
            addStep(".............looper : " + i);
            addStep("在桌面向左滑动15次");
            press_left(15);
            addStep("在桌面向右滑动15次");
            press_right(15);
        }
    }
}