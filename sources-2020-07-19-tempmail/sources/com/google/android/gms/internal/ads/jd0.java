package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class jd0 {

    /* renamed from: a  reason: collision with root package name */
    private final zzjx[] f4133a;

    /* renamed from: b  reason: collision with root package name */
    private final zzjz f4134b;

    /* renamed from: c  reason: collision with root package name */
    private zzjx f4135c;

    public jd0(zzjx[] zzjxArr, zzjz zzjz) {
        this.f4133a = zzjxArr;
        this.f4134b = zzjz;
    }

    public final void a() {
        zzjx zzjx = this.f4135c;
        if (zzjx != null) {
            zzjx.release();
            this.f4135c = null;
        }
    }

    public final zzjx b(zzjw zzjw, Uri uri) throws IOException, InterruptedException {
        zzjx zzjx = this.f4135c;
        if (zzjx != null) {
            return zzjx;
        }
        zzjx[] zzjxArr = this.f4133a;
        int length = zzjxArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            zzjx zzjx2 = zzjxArr[i];
            try {
                if (zzjx2.a(zzjw)) {
                    this.f4135c = zzjx2;
                    zzjw.c();
                    break;
                }
                i++;
            } catch (EOFException unused) {
            } finally {
                zzjw.c();
            }
        }
        zzjx zzjx3 = this.f4135c;
        if (zzjx3 != null) {
            zzjx3.e(this.f4134b);
            return this.f4135c;
        }
        String d2 = zzpo.d(this.f4133a);
        StringBuilder sb = new StringBuilder(String.valueOf(d2).length() + 58);
        sb.append("None of the available extractors (");
        sb.append(d2);
        sb.append(") could read the stream.");
        throw new zznq(sb.toString(), uri);
    }
}
