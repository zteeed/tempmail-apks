package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.os.Environment;
import android.os.StatFs;
import android.support.v4.media.session.PlaybackStateCompat;
import android.view.View;

@TargetApi(18)
/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public class zzayn extends zzayo {
    public boolean b(View view) {
        return super.b(view) || view.getWindowId() != null;
    }

    public final int q() {
        return 14;
    }

    public final long u() {
        if (!((Boolean) zzwg.e().c(zzaav.s1)).booleanValue()) {
            return -1;
        }
        return new StatFs(Environment.getDataDirectory().getAbsolutePath()).getAvailableBytes() / PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID;
    }
}
