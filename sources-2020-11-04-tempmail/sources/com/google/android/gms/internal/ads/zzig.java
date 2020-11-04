package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public interface zzig {

    /* renamed from: a  reason: collision with root package name */
    public static final ByteBuffer f8943a = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    void a();

    boolean b();

    ByteBuffer c();

    void d(ByteBuffer byteBuffer);

    int e();

    boolean f(int i, int i2, int i3) throws zzif;

    void flush();

    void g();

    int h();

    boolean isActive();
}
