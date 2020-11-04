package com.google.firebase.iid;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.CountDownLatch;

/* compiled from: com.google.firebase:firebase-iid@@20.2.1 */
final /* synthetic */ class w0 implements OnCompleteListener {

    /* renamed from: a  reason: collision with root package name */
    private final CountDownLatch f11808a;

    w0(CountDownLatch countDownLatch) {
        this.f11808a = countDownLatch;
    }

    public final void a(Task task) {
        this.f11808a.countDown();
    }
}
