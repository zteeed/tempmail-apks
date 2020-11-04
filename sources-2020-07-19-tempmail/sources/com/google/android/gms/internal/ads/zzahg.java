package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import com.google.android.gms.ads.internal.overlay.zzd;
import com.google.android.gms.ads.internal.zzc;
import com.google.android.gms.ads.internal.zzq;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.ads.zzbgp;
import com.google.android.gms.internal.ads.zzbgq;
import com.google.android.gms.internal.ads.zzbgt;
import com.google.android.gms.internal.ads.zzbgy;
import com.google.android.gms.internal.ads.zzbha;
import com.tempmail.l.c;
import com.tempmail.s.m;
import com.tempmail.utils.i;
import java.net.URISyntaxException;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzahg<T extends zzbgq & zzbgp & zzbgt & zzbgy & zzbha> implements zzahc<T> {

    /* renamed from: a  reason: collision with root package name */
    private final zzc f5697a;

    /* renamed from: b  reason: collision with root package name */
    private final zzapt f5698b;

    public zzahg(zzc zzc, zzapt zzapt) {
        this.f5697a = zzc;
        this.f5698b = zzapt;
    }

    @VisibleForTesting
    static Uri b(Context context, zzeg zzeg, Uri uri, View view, Activity activity) {
        if (zzeg == null) {
            return uri;
        }
        try {
            if (zzeg.g(uri)) {
                return zzeg.b(uri, context, view, activity);
            }
            return uri;
        } catch (zzef unused) {
            return uri;
        } catch (Exception e2) {
            zzq.zzla().e(e2, "OpenGmsgHandler.maybeAddClickSignalsToUri");
            return uri;
        }
    }

    private final void c(boolean z) {
        zzapt zzapt = this.f5698b;
        if (zzapt != null) {
            zzapt.i(z);
        }
    }

    private static boolean d(Map<String, String> map) {
        return "1".equals(map.get("custom_close"));
    }

    private static int e(Map<String, String> map) {
        String str = map.get("o");
        if (str == null) {
            return -1;
        }
        if ("p".equalsIgnoreCase(str)) {
            zzq.zzky();
            return 7;
        } else if ("l".equalsIgnoreCase(str)) {
            zzq.zzky();
            return 6;
        } else if (c.f12425e.equalsIgnoreCase(str)) {
            return zzq.zzky().q();
        } else {
            return -1;
        }
    }

    @VisibleForTesting
    static Uri f(Uri uri) {
        try {
            if (uri.getQueryParameter("aclk_ms") != null) {
                return uri.buildUpon().appendQueryParameter("aclk_upms", String.valueOf(SystemClock.uptimeMillis())).build();
            }
        } catch (UnsupportedOperationException e2) {
            String valueOf = String.valueOf(uri.toString());
            zzbba.c(valueOf.length() != 0 ? "Error adding click uptime parameter to url: ".concat(valueOf) : new String("Error adding click uptime parameter to url: "), e2);
        }
        return uri;
    }

    public final /* synthetic */ void a(Object obj, Map map) {
        zzbgq zzbgq = (zzbgq) obj;
        String d2 = zzawn.d((String) map.get("u"), zzbgq.getContext(), true);
        String str = (String) map.get("a");
        if (str == null) {
            zzbba.i("Action missing from an open GMSG.");
            return;
        }
        zzc zzc = this.f5697a;
        if (zzc != null && !zzc.zzjy()) {
            this.f5697a.zzbn(d2);
        } else if ("expand".equalsIgnoreCase(str)) {
            if (((zzbgp) zzbgq).h()) {
                zzbba.i("Cannot expand WebView that is already expanded.");
                return;
            }
            c(false);
            ((zzbgt) zzbgq).C(d(map), e(map));
        } else if ("webapp".equalsIgnoreCase(str)) {
            c(false);
            if (d2 != null) {
                ((zzbgt) zzbgq).j0(d(map), e(map), d2);
            } else {
                ((zzbgt) zzbgq).y0(d(map), e(map), (String) map.get("html"), (String) map.get("baseurl"));
            }
        } else if ("app".equalsIgnoreCase(str) && "true".equalsIgnoreCase((String) map.get("system_browser"))) {
            c(true);
            if (TextUtils.isEmpty(d2)) {
                zzbba.i("Destination url cannot be empty.");
                return;
            }
            try {
                ((zzbgt) zzbgq).k0(new zzd(new zzahj(zzbgq.getContext(), ((zzbgy) zzbgq).d(), ((zzbha) zzbgq).getView()).d(map)));
            } catch (ActivityNotFoundException e2) {
                zzbba.i(e2.getMessage());
            }
        } else if ("open_app".equalsIgnoreCase(str)) {
            if (((Boolean) zzwg.e().c(zzaav.c4)).booleanValue()) {
                c(true);
                String str2 = (String) map.get("p");
                if (str2 == null) {
                    zzbba.i("Package name missing from open app action.");
                    return;
                }
                PackageManager packageManager = zzbgq.getContext().getPackageManager();
                if (packageManager == null) {
                    zzbba.i("Cannot get package manager from open app action.");
                    return;
                }
                Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage(str2);
                if (launchIntentForPackage != null) {
                    ((zzbgt) zzbgq).k0(new zzd(launchIntentForPackage));
                }
            }
        } else {
            c(true);
            String str3 = (String) map.get("intent_url");
            Intent intent = null;
            if (!TextUtils.isEmpty(str3)) {
                try {
                    intent = Intent.parseUri(str3, 0);
                } catch (URISyntaxException e3) {
                    String valueOf = String.valueOf(str3);
                    zzbba.c(valueOf.length() != 0 ? "Error parsing the url: ".concat(valueOf) : new String("Error parsing the url: "), e3);
                }
            }
            if (!(intent == null || intent.getData() == null)) {
                Uri data = intent.getData();
                if (!Uri.EMPTY.equals(data)) {
                    intent.setData(f(b(zzbgq.getContext(), ((zzbgy) zzbgq).d(), data, ((zzbha) zzbgq).getView(), zzbgq.b())));
                }
            }
            if (intent != null) {
                ((zzbgt) zzbgq).k0(new zzd(intent));
                return;
            }
            if (!TextUtils.isEmpty(d2)) {
                d2 = f(b(zzbgq.getContext(), ((zzbgy) zzbgq).d(), Uri.parse(d2), ((zzbha) zzbgq).getView(), zzbgq.b())).toString();
            }
            ((zzbgt) zzbgq).k0(new zzd((String) map.get(i.f12574a), d2, (String) map.get(m.f12494f), (String) map.get("p"), (String) map.get(c.f12425e), (String) map.get("f"), (String) map.get("e")));
        }
    }
}
