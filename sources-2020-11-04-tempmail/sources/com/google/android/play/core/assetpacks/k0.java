package com.google.android.play.core.assetpacks;

import android.os.ParcelFileDescriptor;
import com.google.android.play.core.internal.y;
import com.google.android.play.core.tasks.e;
import java.io.InputStream;
import java.util.concurrent.ExecutionException;

final class k0 {

    /* renamed from: a  reason: collision with root package name */
    private final y<j3> f11306a;

    k0(y<j3> yVar) {
        this.f11306a = yVar;
    }

    /* access modifiers changed from: package-private */
    public final InputStream a(int i, String str, String str2, int i2) {
        try {
            return new ParcelFileDescriptor.AutoCloseInputStream((ParcelFileDescriptor) e.e(this.f11306a.d().U(i, str, str2, i2)));
        } catch (ExecutionException e2) {
            throw new v0(String.format("Error opening chunk file, session %s packName %s sliceId %s, chunkNumber %s", new Object[]{Integer.valueOf(i), str, str2, Integer.valueOf(i2)}), e2, i);
        } catch (InterruptedException e3) {
            throw new v0("Extractor was interrupted while waiting for chunk file.", e3, i);
        }
    }
}
