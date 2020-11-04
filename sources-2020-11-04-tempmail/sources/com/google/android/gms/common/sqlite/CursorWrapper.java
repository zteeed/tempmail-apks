package com.google.android.gms.common.sqlite;

import android.database.AbstractWindowedCursor;
import android.database.CrossProcessCursor;
import android.database.Cursor;
import android.database.CursorWindow;
import com.google.android.gms.common.annotation.KeepForSdk;

@KeepForSdk
public class CursorWrapper extends android.database.CursorWrapper implements CrossProcessCursor {

    /* renamed from: b  reason: collision with root package name */
    private AbstractWindowedCursor f3288b;

    @KeepForSdk
    public void fillWindow(int i, CursorWindow cursorWindow) {
        this.f3288b.fillWindow(i, cursorWindow);
    }

    @KeepForSdk
    public CursorWindow getWindow() {
        return this.f3288b.getWindow();
    }

    public /* synthetic */ Cursor getWrappedCursor() {
        return this.f3288b;
    }

    public boolean onMove(int i, int i2) {
        return this.f3288b.onMove(i, i2);
    }
}
