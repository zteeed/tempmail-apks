package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.play.core.internal.o0;
import com.google.android.play.core.tasks.m;
import java.util.List;

class l<T> extends o0 {

    /* renamed from: b  reason: collision with root package name */
    final m<T> f11320b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ q f11321c;

    l(q qVar, m<T> mVar) {
        this.f11321c = qVar;
        this.f11320b = mVar;
    }

    l(q qVar, m mVar, byte[] bArr) {
        this(qVar, mVar);
    }

    l(q qVar, m mVar, char[] cArr) {
        this(qVar, mVar);
    }

    l(q qVar, m mVar, int[] iArr) {
        this(qVar, mVar);
    }

    public void K(List<Bundle> list) {
        this.f11321c.f11363c.b();
        q.f11360f.f("onGetSessionStates", new Object[0]);
    }

    public void P(Bundle bundle, Bundle bundle2) {
        this.f11321c.f11364d.b();
        q.f11360f.f("onKeepAlive(%b)", Boolean.valueOf(bundle.getBoolean("keep_alive")));
    }

    public final void S(int i) {
        this.f11321c.f11363c.b();
        q.f11360f.f("onCancelDownload(%d)", Integer.valueOf(i));
    }

    public void d() {
        this.f11321c.f11363c.b();
        q.f11360f.f("onCancelDownloads()", new Object[0]);
    }

    public final void d4(int i) {
        this.f11321c.f11363c.b();
        q.f11360f.f("onGetSession(%d)", Integer.valueOf(i));
    }

    public void f4(Bundle bundle, Bundle bundle2) {
        this.f11321c.f11363c.b();
        q.f11360f.f("onRequestDownloadInfo()", new Object[0]);
    }

    public void l(Bundle bundle) {
        this.f11321c.f11363c.b();
        int i = bundle.getInt("error_code");
        q.f11360f.e("onError(%d)", Integer.valueOf(i));
        this.f11320b.d(new AssetPackException(i));
    }

    public void p5(int i, Bundle bundle) {
        this.f11321c.f11363c.b();
        q.f11360f.f("onStartDownload(%d)", Integer.valueOf(i));
    }

    public void s3(Bundle bundle, Bundle bundle2) throws RemoteException {
        this.f11321c.f11363c.b();
        q.f11360f.f("onGetChunkFileDescriptor", new Object[0]);
    }

    public void u1() {
        this.f11321c.f11363c.b();
        q.f11360f.f("onRemoveModule()", new Object[0]);
    }

    public void x5(Bundle bundle) {
        this.f11321c.f11363c.b();
        q.f11360f.f("onNotifySessionFailed(%d)", Integer.valueOf(bundle.getInt("session_id")));
    }

    public void y(Bundle bundle) {
        this.f11321c.f11363c.b();
        q.f11360f.f("onNotifyChunkTransferred(%s, %s, %d, session=%d)", bundle.getString("module_name"), bundle.getString("slice_id"), Integer.valueOf(bundle.getInt("chunk_number")), Integer.valueOf(bundle.getInt("session_id")));
    }

    public void y2(Bundle bundle) {
        this.f11321c.f11363c.b();
        q.f11360f.f("onNotifyModuleCompleted(%s, sessionId=%d)", bundle.getString("module_name"), Integer.valueOf(bundle.getInt("session_id")));
    }
}
