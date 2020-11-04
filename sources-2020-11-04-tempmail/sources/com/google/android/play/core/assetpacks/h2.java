package com.google.android.play.core.assetpacks;

import com.google.android.play.core.internal.a;
import com.google.android.play.core.internal.m;
import com.google.android.play.core.internal.x;
import com.google.android.play.core.internal.y;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPInputStream;

final class h2 {

    /* renamed from: c  reason: collision with root package name */
    private static final a f11273c = new a("PatchSliceTaskHandler");

    /* renamed from: a  reason: collision with root package name */
    private final b0 f11274a;

    /* renamed from: b  reason: collision with root package name */
    private final y<j3> f11275b;

    h2(b0 b0Var, y<j3> yVar) {
        this.f11274a = b0Var;
        this.f11275b = yVar;
    }

    public final void a(g2 g2Var) {
        InputStream inputStream;
        Throwable th;
        g2 g2Var2 = g2Var;
        File b2 = this.f11274a.b(g2Var2.f11349b, g2Var2.f11261c, g2Var2.f11262d);
        b0 b0Var = this.f11274a;
        String str = g2Var2.f11349b;
        int i = g2Var2.f11261c;
        long j = g2Var2.f11262d;
        File file = new File(b0Var.j(str, i, j), g2Var2.h);
        try {
            inputStream = g2Var2.j;
            if (g2Var2.g == 2) {
                inputStream = new GZIPInputStream(inputStream, 8192);
            }
            e0 e0Var = new e0(b2, file);
            File file2 = new File(this.f11274a.y(g2Var2.f11349b, g2Var2.f11263e, g2Var2.f11264f, g2Var2.h), "slice.zip.tmp");
            if (file2.getParentFile() != null) {
                if (!file2.getParentFile().exists()) {
                    file2.getParentFile().mkdirs();
                }
            }
            m.b(e0Var, inputStream, new FileOutputStream(file2), g2Var2.i);
            if (file2.renameTo(this.f11274a.w(g2Var2.f11349b, g2Var2.f11263e, g2Var2.f11264f, g2Var2.h))) {
                inputStream.close();
                f11273c.f("Patching finished for slice %s of pack %s.", g2Var2.h, g2Var2.f11349b);
                this.f11275b.d().V(g2Var2.f11348a, g2Var2.f11349b, g2Var2.h, 0);
                try {
                    g2Var2.j.close();
                    return;
                } catch (IOException unused) {
                    f11273c.g("Could not close file for slice %s of pack %s.", g2Var2.h, g2Var2.f11349b);
                    return;
                }
            } else {
                throw new v0(String.format("Error moving patch for slice %s of pack %s.", new Object[]{g2Var2.h, g2Var2.f11349b}), g2Var2.f11348a);
            }
        } catch (IOException e2) {
            f11273c.e("IOException during patching %s.", e2.getMessage());
            throw new v0(String.format("Error patching slice %s of pack %s.", new Object[]{g2Var2.h, g2Var2.f11349b}), e2, g2Var2.f11348a);
        } catch (Throwable th2) {
            x.a(th, th2);
        }
        throw th;
    }
}
