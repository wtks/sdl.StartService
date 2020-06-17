package jp.ac.titech.itpro.sdl.startservice;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class Service3BroadcastReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        String message = intent.getStringExtra(Service3.EXTRA_RESULT);
        Toast.makeText(context, "Service3: " + message, Toast.LENGTH_LONG).show();
    }
}
