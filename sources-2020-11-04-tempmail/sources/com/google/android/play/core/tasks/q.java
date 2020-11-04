package com.google.android.play.core.tasks;

import java.util.concurrent.CountDownLatch;

final class q implements b, a {

    /* renamed from: a  reason: collision with root package name */
    private final CountDownLatch f11530a = new CountDownLatch(1);

    /* synthetic */ q(byte[] bArr) {
    }

    public final void a() throws InterruptedException {
        this.f11530a.await();
    }

    public final void b(Exception exc) {
        this.f11530a.countDown();
    }

    public final void onSuccess(Object obj) {
        this.f11530a.countDown();
    }
}
