package com.google.firebase.iid;

import com.google.android.gms.tasks.Task;

/* compiled from: com.google.firebase:firebase-iid@@20.2.1 */
final /* synthetic */ class z0 implements x {

    /* renamed from: a  reason: collision with root package name */
    private final FirebaseInstanceId f11820a;

    /* renamed from: b  reason: collision with root package name */
    private final String f11821b;

    /* renamed from: c  reason: collision with root package name */
    private final String f11822c;

    /* renamed from: d  reason: collision with root package name */
    private final String f11823d;

    z0(FirebaseInstanceId firebaseInstanceId, String str, String str2, String str3) {
        this.f11820a = firebaseInstanceId;
        this.f11821b = str;
        this.f11822c = str2;
        this.f11823d = str3;
    }

    public final Task a() {
        return this.f11820a.g(this.f11821b, this.f11822c, this.f11823d);
    }
}
