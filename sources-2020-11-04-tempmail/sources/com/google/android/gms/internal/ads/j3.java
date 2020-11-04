package com.google.android.gms.internal.ads;

import android.app.DownloadManager;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Environment;
import com.google.android.gms.ads.internal.zzq;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class j3 implements DialogInterface.OnClickListener {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ String f4276b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ String f4277c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ zzapu f4278d;

    j3(zzapu zzapu, String str, String str2) {
        this.f4278d = zzapu;
        this.f4276b = str;
        this.f4277c = str2;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        DownloadManager downloadManager = (DownloadManager) this.f4278d.f6028d.getSystemService("download");
        try {
            String str = this.f4276b;
            String str2 = this.f4277c;
            DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str));
            request.setDestinationInExternalPublicDir(Environment.DIRECTORY_PICTURES, str2);
            zzq.zzky();
            request.allowScanningByMediaScanner();
            request.setNotificationVisibility(1);
            downloadManager.enqueue(request);
        } catch (IllegalStateException unused) {
            this.f4278d.e("Could not store picture.");
        }
    }
}
