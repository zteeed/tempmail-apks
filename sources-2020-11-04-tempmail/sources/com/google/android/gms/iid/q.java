package com.google.android.gms.iid;

import android.os.Handler;
import android.os.Message;

final /* synthetic */ class q implements Handler.Callback {

    /* renamed from: b  reason: collision with root package name */
    private final p f3471b;

    q(p pVar) {
        this.f3471b = pVar;
    }

    public final boolean handleMessage(Message message) {
        return this.f3471b.b(message);
    }
}
