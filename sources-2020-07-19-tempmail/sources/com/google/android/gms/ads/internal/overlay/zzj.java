package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.RelativeLayout;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.ads.zzayv;

@VisibleForTesting
/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class zzj extends RelativeLayout {
    @VisibleForTesting
    private zzayv zzdny;
    @VisibleForTesting
    boolean zzdnz;

    public zzj(Context context, String str, String str2) {
        super(context);
        zzayv zzayv = new zzayv(context, str);
        this.zzdny = zzayv;
        zzayv.g(str2);
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.zzdnz) {
            return false;
        }
        this.zzdny.h(motionEvent);
        return false;
    }
}
