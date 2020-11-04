package com.google.firebase.iid;

import android.os.Handler;
import android.os.Message;

/* compiled from: com.google.firebase:firebase-iid@@20.2.0 */
final /* synthetic */ class i implements Handler.Callback {

    /* renamed from: b  reason: collision with root package name */
    private final f f11203b;

    i(f fVar) {
        this.f11203b = fVar;
    }

    public final boolean handleMessage(Message message) {
        return this.f11203b.d(message);
    }
}
