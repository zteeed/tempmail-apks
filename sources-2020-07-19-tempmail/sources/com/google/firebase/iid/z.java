package com.google.firebase.iid;

import android.os.Looper;
import android.os.Message;
import com.google.android.gms.internal.firebase_messaging.zze;

/* compiled from: com.google.firebase:firebase-iid@@20.2.0 */
final class z extends zze {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ w f11269a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    z(w wVar, Looper looper) {
        super(looper);
        this.f11269a = wVar;
    }

    public final void handleMessage(Message message) {
        this.f11269a.d(message);
    }
}
