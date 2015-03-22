package com.matoski.appopslauncher;


import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;

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


    private void startAppOpsVariantASOP() {

        try {
            Intent intent = new Intent();
            intent.setClassName("com.android.settings", "com.android.settings.SubSettings");
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

    protected void defaultStart() {
        startAppOpsVariantOne();

        if (!success) {
            startAppOpsVariantTwo();
        }

        if (!success) {
            startAppOpsVariantThree();
        }

    }

    @Override
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);

        Log.d("AppOps", String.format("Manufacturer: %s, Board: %s, Brand: %s, Type: %s, Model: %s", Build.MANUFACTURER, Build.BOARD, Build.BRAND, Build.TYPE, Build.MODEL));

        switch (Build.VERSION.SDK_INT) {

            case Build.VERSION_CODES.JELLY_BEAN:
                break;

            case Build.VERSION_CODES.KITKAT:
                break;

            case Build.VERSION_CODES.LOLLIPOP:
                break;

            default:
                break;
        }

        switch (Build.MANUFACTURER) {
            case "OnePlus":
                startAppOpsVariantTwo();
                break;

            case "samsung":
                switch (Build.MODEL) {
                    case "GT-I9500":
                    case "GT-I9505":
                        startAppOpsVariantThree();
                        break;
                    default:
                        defaultStart();
                        break;
                }
                break;
            default:
                defaultStart();
                break;
        }

        finish();

    }

}
