package com.google.android.play.core.assetpacks;

import com.google.android.play.core.internal.a;
import java.io.File;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;

final class o2 {

    /* renamed from: b  reason: collision with root package name */
    private static final a f11350b = new a("VerifySliceTaskHandler");

    /* renamed from: a  reason: collision with root package name */
    private final b0 f11351a;

    o2(b0 b0Var) {
        this.f11351a = b0Var;
    }

    private final void b(n2 n2Var, File file) {
        try {
            File y = this.f11351a.y(n2Var.f11349b, n2Var.f11342c, n2Var.f11343d, n2Var.f11344e);
            if (y.exists()) {
                try {
                    if (w1.b(m2.a(file, y)).equals(n2Var.f11345f)) {
                        f11350b.f("Verification of slice %s of pack %s successful.", n2Var.f11344e, n2Var.f11349b);
                        return;
                    }
                    throw new v0(String.format("Verification failed for slice %s.", new Object[]{n2Var.f11344e}), n2Var.f11348a);
                } catch (NoSuchAlgorithmException e2) {
                    throw new v0("SHA256 algorithm not supported.", e2, n2Var.f11348a);
                } catch (IOException e3) {
                    throw new v0(String.format("Could not digest file during verification for slice %s.", new Object[]{n2Var.f11344e}), e3, n2Var.f11348a);
                }
            } else {
                throw new v0(String.format("Cannot find metadata files for slice %s.", new Object[]{n2Var.f11344e}), n2Var.f11348a);
            }
        } catch (IOException e4) {
            throw new v0(String.format("Could not reconstruct slice archive during verification for slice %s.", new Object[]{n2Var.f11344e}), e4, n2Var.f11348a);
        }
    }

    public final void a(n2 n2Var) {
        File c2 = this.f11351a.c(n2Var.f11349b, n2Var.f11342c, n2Var.f11343d, n2Var.f11344e);
        if (c2.exists()) {
            b(n2Var, c2);
            File k = this.f11351a.k(n2Var.f11349b, n2Var.f11342c, n2Var.f11343d, n2Var.f11344e);
            if (!k.exists()) {
                k.mkdirs();
            }
            if (!c2.renameTo(k)) {
                throw new v0(String.format("Failed to move slice %s after verification.", new Object[]{n2Var.f11344e}), n2Var.f11348a);
            }
            return;
        }
        throw new v0(String.format("Cannot find unverified files for slice %s.", new Object[]{n2Var.f11344e}), n2Var.f11348a);
    }
}
