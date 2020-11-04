package com.google.android.gms.ads;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzaqi;
import com.google.android.gms.internal.ads.zzbba;
import com.google.android.gms.internal.ads.zzwg;

@KeepForSdk
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public final class AdActivity extends Activity {
    @KeepForSdk
    public static final String CLASS_NAME = "com.google.android.gms.ads.AdActivity";
    @KeepForSdk
    public static final String SIMPLE_CLASS_NAME = "AdActivity";
    private zzaqi zzacn;

    private final void zzdp() {
        zzaqi zzaqi = this.zzacn;
        if (zzaqi != null) {
            try {
                zzaqi.zzdp();
            } catch (RemoteException e2) {
                zzbba.e("#007 Could not call remote method.", e2);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onActivityResult(int i, int i2, Intent intent) {
        try {
            this.zzacn.onActivityResult(i, i2, intent);
        } catch (Exception e2) {
            zzbba.e("#007 Could not call remote method.", e2);
        }
        super.onActivityResult(i, i2, intent);
    }

    public final void onBackPressed() {
        boolean z = true;
        try {
            if (this.zzacn != null) {
                z = this.zzacn.zzul();
            }
        } catch (RemoteException e2) {
            zzbba.e("#007 Could not call remote method.", e2);
        }
        if (z) {
            super.onBackPressed();
        }
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        try {
            this.zzacn.zzad(ObjectWrapper.b0(configuration));
        } catch (RemoteException e2) {
            zzbba.e("#007 Could not call remote method.", e2);
        }
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        zzaqi g = zzwg.b().g(this);
        this.zzacn = g;
        if (g == null) {
            zzbba.e("#007 Could not call remote method.", (Throwable) null);
            finish();
            return;
        }
        try {
            g.onCreate(bundle);
        } catch (RemoteException e2) {
            zzbba.e("#007 Could not call remote method.", e2);
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public final void onDestroy() {
        try {
            if (this.zzacn != null) {
                this.zzacn.onDestroy();
            }
        } catch (RemoteException e2) {
            zzbba.e("#007 Could not call remote method.", e2);
        }
        super.onDestroy();
    }

    /* access modifiers changed from: protected */
    public final void onPause() {
        try {
            if (this.zzacn != null) {
                this.zzacn.onPause();
            }
        } catch (RemoteException e2) {
            zzbba.e("#007 Could not call remote method.", e2);
            finish();
        }
        super.onPause();
    }

    /* access modifiers changed from: protected */
    public final void onRestart() {
        super.onRestart();
        try {
            if (this.zzacn != null) {
                this.zzacn.onRestart();
            }
        } catch (RemoteException e2) {
            zzbba.e("#007 Could not call remote method.", e2);
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public final void onResume() {
        super.onResume();
        try {
            if (this.zzacn != null) {
                this.zzacn.onResume();
            }
        } catch (RemoteException e2) {
            zzbba.e("#007 Could not call remote method.", e2);
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public final void onSaveInstanceState(Bundle bundle) {
        try {
            if (this.zzacn != null) {
                this.zzacn.onSaveInstanceState(bundle);
            }
        } catch (RemoteException e2) {
            zzbba.e("#007 Could not call remote method.", e2);
            finish();
        }
        super.onSaveInstanceState(bundle);
    }

    /* access modifiers changed from: protected */
    public final void onStart() {
        super.onStart();
        try {
            if (this.zzacn != null) {
                this.zzacn.onStart();
            }
        } catch (RemoteException e2) {
            zzbba.e("#007 Could not call remote method.", e2);
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public final void onStop() {
        try {
            if (this.zzacn != null) {
                this.zzacn.onStop();
            }
        } catch (RemoteException e2) {
            zzbba.e("#007 Could not call remote method.", e2);
            finish();
        }
        super.onStop();
    }

    public final void setContentView(int i) {
        super.setContentView(i);
        zzdp();
    }

    public final void setContentView(View view) {
        super.setContentView(view);
        zzdp();
    }

    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        zzdp();
    }
}
