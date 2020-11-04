package com.google.android.gms.common;

import java.util.concurrent.Callable;

final class k extends i {

    /* renamed from: e  reason: collision with root package name */
    private final Callable<String> f3073e;

    private k(Callable<String> callable) {
        super(false, (String) null, (Throwable) null);
        this.f3073e = callable;
    }

    /* access modifiers changed from: package-private */
    public final String a() {
        try {
            return this.f3073e.call();
        } catch (Exception e2) {
            throw new RuntimeException(e2);
        }
    }
}
