package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.ads.query.UpdateClickUrlCallback;
import com.google.android.gms.ads.query.UpdateImpressionUrlsCallback;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import javax.annotation.Nonnull;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public final class zzarg {
    @Nonnull

    /* renamed from: a  reason: collision with root package name */
    private final View f5881a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<String, WeakReference<View>> f5882b;

    /* renamed from: c  reason: collision with root package name */
    private final zzawr f5883c;

    public zzarg(zzarh zzarh) {
        Map<String, WeakReference<View>> map;
        this.f5881a = zzarh.f5884a;
        this.f5882b = zzarh.f5885b;
        zzawr b2 = zzare.b(zzarh.f5884a.getContext());
        this.f5883c = b2;
        if (b2 != null && (map = this.f5882b) != null && !map.isEmpty()) {
            try {
                this.f5883c.i4(new zzark(ObjectWrapper.b0(this.f5881a).asBinder(), ObjectWrapper.b0(this.f5882b).asBinder()));
            } catch (RemoteException unused) {
                zzbba.g("Failed to call remote method.");
            }
        }
    }

    public final void a(MotionEvent motionEvent) {
        zzawr zzawr = this.f5883c;
        if (zzawr == null) {
            zzbba.f("Failed to get internal reporting info generator.");
            return;
        }
        try {
            zzawr.L2(ObjectWrapper.b0(motionEvent));
        } catch (RemoteException unused) {
            zzbba.g("Failed to call remote method.");
        }
    }

    public final void b(Uri uri, UpdateClickUrlCallback updateClickUrlCallback) {
        if (this.f5883c == null) {
            updateClickUrlCallback.onFailure("Failed to get internal reporting info generator.");
        }
        try {
            this.f5883c.E1(new ArrayList(Arrays.asList(new Uri[]{uri})), ObjectWrapper.b0(this.f5881a), new o3(this, updateClickUrlCallback));
        } catch (RemoteException e2) {
            String valueOf = String.valueOf(e2);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 16);
            sb.append("Internal error: ");
            sb.append(valueOf);
            updateClickUrlCallback.onFailure(sb.toString());
        }
    }

    public final void c(List<Uri> list, UpdateImpressionUrlsCallback updateImpressionUrlsCallback) {
        if (this.f5883c == null) {
            updateImpressionUrlsCallback.onFailure("Failed to get internal reporting info generator.");
        }
        try {
            this.f5883c.R0(list, ObjectWrapper.b0(this.f5881a), new n3(this, updateImpressionUrlsCallback));
        } catch (RemoteException e2) {
            String valueOf = String.valueOf(e2);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 16);
            sb.append("Internal error: ");
            sb.append(valueOf);
            updateImpressionUrlsCallback.onFailure(sb.toString());
        }
    }
}
