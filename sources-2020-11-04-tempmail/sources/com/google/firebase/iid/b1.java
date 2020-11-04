package com.google.firebase.iid;

import android.content.BroadcastReceiver;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

/* compiled from: com.google.firebase:firebase-iid@@20.2.1 */
final /* synthetic */ class b1 implements OnCompleteListener {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f11712a;

    /* renamed from: b  reason: collision with root package name */
    private final BroadcastReceiver.PendingResult f11713b;

    b1(boolean z, BroadcastReceiver.PendingResult pendingResult) {
        this.f11712a = z;
        this.f11713b = pendingResult;
    }

    public final void a(Task task) {
        FirebaseInstanceIdReceiver.d(this.f11712a, this.f11713b, task);
    }
}
