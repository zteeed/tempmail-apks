package com.google.android.play.core.assetpacks;

import com.google.android.play.core.internal.a;
import java.io.File;
import java.io.IOException;

final class y1 {

    /* renamed from: b  reason: collision with root package name */
    private static final a f11462b = new a("MergeSliceTaskHandler");

    /* renamed from: a  reason: collision with root package name */
    private final b0 f11463a;

    y1(b0 b0Var) {
        this.f11463a = b0Var;
    }

    private static void b(File file, File file2) {
        if (file.isDirectory()) {
            file2.mkdirs();
            for (File file3 : file.listFiles()) {
                b(file3, new File(file2, file3.getName()));
            }
            if (!file.delete()) {
                String valueOf = String.valueOf(file);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 28);
                sb.append("Unable to delete directory: ");
                sb.append(valueOf);
                throw new v0(sb.toString());
            }
        } else if (file2.exists()) {
            String valueOf2 = String.valueOf(file2);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 51);
            sb2.append("File clashing with existing file from other slice: ");
            sb2.append(valueOf2);
            throw new v0(sb2.toString());
        } else if (!file.renameTo(file2)) {
            String valueOf3 = String.valueOf(file);
            StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf3).length() + 21);
            sb3.append("Unable to move file: ");
            sb3.append(valueOf3);
            throw new v0(sb3.toString());
        }
    }

    public final void a(x1 x1Var) {
        File k = this.f11463a.k(x1Var.f11349b, x1Var.f11453c, x1Var.f11454d, x1Var.f11455e);
        if (k.exists()) {
            File m = this.f11463a.m(x1Var.f11349b, x1Var.f11453c, x1Var.f11454d);
            if (!m.exists()) {
                m.mkdirs();
            }
            b(k, m);
            try {
                this.f11463a.f(x1Var.f11349b, x1Var.f11453c, x1Var.f11454d, this.f11463a.r(x1Var.f11349b, x1Var.f11453c, x1Var.f11454d) + 1);
            } catch (IOException e2) {
                f11462b.e("Writing merge checkpoint failed with %s.", e2.getMessage());
                throw new v0("Writing merge checkpoint failed.", e2, x1Var.f11348a);
            }
        } else {
            throw new v0(String.format("Cannot find verified files for slice %s.", new Object[]{x1Var.f11455e}), x1Var.f11348a);
        }
    }
}
