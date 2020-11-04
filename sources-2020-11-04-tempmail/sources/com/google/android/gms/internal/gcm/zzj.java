package com.google.android.gms.internal.gcm;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

public class zzj extends Handler {
    public zzj() {
    }

    public final void dispatchMessage(Message message) {
        super.dispatchMessage(message);
    }

    public zzj(Looper looper) {
        super(looper);
    }

    public zzj(Looper looper, Handler.Callback callback) {
        super(looper, callback);
    }
}
