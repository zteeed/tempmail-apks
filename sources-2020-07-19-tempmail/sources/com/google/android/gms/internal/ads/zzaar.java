package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.ConditionVariable;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.common.wrappers.Wrappers;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONException;
import org.json.JSONObject;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public final class zzaar implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* renamed from: a  reason: collision with root package name */
    private final Object f5524a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private final ConditionVariable f5525b = new ConditionVariable();

    /* renamed from: c  reason: collision with root package name */
    private volatile boolean f5526c = false;
    @VisibleForTesting

    /* renamed from: d  reason: collision with root package name */
    private volatile boolean f5527d = false;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public SharedPreferences f5528e = null;

    /* renamed from: f  reason: collision with root package name */
    private Bundle f5529f = new Bundle();
    private Context g;
    private JSONObject h = new JSONObject();

    private final void e() {
        if (this.f5528e != null) {
            try {
                this.h = new JSONObject((String) zzbai.b(new k(this)));
            } catch (JSONException unused) {
            }
        }
    }

    public final void a(Context context) {
        if (!this.f5526c) {
            synchronized (this.f5524a) {
                if (!this.f5526c) {
                    if (!this.f5527d) {
                        this.f5527d = true;
                    }
                    Context applicationContext = context.getApplicationContext() == null ? context : context.getApplicationContext();
                    this.g = applicationContext;
                    try {
                        this.f5529f = Wrappers.a(applicationContext).c(this.g.getPackageName(), 128).metaData;
                    } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
                    }
                    try {
                        Context remoteContext = GooglePlayServicesUtilLight.getRemoteContext(context);
                        if (remoteContext == null && context != null) {
                            Context applicationContext2 = context.getApplicationContext();
                            if (applicationContext2 != null) {
                                context = applicationContext2;
                            }
                            remoteContext = context;
                        }
                        if (remoteContext != null) {
                            zzwg.c();
                            SharedPreferences sharedPreferences = remoteContext.getSharedPreferences("google_ads_flags", 0);
                            this.f5528e = sharedPreferences;
                            if (sharedPreferences != null) {
                                sharedPreferences.registerOnSharedPreferenceChangeListener(this);
                            }
                            zzacy.a(new j(this));
                            e();
                            this.f5526c = true;
                            this.f5527d = false;
                            this.f5525b.open();
                        }
                    } finally {
                        this.f5527d = false;
                        this.f5525b.open();
                    }
                }
            }
        }
    }

    public final <T> T c(zzaag<T> zzaag) {
        if (!this.f5525b.block(5000)) {
            synchronized (this.f5524a) {
                if (!this.f5527d) {
                    throw new IllegalStateException("Flags.initialize() was not called!");
                }
            }
        }
        if (!this.f5526c || this.f5528e == null) {
            synchronized (this.f5524a) {
                if (this.f5526c) {
                    if (this.f5528e == null) {
                    }
                }
                T m = zzaag.m();
                return m;
            }
        }
        if (zzaag.b() == 2) {
            Bundle bundle = this.f5529f;
            if (bundle == null) {
                return zzaag.m();
            }
            return zzaag.h(bundle);
        } else if (zzaag.b() != 1 || !this.h.has(zzaag.a())) {
            return zzbai.b(new i(this, zzaag));
        } else {
            return zzaag.l(this.h);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object d(zzaag zzaag) {
        return zzaag.g(this.f5528e);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ String f() {
        return this.f5528e.getString("flag_configuration", "{}");
    }

    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if ("flag_configuration".equals(str)) {
            e();
        }
    }
}
