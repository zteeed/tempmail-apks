package com.google.android.gms.internal.ads;

import com.google.firebase.crashlytics.internal.proto.CodedOutputStream;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzat {

    /* renamed from: e  reason: collision with root package name */
    private static final Comparator<byte[]> f6121e = new g4();

    /* renamed from: a  reason: collision with root package name */
    private final List<byte[]> f6122a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    private final List<byte[]> f6123b = new ArrayList(64);

    /* renamed from: c  reason: collision with root package name */
    private int f6124c = 0;

    /* renamed from: d  reason: collision with root package name */
    private final int f6125d = CodedOutputStream.DEFAULT_BUFFER_SIZE;

    public zzat(int i) {
    }

    private final synchronized void c() {
        while (this.f6124c > this.f6125d) {
            byte[] remove = this.f6122a.remove(0);
            this.f6123b.remove(remove);
            this.f6124c -= remove.length;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002f, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void a(byte[] r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            if (r3 == 0) goto L_0x002e
            int r0 = r3.length     // Catch:{ all -> 0x002b }
            int r1 = r2.f6125d     // Catch:{ all -> 0x002b }
            if (r0 <= r1) goto L_0x0009
            goto L_0x002e
        L_0x0009:
            java.util.List<byte[]> r0 = r2.f6122a     // Catch:{ all -> 0x002b }
            r0.add(r3)     // Catch:{ all -> 0x002b }
            java.util.List<byte[]> r0 = r2.f6123b     // Catch:{ all -> 0x002b }
            java.util.Comparator<byte[]> r1 = f6121e     // Catch:{ all -> 0x002b }
            int r0 = java.util.Collections.binarySearch(r0, r3, r1)     // Catch:{ all -> 0x002b }
            if (r0 >= 0) goto L_0x001b
            int r0 = -r0
            int r0 = r0 + -1
        L_0x001b:
            java.util.List<byte[]> r1 = r2.f6123b     // Catch:{ all -> 0x002b }
            r1.add(r0, r3)     // Catch:{ all -> 0x002b }
            int r0 = r2.f6124c     // Catch:{ all -> 0x002b }
            int r3 = r3.length     // Catch:{ all -> 0x002b }
            int r0 = r0 + r3
            r2.f6124c = r0     // Catch:{ all -> 0x002b }
            r2.c()     // Catch:{ all -> 0x002b }
            monitor-exit(r2)
            return
        L_0x002b:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        L_0x002e:
            monitor-exit(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzat.a(byte[]):void");
    }

    public final synchronized byte[] b(int i) {
        for (int i2 = 0; i2 < this.f6123b.size(); i2++) {
            byte[] bArr = this.f6123b.get(i2);
            if (bArr.length >= i) {
                this.f6124c -= bArr.length;
                this.f6123b.remove(i2);
                this.f6122a.remove(bArr);
                return bArr;
            }
        }
        return new byte[i];
    }
}
