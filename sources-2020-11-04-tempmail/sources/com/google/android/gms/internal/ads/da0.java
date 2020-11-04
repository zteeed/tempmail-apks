package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.security.MessageDigest;

/* compiled from: com.google.android.gms:play-services-gass@@19.2.0 */
final class da0 implements ng {

    /* renamed from: a  reason: collision with root package name */
    private final FileChannel f3807a;

    /* renamed from: b  reason: collision with root package name */
    private final long f3808b;

    /* renamed from: c  reason: collision with root package name */
    private final long f3809c;

    public da0(FileChannel fileChannel, long j, long j2) {
        this.f3807a = fileChannel;
        this.f3808b = j;
        this.f3809c = j2;
    }

    public final void a(MessageDigest[] messageDigestArr, long j, int i) throws IOException {
        MappedByteBuffer map = this.f3807a.map(FileChannel.MapMode.READ_ONLY, this.f3808b + j, (long) i);
        map.load();
        for (MessageDigest update : messageDigestArr) {
            map.position(0);
            update.update(map);
        }
    }

    public final long size() {
        return this.f3809c;
    }
}
