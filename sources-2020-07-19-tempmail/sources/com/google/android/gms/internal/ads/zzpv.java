package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.view.Surface;

@TargetApi(17)
/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzpv extends Surface {

    /* renamed from: d  reason: collision with root package name */
    private static boolean f9008d;

    /* renamed from: e  reason: collision with root package name */
    private static boolean f9009e;

    /* renamed from: b  reason: collision with root package name */
    private final wd0 f9010b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f9011c;

    private zzpv(wd0 wd0, SurfaceTexture surfaceTexture, boolean z) {
        super(surfaceTexture);
        this.f9010b = wd0;
    }

    public static zzpv a(Context context, boolean z) {
        if (zzpo.f8995a >= 17) {
            zzpb.e(!z || b(context));
            return new wd0().b(z);
        }
        throw new UnsupportedOperationException("Unsupported prior to API level 17");
    }

    public static synchronized boolean b(Context context) {
        boolean z;
        synchronized (zzpv.class) {
            if (!f9009e) {
                if (zzpo.f8995a >= 17) {
                    boolean z2 = false;
                    String eglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373);
                    if (eglQueryString != null && eglQueryString.contains("EGL_EXT_protected_content")) {
                        if (!(zzpo.f8995a == 24 && (zzpo.f8998d.startsWith("SM-G950") || zzpo.f8998d.startsWith("SM-G955")) && !context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance"))) {
                            z2 = true;
                        }
                    }
                    f9008d = z2;
                }
                f9009e = true;
            }
            z = f9008d;
        }
        return z;
    }

    public final void release() {
        super.release();
        synchronized (this.f9010b) {
            if (!this.f9011c) {
                this.f9010b.a();
                this.f9011c = true;
            }
        }
    }
}