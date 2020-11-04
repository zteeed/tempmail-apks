package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzbab {

    /* renamed from: a  reason: collision with root package name */
    private Map<Integer, Bitmap> f6271a = new ConcurrentHashMap();

    public zzbab() {
        new AtomicInteger(0);
    }

    public final Bitmap a(Integer num) {
        return this.f6271a.get(num);
    }
}
