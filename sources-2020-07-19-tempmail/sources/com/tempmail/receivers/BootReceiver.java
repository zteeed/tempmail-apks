package com.tempmail.receivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.tempmail.utils.m;

public class BootReceiver extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    public static final String f12477a = BootReceiver.class.getSimpleName();

    public void onReceive(Context context, Intent intent) {
        if (intent.getAction().equals("android.intent.action.BOOT_COMPLETED")) {
            m.c(f12477a, "onReceive");
        }
    }
}
