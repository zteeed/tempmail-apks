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
    private final View f6064a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<String, WeakReference<View>> f6065b;

    /* renamed from: c  reason: collision with root package name */
    private final zzawr f6066c;

    public zzarg(zzarh zzarh) {
        Map<String, WeakReference<View>> map;
        this.f6064a = zzarh.f6067a;
        this.f6065b = zzarh.f6068b;
        zzawr b2 = zzare.b(zzarh.f6067a.getContext());
        this.f6066c = b2;
        if (b2 != null && (map = this.f6065b) != null && !map.isEmpty()) {
            try {
                this.f6066c.C4(new zzark(ObjectWrapper.h0(this.f6064a).asBinder(), ObjectWrapper.h0(this.f6065b).asBinder()));
            } catch (RemoteException unused) {
                zzbba.g("Failed to call remote method.");
            }
        }
    }

    public final void a(MotionEvent motionEvent) {
        zzawr zzawr = this.f6066c;
        if (zzawr == null) {
            zzbba.f("Failed to get internal reporting info generator.");
            return;
        }
        try {
            zzawr.X2(ObjectWrapper.h0(motionEvent));
        } catch (RemoteException unused) {
            zzbba.g("Failed to call remote method.");
        }
    }

    public final void b(Uri uri, UpdateClickUrlCallback updateClickUrlCallback) {
        if (this.f6066c == null) {
            updateClickUrlCallback.onFailure("Failed to get internal reporting info generator.");
        }
        try {
            this.f6066c.N1(new ArrayList(Arrays.asList(new Uri[]{uri})), ObjectWrapper.h0(this.f6064a), new o3(this, updateClickUrlCallback));
        } catch (RemoteException e2) {
            String valueOf = String.valueOf(e2);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 16);
            sb.append("Internal error: ");
            sb.append(valueOf);
            updateClickUrlCallback.onFailure(sb.toString());
        }
    }

    public final void c(List<Uri> list, UpdateImpressionUrlsCallback updateImpressionUrlsCallback) {
        if (this.f6066c == null) {
            updateImpressionUrlsCallback.onFailure("Failed to get internal reporting info generator.");
        }
        try {
            this.f6066c.Y0(list, ObjectWrapper.h0(this.f6064a), new n3(this, updateImpressionUrlsCallback));
        } catch (RemoteException e2) {
            String valueOf = String.valueOf(e2);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 16);
            sb.append("Internal error: ");
            sb.append(valueOf);
            updateImpressionUrlsCallback.onFailure(sb.toString());
        }
    }
}
