package com.google.android.gms.ads.internal;

import android.os.AsyncTask;
import com.google.android.gms.internal.ads.zzbba;
import com.google.android.gms.internal.ads.zzeg;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class zzp extends AsyncTask<Void, Void, String> {
    private final /* synthetic */ zzl zzbox;

    private zzp(zzl zzl) {
        this.zzbox = zzl;
    }

    /* access modifiers changed from: private */
    /* renamed from: zza */
    public final String doInBackground(Void... voidArr) {
        try {
            zzeg unused = this.zzbox.zzbpe = (zzeg) this.zzbox.zzbpa.get(1000, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e2) {
            zzbba.d("", e2);
        }
        return this.zzbox.zzkm();
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ void onPostExecute(Object obj) {
        String str = (String) obj;
        if (this.zzbox.zzbpc != null && str != null) {
            this.zzbox.zzbpc.loadUrl(str);
        }
    }

    /* synthetic */ zzp(zzl zzl, zzk zzk) {
        this(zzl);
    }
}
