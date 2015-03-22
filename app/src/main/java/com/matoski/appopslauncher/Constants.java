package com.matoski.appopslauncher;

/**
 * Default constants
 */
public class Constants {


    public static String COMMAND_JELLY_BEAN = "am start -n com.android.settings/com.android.settings";
    public static String COMMAND_KIT_KAT = "am start -n com.android.settings/com.android.settings.SubSettings -e :android:show_fragment \"com.android.settings.applications.AppOpsSummary\"";
    public static String COMMAND_LOLLIPOP = COMMAND_KIT_KAT;
}
