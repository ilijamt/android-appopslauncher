package com.matoski.appopslauncher;

import android.app.Activity;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;

import eu.chainfire.libsuperuser.Shell;

public class MainActivityRoot extends Activity {

    private class RunTask extends AsyncTask<Void, Void, Void> {

        private Boolean suAvailable = false;

        @Override
        protected Void doInBackground(Void... params) {

            suAvailable = Shell.SU.available();

            if (suAvailable) {

                switch (Build.VERSION.SDK_INT) {

                    case Build.VERSION_CODES.KITKAT:
                        Shell.SU.run(Constants.COMMAND_KIT_KAT);
                        break;

                    case Build.VERSION_CODES.LOLLIPOP:
                        Shell.SU.run(Constants.COMMAND_LOLLIPOP);
                        break;

                    default:
                        break;
                }
            }

            return null;
        }
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        (new RunTask()).execute();
        finish();
    }

}