package com.google.firebase.iid;

import com.google.firebase.f.a;
import com.google.firebase.f.b;
import com.google.firebase.iid.FirebaseInstanceId;

/* compiled from: com.google.firebase:firebase-iid@@20.2.0 */
final /* synthetic */ class a1 implements b {

    /* renamed from: a  reason: collision with root package name */
    private final FirebaseInstanceId.a f11158a;

    a1(FirebaseInstanceId.a aVar) {
        this.f11158a = aVar;
    }

    public final void a(a aVar) {
        FirebaseInstanceId.a aVar2 = this.f11158a;
        synchronized (aVar2) {
            if (aVar2.a()) {
                FirebaseInstanceId.this.C();
            }
        }
    }
}
