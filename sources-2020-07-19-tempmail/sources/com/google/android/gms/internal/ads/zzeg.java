package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.view.MotionEvent;
import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzeg {

    /* renamed from: d  reason: collision with root package name */
    private static final String[] f8562d = {"/aclk", "/pcs/click", "/dbm/clk"};

    /* renamed from: a  reason: collision with root package name */
    private String f8563a = "ad.doubleclick.net";

    /* renamed from: b  reason: collision with root package name */
    private String[] f8564b = {".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"};

    /* renamed from: c  reason: collision with root package name */
    private zzdw f8565c;

    public zzeg(zzdw zzdw) {
        this.f8565c = zzdw;
    }

    private final Uri c(Uri uri, String str) throws zzef {
        try {
            boolean e2 = e(uri);
            if (e2) {
                if (uri.toString().contains("dc_ms=")) {
                    throw new zzef("Parameter already exists: dc_ms");
                }
            } else if (uri.getQueryParameter("ms") != null) {
                throw new zzef("Query parameter already exists: ms");
            }
            if (e2) {
                String uri2 = uri.toString();
                int indexOf = uri2.indexOf(";adurl");
                if (indexOf != -1) {
                    int i = indexOf + 1;
                    return Uri.parse(uri2.substring(0, i) + "dc_ms" + "=" + str + ";" + uri2.substring(i));
                }
                String encodedPath = uri.getEncodedPath();
                int indexOf2 = uri2.indexOf(encodedPath);
                return Uri.parse(uri2.substring(0, encodedPath.length() + indexOf2) + ";" + "dc_ms" + "=" + str + ";" + uri2.substring(indexOf2 + encodedPath.length()));
            }
            String uri3 = uri.toString();
            int indexOf3 = uri3.indexOf("&adurl");
            if (indexOf3 == -1) {
                indexOf3 = uri3.indexOf("?adurl");
            }
            if (indexOf3 == -1) {
                return uri.buildUpon().appendQueryParameter("ms", str).build();
            }
            int i2 = indexOf3 + 1;
            return Uri.parse(uri3.substring(0, i2) + "ms" + "=" + str + "&" + uri3.substring(i2));
        } catch (UnsupportedOperationException unused) {
            throw new zzef("Provided Uri is not in a valid state");
        }
    }

    private final boolean e(Uri uri) {
        if (uri != null) {
            try {
                return uri.getHost().equals(this.f8563a);
            } catch (NullPointerException unused) {
                return false;
            }
        } else {
            throw null;
        }
    }

    public final Uri a(Uri uri, Context context) throws zzef {
        return c(uri, this.f8565c.zzb(context));
    }

    public final Uri b(Uri uri, Context context, View view, Activity activity) throws zzef {
        try {
            return c(uri, this.f8565c.zza(context, uri.getQueryParameter("ai"), view, activity));
        } catch (UnsupportedOperationException unused) {
            throw new zzef("Provided Uri is not in a valid state");
        }
    }

    public final void d(MotionEvent motionEvent) {
        this.f8565c.zza(motionEvent);
    }

    public final boolean f(Uri uri) {
        if (uri != null) {
            try {
                String host = uri.getHost();
                for (String endsWith : this.f8564b) {
                    if (host.endsWith(endsWith)) {
                        return true;
                    }
                }
            } catch (NullPointerException unused) {
            }
            return false;
        }
        throw null;
    }

    public final boolean g(Uri uri) {
        if (f(uri)) {
            for (String endsWith : f8562d) {
                if (uri.getPath().endsWith(endsWith)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final zzdw h() {
        return this.f8565c;
    }
}
