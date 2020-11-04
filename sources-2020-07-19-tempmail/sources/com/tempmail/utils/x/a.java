package com.tempmail.utils.x;

import android.content.Context;
import android.os.AsyncTask;
import com.tempmail.utils.m;
import com.tempmail.utils.s;

/* compiled from: GetGoogleAdvertisingInfo */
public class a extends AsyncTask<Void, Void, String> {

    /* renamed from: b  reason: collision with root package name */
    private static final String f12591b = a.class.getSimpleName();

    /* renamed from: a  reason: collision with root package name */
    private Context f12592a;

    public a(Context context) {
        this.f12592a = context;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0019  */
    /* JADX WARNING: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String doInBackground(java.lang.Void... r2) {
        /*
            r1 = this;
            r2 = 0
            android.content.Context r0 = r1.f12592a     // Catch:{ GooglePlayServicesNotAvailableException -> 0x0012, GooglePlayServicesRepairableException -> 0x000d, IOException -> 0x0008 }
            com.google.android.gms.ads.identifier.AdvertisingIdClient$Info r0 = com.google.android.gms.ads.identifier.AdvertisingIdClient.getAdvertisingIdInfo(r0)     // Catch:{ GooglePlayServicesNotAvailableException -> 0x0012, GooglePlayServicesRepairableException -> 0x000d, IOException -> 0x0008 }
            goto L_0x0017
        L_0x0008:
            r0 = move-exception
            r0.printStackTrace()
            goto L_0x0016
        L_0x000d:
            r0 = move-exception
            r0.printStackTrace()
            goto L_0x0016
        L_0x0012:
            r0 = move-exception
            r0.printStackTrace()
        L_0x0016:
            r0 = r2
        L_0x0017:
            if (r0 == 0) goto L_0x001d
            java.lang.String r2 = r0.getId()
        L_0x001d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tempmail.utils.x.a.doInBackground(java.lang.Void[]):java.lang.String");
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void onPostExecute(String str) {
        if (str != null) {
            s.X(this.f12592a, str);
        }
        String str2 = f12591b;
        m.b(str2, "ad id google " + str);
    }

    /* access modifiers changed from: protected */
    public void onPreExecute() {
        super.onPreExecute();
        m.b(f12591b, "onPreExecute ");
    }
}
