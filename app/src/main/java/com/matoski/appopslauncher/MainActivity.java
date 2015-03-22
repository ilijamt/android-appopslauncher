package com.matoski.appopslauncher;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends Activity {

    private Boolean success = false;

    private void startAppOpsVariantOne() {

        try {
            Intent intent = new Intent();
            intent.setAction("android.settings.APP_OPS_SETTINGS");
            intent.addFlags(Intent.FLAG_RECEIVER_FOREGROUND);
            intent.addFlags(Intent.FLAG_ACTIVITY_EXCLUDE_FROM_RECENTS);
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
            startActivity(intent);
            success = true;
        } catch (Exception e) {
            success = false;
            e.printStackTrace();
        }
    }


    private void startAppOpsVariantTwo() {

        try {

            Intent intent = new Intent();
            intent.setClassName("com.android.settings", "com.android.settings.Settings$AppOpsSummaryActivity");
            intent.addFlags(Intent.FLAG_RECEIVER_FOREGROUND);
            intent.addFlags(Intent.FLAG_ACTIVITY_EXCLUDE_FROM_RECENTS);
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
            startActivity(intent);

            success = true;
        } catch (Exception e) {
            success = false;
            e.printStackTrace();
        }
    }


    private void startAppOpsVariantThree() {
        try {
            Intent intent = new Intent();
            intent.setClassName("com.android.settings", "com.android.settings.Settings");
            intent.setAction("android.intent.action.MAIN");
            intent.addCategory("android.intent.category.DEFAULT");
            intent.addFlags(Intent.FLAG_RECEIVER_FOREGROUND);
            intent.addFlags(Intent.FLAG_ACTIVITY_EXCLUDE_FROM_RECENTS);
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
            intent.putExtra(":android:show_fragment", "com.android.settings.applications.AppOpsSummary");
            startActivity(intent);
            success = true;
        } catch (Exception e) {
            success = false;
            e.printStackTrace();
        }
    }


    @Override
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);

        startAppOpsVariantOne();

        if (!success) {
            startAppOpsVariantTwo();
        }

        if (!success) {
            startAppOpsVariantThree();
        }

        finish();
    }

}
