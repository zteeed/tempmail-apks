package org.greenrobot.greendao.i;

import android.content.ContentResolver;
import android.database.CharArrayBuffer;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.CursorWindow;
import android.database.DataSetObserver;
import android.net.Uri;
import android.os.Bundle;

/* compiled from: FastCursor */
public final class b implements Cursor {

    /* renamed from: b  reason: collision with root package name */
    private final CursorWindow f14528b;

    /* renamed from: c  reason: collision with root package name */
    private int f14529c;

    /* renamed from: d  reason: collision with root package name */
    private final int f14530d;

    public b(CursorWindow cursorWindow) {
        this.f14528b = cursorWindow;
        this.f14530d = cursorWindow.getNumRows();
    }

    public void close() {
        throw new UnsupportedOperationException();
    }

    public void copyStringToBuffer(int i, CharArrayBuffer charArrayBuffer) {
        throw new UnsupportedOperationException();
    }

    public void deactivate() {
        throw new UnsupportedOperationException();
    }

    public byte[] getBlob(int i) {
        return this.f14528b.getBlob(this.f14529c, i);
    }

    public int getColumnCount() {
        throw new UnsupportedOperationException();
    }

    public int getColumnIndex(String str) {
        throw new UnsupportedOperationException();
    }

    public int getColumnIndexOrThrow(String str) throws IllegalArgumentException {
        throw new UnsupportedOperationException();
    }

    public String getColumnName(int i) {
        throw new UnsupportedOperationException();
    }

    public String[] getColumnNames() {
        throw new UnsupportedOperationException();
    }

    public int getCount() {
        return this.f14528b.getNumRows();
    }

    public double getDouble(int i) {
        return this.f14528b.getDouble(this.f14529c, i);
    }

    public Bundle getExtras() {
        throw new UnsupportedOperationException();
    }

    public float getFloat(int i) {
        return this.f14528b.getFloat(this.f14529c, i);
    }

    public int getInt(int i) {
        return this.f14528b.getInt(this.f14529c, i);
    }

    public long getLong(int i) {
        return this.f14528b.getLong(this.f14529c, i);
    }

    public Uri getNotificationUri() {
        return null;
    }

    public int getPosition() {
        return this.f14529c;
    }

    public short getShort(int i) {
        return this.f14528b.getShort(this.f14529c, i);
    }

    public String getString(int i) {
        return this.f14528b.getString(this.f14529c, i);
    }

    public int getType(int i) {
        throw new UnsupportedOperationException();
    }

    public boolean getWantsAllOnMoveCalls() {
        throw new UnsupportedOperationException();
    }

    public boolean isAfterLast() {
        throw new UnsupportedOperationException();
    }

    public boolean isBeforeFirst() {
        throw new UnsupportedOperationException();
    }

    public boolean isClosed() {
        throw new UnsupportedOperationException();
    }

    public boolean isFirst() {
        return this.f14529c == 0;
    }

    public boolean isLast() {
        return this.f14529c == this.f14530d - 1;
    }

    public boolean isNull(int i) {
        return this.f14528b.isNull(this.f14529c, i);
    }

    public boolean move(int i) {
        return moveToPosition(this.f14529c + i);
    }

    public boolean moveToFirst() {
        this.f14529c = 0;
        if (this.f14530d > 0) {
            return true;
        }
        return false;
    }

    public boolean moveToLast() {
        int i = this.f14530d;
        if (i <= 0) {
            return false;
        }
        this.f14529c = i - 1;
        return true;
    }

    public boolean moveToNext() {
        int i = this.f14529c;
        if (i >= this.f14530d - 1) {
            return false;
        }
        this.f14529c = i + 1;
        return true;
    }

    public boolean moveToPosition(int i) {
        if (i < 0 || i >= this.f14530d) {
            return false;
        }
        this.f14529c = i;
        return true;
    }

    public boolean moveToPrevious() {
        int i = this.f14529c;
        if (i <= 0) {
            return false;
        }
        this.f14529c = i - 1;
        return true;
    }

    public void registerContentObserver(ContentObserver contentObserver) {
        throw new UnsupportedOperationException();
    }

    public void registerDataSetObserver(DataSetObserver dataSetObserver) {
        throw new UnsupportedOperationException();
    }

    public boolean requery() {
        throw new UnsupportedOperationException();
    }

    public Bundle respond(Bundle bundle) {
        throw new UnsupportedOperationException();
    }

    public void setNotificationUri(ContentResolver contentResolver, Uri uri) {
        throw new UnsupportedOperationException();
    }

    public void unregisterContentObserver(ContentObserver contentObserver) {
        throw new UnsupportedOperationException();
    }

    public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
        throw new UnsupportedOperationException();
    }
}
