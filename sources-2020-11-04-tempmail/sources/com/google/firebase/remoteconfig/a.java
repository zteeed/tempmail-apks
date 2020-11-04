package com.google.firebase.remoteconfig;

import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;

/* compiled from: com.google.firebase:firebase-config@@19.1.4 */
final /* synthetic */ class a implements SuccessContinuation {

    /* renamed from: a  reason: collision with root package name */
    private static final a f11990a = new a();

    private a() {
    }

    public static SuccessContinuation a() {
        return f11990a;
    }

    public Task then(Object obj) {
        return Tasks.e(null);
    }
}
