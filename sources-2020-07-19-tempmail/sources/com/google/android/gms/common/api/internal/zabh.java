package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.util.concurrent.NumberedThreadFactory;
import com.google.android.gms.internal.base.zam;
import java.util.concurrent.ExecutorService;

public final class zabh {

    /* renamed from: a  reason: collision with root package name */
    private static final ExecutorService f2855a = zam.a().a(2, new NumberedThreadFactory("GAC_Executor"), 9);

    public static ExecutorService a() {
        return f2855a;
    }
}
