package com.google.firebase.messaging;

import com.google.android.gms.tasks.OnSuccessListener;

/* compiled from: com.google.firebase:firebase-messaging@@20.2.0 */
final /* synthetic */ class p implements OnSuccessListener {

    /* renamed from: a  reason: collision with root package name */
    private final FirebaseMessaging f11430a;

    p(FirebaseMessaging firebaseMessaging) {
        this.f11430a = firebaseMessaging;
    }

    public final void onSuccess(Object obj) {
        d dVar = (d) obj;
        if (this.f11430a.a()) {
            dVar.d();
        }
    }
}
