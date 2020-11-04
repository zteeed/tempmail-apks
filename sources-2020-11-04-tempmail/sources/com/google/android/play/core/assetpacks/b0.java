package com.google.android.play.core.assetpacks;

import android.content.Context;
import com.google.android.play.core.internal.a;
import com.google.android.play.core.internal.x;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

final class b0 {

    /* renamed from: c  reason: collision with root package name */
    private static final a f11196c = new a("AssetPackStorage");

    /* renamed from: a  reason: collision with root package name */
    private final Context f11197a;

    /* renamed from: b  reason: collision with root package name */
    private final e2 f11198b;

    static {
        TimeUnit.DAYS.toMillis(14);
        TimeUnit.DAYS.toMillis(28);
    }

    b0(Context context, e2 e2Var) {
        this.f11197a = context;
        this.f11198b = e2Var;
    }

    private final File B(String str) {
        return new File(G(), str);
    }

    private final File C(String str, int i, long j) {
        return new File(m(str, i, j), "merge.tmp");
    }

    private final List<File> D() {
        ArrayList arrayList = new ArrayList();
        try {
            if (!G().exists() || G().listFiles() == null) {
                return arrayList;
            }
            for (File file : G().listFiles()) {
                if (!file.getCanonicalPath().equals(E().getCanonicalPath())) {
                    arrayList.add(file);
                }
            }
            return arrayList;
        } catch (IOException e2) {
            f11196c.e("Could not process directory while scanning installed packs. %s", e2);
        }
    }

    private final File E() {
        return new File(G(), "_tmp");
    }

    private final File F(String str, int i, long j) {
        return new File(new File(new File(E(), str), String.valueOf(i)), String.valueOf(j));
    }

    private final File G() {
        return new File(this.f11197a.getFilesDir(), "assetpacks");
    }

    private final File a(String str, int i) {
        return new File(B(str), String.valueOf(i));
    }

    private static void e(File file) {
        if (file.listFiles() != null && file.listFiles().length > 1) {
            long h = h(file);
            for (File file2 : file.listFiles()) {
                if (!file2.getName().equals(String.valueOf(h)) && !file2.getName().equals("stale.tmp")) {
                    q(file2);
                }
            }
        }
    }

    private static long h(File file) {
        if (file.exists()) {
            ArrayList arrayList = new ArrayList();
            try {
                for (File file2 : file.listFiles()) {
                    if (!file2.getName().equals("stale.tmp")) {
                        arrayList.add(Long.valueOf(file2.getName()));
                    }
                }
            } catch (NumberFormatException e2) {
                f11196c.d(e2, "Corrupt asset pack directories.", new Object[0]);
            }
            if (!arrayList.isEmpty()) {
                Collections.sort(arrayList);
                return ((Long) arrayList.get(arrayList.size() - 1)).longValue();
            }
        }
        return -1;
    }

    private static boolean q(File file) {
        File[] listFiles = file.listFiles();
        boolean z = true;
        if (listFiles != null) {
            for (File q : listFiles) {
                if (!q(q)) {
                    z = false;
                }
            }
        }
        if (file.delete()) {
            return z;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public final void A(String str, int i, long j) {
        if (F(str, i, j).exists()) {
            q(F(str, i, j));
        }
    }

    /* access modifiers changed from: package-private */
    public final File b(String str, int i, long j) {
        return new File(a(str, i), String.valueOf(j));
    }

    /* access modifiers changed from: package-private */
    public final File c(String str, int i, long j, String str2) {
        return new File(new File(new File(F(str, i, j), "_slices"), "_unverified"), str2);
    }

    /* access modifiers changed from: package-private */
    public final Map<String, a> d() {
        HashMap hashMap = new HashMap();
        try {
            for (File next : D()) {
                a i = i(next.getName());
                if (i != null) {
                    hashMap.put(next.getName(), i);
                }
            }
        } catch (IOException e2) {
            f11196c.e("Could not process directory while scanning installed packs: %s", e2);
        }
        return hashMap;
    }

    /* access modifiers changed from: package-private */
    public final void f(String str, int i, long j, int i2) throws IOException {
        File C = C(str, i, j);
        Properties properties = new Properties();
        properties.put("numberOfMerges", String.valueOf(i2));
        C.getParentFile().mkdirs();
        C.createNewFile();
        FileOutputStream fileOutputStream = new FileOutputStream(C);
        properties.store(fileOutputStream, (String) null);
        fileOutputStream.close();
    }

    /* access modifiers changed from: package-private */
    public final void g(List<String> list) {
        int a2 = this.f11198b.a();
        List<File> D = D();
        int size = D.size();
        for (int i = 0; i < size; i++) {
            File file = D.get(i);
            if (!list.contains(file.getName()) && h(file) != ((long) a2)) {
                q(file);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final a i(String str) throws IOException {
        String o = o(str);
        if (o == null) {
            return null;
        }
        File file = new File(o, "assets");
        if (file.isDirectory()) {
            return a.a(o, file.getCanonicalPath());
        }
        f11196c.e("Failed to find assets directory: %s", file);
        return null;
    }

    /* access modifiers changed from: package-private */
    public final File j(String str, int i, long j) {
        return new File(b(str, i, j), "_metadata");
    }

    /* access modifiers changed from: package-private */
    public final File k(String str, int i, long j, String str2) {
        return new File(new File(new File(F(str, i, j), "_slices"), "_verified"), str2);
    }

    /* access modifiers changed from: package-private */
    public final Map<String, Long> l() {
        HashMap hashMap = new HashMap();
        for (String next : d().keySet()) {
            hashMap.put(next, Long.valueOf(x(next)));
        }
        return hashMap;
    }

    /* access modifiers changed from: package-private */
    public final File m(String str, int i, long j) {
        return new File(F(str, i, j), "_packs");
    }

    /* access modifiers changed from: package-private */
    public final File n(String str, int i, long j, String str2) {
        return new File(y(str, i, j, str2), "checkpoint.dat");
    }

    /* access modifiers changed from: package-private */
    public final String o(String str) throws IOException {
        int length;
        File file = new File(G(), str);
        if (!file.exists()) {
            f11196c.c("Pack not found with pack name: %s", str);
            return null;
        }
        File file2 = new File(file, String.valueOf(this.f11198b.a()));
        if (!file2.exists()) {
            f11196c.c("Pack not found with pack name: %s app version: %s", str, Integer.valueOf(this.f11198b.a()));
            return null;
        }
        File[] listFiles = file2.listFiles();
        if (listFiles == null || (length = listFiles.length) == 0) {
            f11196c.c("No pack version found for pack name: %s app version: %s", str, Integer.valueOf(this.f11198b.a()));
            return null;
        } else if (length <= 1) {
            return listFiles[0].getCanonicalPath();
        } else {
            f11196c.e("Multiple pack versions found for pack name: %s app version: %s", str, Integer.valueOf(this.f11198b.a()));
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    public final void p() {
        List<File> D = D();
        int size = D.size();
        for (int i = 0; i < size; i++) {
            File file = D.get(i);
            if (file.listFiles() != null) {
                e(file);
                long h = h(file);
                if (((long) this.f11198b.a()) != h) {
                    try {
                        new File(new File(file, String.valueOf(h)), "stale.tmp").createNewFile();
                    } catch (IOException unused) {
                        f11196c.e("Could not write staleness marker.", new Object[0]);
                    }
                }
                for (File e2 : file.listFiles()) {
                    e(e2);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final int r(String str, int i, long j) throws IOException {
        File C = C(str, i, j);
        if (!C.exists()) {
            return 0;
        }
        Properties properties = new Properties();
        FileInputStream fileInputStream = new FileInputStream(C);
        try {
            properties.load(fileInputStream);
            fileInputStream.close();
            if (properties.getProperty("numberOfMerges") != null) {
                try {
                    return Integer.parseInt(properties.getProperty("numberOfMerges"));
                } catch (NumberFormatException e2) {
                    throw new v0("Merge checkpoint file corrupt.", (Exception) e2);
                }
            } else {
                throw new v0("Merge checkpoint file corrupt.");
            }
        } catch (Throwable th) {
            x.a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: package-private */
    public final File s(String str, int i, long j, String str2) {
        return new File(y(str, i, j, str2), "checkpoint_ext.dat");
    }

    /* access modifiers changed from: package-private */
    public final boolean t(String str) {
        if (B(str).exists()) {
            return q(B(str));
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public final int u(String str) {
        return (int) h(B(str));
    }

    /* access modifiers changed from: package-private */
    public final File v(String str, int i, long j) {
        return new File(new File(F(str, i, j), "_slices"), "_metadata");
    }

    /* access modifiers changed from: package-private */
    public final File w(String str, int i, long j, String str2) {
        return new File(y(str, i, j, str2), "slice.zip");
    }

    /* access modifiers changed from: package-private */
    public final long x(String str) {
        return h(a(str, u(str)));
    }

    /* access modifiers changed from: package-private */
    public final File y(String str, int i, long j, String str2) {
        return new File(v(str, i, j), str2);
    }

    /* access modifiers changed from: package-private */
    public final void z() {
        q(G());
    }
}
