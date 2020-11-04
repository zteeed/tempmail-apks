package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class jd0 {

    /* renamed from: a  reason: collision with root package name */
    private final zzjx[] f4316a;

    /* renamed from: b  reason: collision with root package name */
    private final zzjz f4317b;

    /* renamed from: c  reason: collision with root package name */
    private zzjx f4318c;

    public jd0(zzjx[] zzjxArr, zzjz zzjz) {
        this.f4316a = zzjxArr;
        this.f4317b = zzjz;
    }

    public final void a() {
        zzjx zzjx = this.f4318c;
        if (zzjx != null) {
            zzjx.release();
            this.f4318c = null;
        }
    }

    public final zzjx b(zzjw zzjw, Uri uri) throws IOException, InterruptedException {
        zzjx zzjx = this.f4318c;
        if (zzjx != null) {
            return zzjx;
        }
        zzjx[] zzjxArr = this.f4316a;
        int length = zzjxArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            zzjx zzjx2 = zzjxArr[i];
            try {
                if (zzjx2.a(zzjw)) {
                    this.f4318c = zzjx2;
                    zzjw.c();
                    break;
                }
                i++;
            } catch (EOFException unused) {
            } finally {
                zzjw.c();
            }
        }
        zzjx zzjx3 = this.f4318c;
        if (zzjx3 != null) {
            zzjx3.e(this.f4317b);
            return this.f4318c;
        }
        String d2 = zzpo.d(this.f4316a);
        StringBuilder sb = new StringBuilder(String.valueOf(d2).length() + 58);
        sb.append("None of the available extractors (");
        sb.append(d2);
        sb.append(") could read the stream.");
        throw new zznq(sb.toString(), uri);
    }
}
