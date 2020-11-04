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
    private final CursorWindow f15097b;

    /* renamed from: c  reason: collision with root package name */
    private int f15098c;

    /* renamed from: d  reason: collision with root package name */
    private final int f15099d;

    public b(CursorWindow cursorWindow) {
        this.f15097b = cursorWindow;
        this.f15099d = cursorWindow.getNumRows();
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
        return this.f15097b.getBlob(this.f15098c, i);
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
        return this.f15097b.getNumRows();
    }

    public double getDouble(int i) {
        return this.f15097b.getDouble(this.f15098c, i);
    }

    public Bundle getExtras() {
        throw new UnsupportedOperationException();
    }

    public float getFloat(int i) {
        return this.f15097b.getFloat(this.f15098c, i);
    }

    public int getInt(int i) {
        return this.f15097b.getInt(this.f15098c, i);
    }

    public long getLong(int i) {
        return this.f15097b.getLong(this.f15098c, i);
    }

    public Uri getNotificationUri() {
        return null;
    }

    public int getPosition() {
        return this.f15098c;
    }

    public short getShort(int i) {
        return this.f15097b.getShort(this.f15098c, i);
    }

    public String getString(int i) {
        return this.f15097b.getString(this.f15098c, i);
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
        return this.f15098c == 0;
    }

    public boolean isLast() {
        return this.f15098c == this.f15099d - 1;
    }

    public boolean isNull(int i) {
        return this.f15097b.isNull(this.f15098c, i);
    }

    public boolean move(int i) {
        return moveToPosition(this.f15098c + i);
    }

    public boolean moveToFirst() {
        this.f15098c = 0;
        if (this.f15099d > 0) {
            return true;
        }
        return false;
    }

    public boolean moveToLast() {
        int i = this.f15099d;
        if (i <= 0) {
            return false;
        }
        this.f15098c = i - 1;
        return true;
    }

    public boolean moveToNext() {
        int i = this.f15098c;
        if (i >= this.f15099d - 1) {
            return false;
        }
        this.f15098c = i + 1;
        return true;
    }

    public boolean moveToPosition(int i) {
        if (i < 0 || i >= this.f15099d) {
            return false;
        }
        this.f15098c = i;
        return true;
    }

    public boolean moveToPrevious() {
        int i = this.f15098c;
        if (i <= 0) {
            return false;
        }
        this.f15098c = i - 1;
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
