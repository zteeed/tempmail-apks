package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.os.Looper;
import com.google.android.gms.common.util.Clock;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzcet {

    /* renamed from: a  reason: collision with root package name */
    private final Clock f6937a;

    /* renamed from: b  reason: collision with root package name */
    private final Executor f6938b;

    public zzcet(zzazq zzazq, Clock clock, Executor executor) {
        this.f6937a = clock;
        this.f6938b = executor;
    }

    /* access modifiers changed from: private */
    public final Bitmap b(byte[] bArr, double d2, boolean z) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inDensity = (int) (d2 * 160.0d);
        if (!z) {
            options.inPreferredConfig = Bitmap.Config.RGB_565;
        }
        if (((Boolean) zzwg.e().c(zzaav.Y2)).booleanValue()) {
            options.inJustDecodeBounds = true;
            c(bArr, options);
            options.inJustDecodeBounds = false;
            int i = options.outWidth * options.outHeight;
            if (i > 0) {
                int i2 = i - 1;
                options.inSampleSize = 1 << ((33 - Integer.numberOfLeadingZeros(i2 / ((Integer) zzwg.e().c(zzaav.Z2)).intValue())) / 2);
            }
        }
        return c(bArr, options);
    }

    private final Bitmap c(byte[] bArr, BitmapFactory.Options options) {
        long b2 = this.f6937a.b();
        boolean z = false;
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        long b3 = this.f6937a.b();
        if (Build.VERSION.SDK_INT >= 19 && decodeByteArray != null) {
            int width = decodeByteArray.getWidth();
            int height = decodeByteArray.getHeight();
            int allocationByteCount = decodeByteArray.getAllocationByteCount();
            long j = b3 - b2;
            if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
                z = true;
            }
            StringBuilder sb = new StringBuilder(108);
            sb.append("Decoded image w: ");
            sb.append(width);
            sb.append(" h:");
            sb.append(height);
            sb.append(" bytes: ");
            sb.append(allocationByteCount);
            sb.append(" time: ");
            sb.append(j);
            sb.append(" on ui thread: ");
            sb.append(z);
            zzaxv.m(sb.toString());
        }
        return decodeByteArray;
    }

    public final zzdvf<Bitmap> d(String str, double d2, boolean z) {
        return zzdux.i(zzazq.d(str), new wh(this, d2, z), this.f6938b);
    }
}
