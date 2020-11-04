package com.google.firebase.iid;

import com.google.android.gms.tasks.Task;

/* compiled from: com.google.firebase:firebase-iid@@20.2.0 */
final /* synthetic */ class z0 implements x {

    /* renamed from: a  reason: collision with root package name */
    private final FirebaseInstanceId f11270a;

    /* renamed from: b  reason: collision with root package name */
    private final String f11271b;

    /* renamed from: c  reason: collision with root package name */
    private final String f11272c;

    /* renamed from: d  reason: collision with root package name */
    private final String f11273d;

    z0(FirebaseInstanceId firebaseInstanceId, String str, String str2, String str3) {
        this.f11270a = firebaseInstanceId;
        this.f11271b = str;
        this.f11272c = str2;
        this.f11273d = str3;
    }

    public final Task a() {
        return this.f11270a.g(this.f11271b, this.f11272c, this.f11273d);
    }
}
