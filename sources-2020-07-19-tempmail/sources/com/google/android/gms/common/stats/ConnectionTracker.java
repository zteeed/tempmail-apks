package com.google.android.gms.common.stats;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.util.ClientLibraryUtils;
import java.util.Collections;
import java.util.List;

@KeepForSdk
public class ConnectionTracker {

    /* renamed from: a  reason: collision with root package name */
    private static final Object f3106a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private static volatile ConnectionTracker f3107b;

    private ConnectionTracker() {
        List list = Collections.EMPTY_LIST;
    }

    @KeepForSdk
    public static ConnectionTracker b() {
        if (f3107b == null) {
            synchronized (f3106a) {
                if (f3107b == null) {
                    f3107b = new ConnectionTracker();
                }
            }
        }
        return f3107b;
    }

    @KeepForSdk
    public boolean a(Context context, Intent intent, ServiceConnection serviceConnection, int i) {
        return d(context, context.getClass().getName(), intent, serviceConnection, i);
    }

    @SuppressLint({"UntrackedBindService"})
    @KeepForSdk
    public void c(Context context, ServiceConnection serviceConnection) {
        context.unbindService(serviceConnection);
    }

    public final boolean d(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i) {
        boolean z;
        ComponentName component = intent.getComponent();
        if (component == null) {
            z = false;
        } else {
            z = ClientLibraryUtils.d(context, component.getPackageName());
        }
        if (!z) {
            return context.bindService(intent, serviceConnection, i);
        }
        Log.w("ConnectionTracker", "Attempted to bind to a service in a STOPPED package.");
        return false;
    }
}
