package com.google.android.play.core.assetpacks;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import com.google.android.play.core.common.LocalTestingException;
import com.google.android.play.core.internal.a;
import com.google.android.play.core.internal.c0;
import com.google.android.play.core.internal.m;
import com.google.android.play.core.internal.y;
import com.google.android.play.core.tasks.c;
import com.google.android.play.core.tasks.e;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

final class u1 implements j3 {
    private static final a g = new a("FakeAssetPackService");

    /* renamed from: a  reason: collision with root package name */
    private final String f11408a;

    /* renamed from: b  reason: collision with root package name */
    private final v f11409b;

    /* renamed from: c  reason: collision with root package name */
    private final Context f11410c;

    /* renamed from: d  reason: collision with root package name */
    private final e2 f11411d;

    /* renamed from: e  reason: collision with root package name */
    private final y<Executor> f11412e;

    /* renamed from: f  reason: collision with root package name */
    private final Handler f11413f = new Handler(Looper.getMainLooper());

    static {
        new AtomicInteger(1);
    }

    u1(File file, v vVar, y0 y0Var, Context context, e2 e2Var, y<Executor> yVar) {
        this.f11408a = file.getAbsolutePath();
        this.f11409b = vVar;
        this.f11410c = context;
        this.f11411d = e2Var;
        this.f11412e = yVar;
    }

    static long b(int i, long j) {
        if (i == 2) {
            return j / 2;
        }
        if (i == 3 || i == 4) {
            return j;
        }
        return 0;
    }

    private static String c(File file) throws LocalTestingException {
        try {
            return w1.b(Arrays.asList(new File[]{file}));
        } catch (NoSuchAlgorithmException e2) {
            throw new LocalTestingException("SHA256 algorithm not supported.", e2);
        } catch (IOException e3) {
            throw new LocalTestingException(String.format("Could not digest file: %s.", new Object[]{file}), e3);
        }
    }

    private final void e(int i, String str, int i2) throws LocalTestingException {
        Bundle bundle = new Bundle();
        bundle.putInt("app_version_code", this.f11411d.a());
        bundle.putInt("session_id", i);
        File[] h = h(str);
        ArrayList arrayList = new ArrayList();
        long j = 0;
        for (File file : h) {
            j += file.length();
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(i2 == 3 ? new Intent().setData(Uri.EMPTY) : null);
            String a2 = m.a(file);
            bundle.putParcelableArrayList(c0.b("chunk_intents", str, a2), arrayList2);
            bundle.putString(c0.b("uncompressed_hash_sha256", str, a2), c(file));
            bundle.putLong(c0.b("uncompressed_size", str, a2), file.length());
            arrayList.add(a2);
        }
        bundle.putStringArrayList(c0.a("slice_ids", str), arrayList);
        bundle.putLong(c0.a("pack_version", str), (long) this.f11411d.a());
        bundle.putInt(c0.a("status", str), i2);
        bundle.putInt(c0.a("error_code", str), 0);
        bundle.putLong(c0.a("bytes_downloaded", str), b(i2, j));
        bundle.putLong(c0.a("total_bytes_to_download", str), j);
        bundle.putStringArrayList("pack_names", new ArrayList(Arrays.asList(new String[]{str})));
        bundle.putLong("bytes_downloaded", b(i2, j));
        bundle.putLong("total_bytes_to_download", j);
        this.f11413f.post(new t1(this, new Intent("com.google.android.play.core.assetpacks.receiver.ACTION_SESSION_UPDATE").putExtra("com.google.android.play.core.assetpacks.receiver.EXTRA_SESSION_STATE", bundle)));
    }

    private final File[] h(String str) throws LocalTestingException {
        File file = new File(this.f11408a);
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles(new s1(str));
            if (listFiles != null) {
                if (r1 != 0) {
                    for (File a2 : listFiles) {
                        if (m.a(a2).equals(str)) {
                            return listFiles;
                        }
                    }
                    throw new LocalTestingException(String.format("No master slice available for pack '%s'.", new Object[]{str}));
                }
                throw new LocalTestingException(String.format("No APKs available for pack '%s'.", new Object[]{str}));
            }
            throw new LocalTestingException(String.format("Failed fetching APKs for pack '%s'.", new Object[]{str}));
        }
        throw new LocalTestingException(String.format("Local testing directory '%s' not found.", new Object[]{file}));
    }

    public final void K(List<String> list) {
        g.f("cancelDownload(%s)", list);
    }

    public final void S(int i) {
        g.f("notifySessionFailed", new Object[0]);
    }

    public final c<List<String>> T(Map<String, Long> map) {
        g.f("syncPacks()", new Object[0]);
        return e.b(new ArrayList());
    }

    public final c<ParcelFileDescriptor> U(int i, String str, String str2, int i2) {
        g.f("getChunkFileDescriptor(session=%d, %s, %s, %d)", Integer.valueOf(i), str, str2, Integer.valueOf(i2));
        com.google.android.play.core.tasks.m mVar = new com.google.android.play.core.tasks.m();
        try {
            File[] h = h(str);
            int length = h.length;
            int i3 = 0;
            while (i3 < length) {
                File file = h[i3];
                if (!m.a(file).equals(str2)) {
                    i3++;
                } else {
                    mVar.c(ParcelFileDescriptor.open(file, 268435456));
                    return mVar.a();
                }
            }
            throw new LocalTestingException(String.format("Local testing slice for '%s' not found.", new Object[]{str2}));
        } catch (FileNotFoundException e2) {
            g.g("getChunkFileDescriptor failed", e2);
            mVar.b(new LocalTestingException("Asset Slice file not found.", e2));
        } catch (LocalTestingException e3) {
            g.g("getChunkFileDescriptor failed", e3);
            mVar.b(e3);
        }
    }

    public final void V(int i, String str, String str2, int i2) {
        g.f("notifyChunkTransferred", new Object[0]);
    }

    public final void a(int i, String str) {
        g.f("notifyModuleCompleted", new Object[0]);
        this.f11412e.d().execute(new r1(this, i, str));
    }

    public final void d() {
        g.f("keepAlive", new Object[0]);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void f(Intent intent) {
        this.f11409b.a(this.f11410c, intent);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void g(int i, String str) {
        try {
            e(i, str, 4);
        } catch (LocalTestingException e2) {
            g.g("notifyModuleCompleted failed", e2);
        }
    }
}
