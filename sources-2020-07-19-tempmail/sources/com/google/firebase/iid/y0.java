package com.google.firebase.iid;

import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;

/* compiled from: com.google.firebase:firebase-iid@@20.2.0 */
final /* synthetic */ class y0 implements SuccessContinuation {

    /* renamed from: a  reason: collision with root package name */
    private final FirebaseInstanceId f11265a;

    /* renamed from: b  reason: collision with root package name */
    private final String f11266b;

    /* renamed from: c  reason: collision with root package name */
    private final String f11267c;

    /* renamed from: d  reason: collision with root package name */
    private final String f11268d;

    y0(FirebaseInstanceId firebaseInstanceId, String str, String str2, String str3) {
        this.f11265a = firebaseInstanceId;
        this.f11266b = str;
        this.f11267c = str2;
        this.f11268d = str3;
    }

    public final Task then(Object obj) {
        return this.f11265a.h(this.f11266b, this.f11267c, this.f11268d, (String) obj);
    }
}
