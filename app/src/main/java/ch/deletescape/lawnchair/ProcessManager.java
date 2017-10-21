package ch.deletescape.lawnchair;

import android.os.Build;

/**
 * Created by DavidLi on 2017-10-21.
 */

public class ProcessManager {
    public static void killProcess() {
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.O) {
            android.os.Process.killProcess(android.os.Process.myPid());
        } else {
            LauncherAppState.getInstance().getLauncher().recreate();
        }
    }
}
