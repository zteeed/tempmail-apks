package com.google.firebase.iid;

import android.os.Looper;
import android.os.Message;
import com.google.android.gms.internal.firebase_messaging.zze;

/* compiled from: com.google.firebase:firebase-iid@@20.2.1 */
final class z extends zze {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ w f11819a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    z(w wVar, Looper looper) {
        super(looper);
        this.f11819a = wVar;
    }

    public final void handleMessage(Message message) {
        this.f11819a.d(message);
    }
}
