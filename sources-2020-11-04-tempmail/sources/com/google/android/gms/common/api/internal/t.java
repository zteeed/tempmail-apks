package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.internal.base.zap;

final class t extends zap {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ zabe f3006a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    t(zabe zabe, Looper looper) {
        super(looper);
        this.f3006a = zabe;
    }

    public final void handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            ((s) message.obj).b(this.f3006a);
        } else if (i != 2) {
            StringBuilder sb = new StringBuilder(31);
            sb.append("Unknown message id: ");
            sb.append(i);
            Log.w("GACStateManager", sb.toString());
        } else {
            throw ((RuntimeException) message.obj);
        }
    }
}
