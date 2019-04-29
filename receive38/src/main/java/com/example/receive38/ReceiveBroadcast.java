package com.example.receive38;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class ReceiveBroadcast extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        // TODO: This method is called when the BroadcastReceiver is receiving
        // an Intent broadcast.
        Toast.makeText(context, "A broadcast has been received by this app!", Toast.LENGTH_LONG).show();
        // throw new UnsupportedOperationException("Not yet implemented");  // boilerplate
    }
}
