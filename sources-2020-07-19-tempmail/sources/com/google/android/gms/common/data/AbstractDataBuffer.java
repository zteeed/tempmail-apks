package com.google.android.gms.common.data;

import java.util.Iterator;

public abstract class AbstractDataBuffer<T> implements DataBuffer<T> {

    /* renamed from: b  reason: collision with root package name */
    protected final DataHolder f2922b;

    public abstract T get(int i);

    public int getCount() {
        DataHolder dataHolder = this.f2922b;
        if (dataHolder == null) {
            return 0;
        }
        return dataHolder.getCount();
    }

    public Iterator<T> iterator() {
        return new DataBufferIterator(this);
    }

    public void release() {
        DataHolder dataHolder = this.f2922b;
        if (dataHolder != null) {
            dataHolder.close();
        }
    }
}
