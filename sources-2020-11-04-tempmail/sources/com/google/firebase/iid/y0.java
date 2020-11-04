package com.google.firebase.iid;

import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;

/* compiled from: com.google.firebase:firebase-iid@@20.2.1 */
final /* synthetic */ class y0 implements SuccessContinuation {

    /* renamed from: a  reason: collision with root package name */
    private final FirebaseInstanceId f11815a;

    /* renamed from: b  reason: collision with root package name */
    private final String f11816b;

    /* renamed from: c  reason: collision with root package name */
    private final String f11817c;

    /* renamed from: d  reason: collision with root package name */
    private final String f11818d;

    y0(FirebaseInstanceId firebaseInstanceId, String str, String str2, String str3) {
        this.f11815a = firebaseInstanceId;
        this.f11816b = str;
        this.f11817c = str2;
        this.f11818d = str3;
    }

    public final Task then(Object obj) {
        return this.f11815a.h(this.f11816b, this.f11817c, this.f11818d, (String) obj);
    }
}
