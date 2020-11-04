package com.google.android.gms.common.data;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Iterator;
import java.util.NoSuchElementException;

@KeepForSdk
public class DataBufferIterator<T> implements Iterator<T> {

    /* renamed from: b  reason: collision with root package name */
    protected final DataBuffer<T> f2928b;

    /* renamed from: c  reason: collision with root package name */
    protected int f2929c = -1;

    public DataBufferIterator(DataBuffer<T> dataBuffer) {
        Preconditions.k(dataBuffer);
        this.f2928b = dataBuffer;
    }

    public boolean hasNext() {
        return this.f2929c < this.f2928b.getCount() - 1;
    }

    public T next() {
        if (hasNext()) {
            DataBuffer<T> dataBuffer = this.f2928b;
            int i = this.f2929c + 1;
            this.f2929c = i;
            return dataBuffer.get(i);
        }
        int i2 = this.f2929c;
        StringBuilder sb = new StringBuilder(46);
        sb.append("Cannot advance the iterator beyond ");
        sb.append(i2);
        throw new NoSuchElementException(sb.toString());
    }

    public void remove() {
        throw new UnsupportedOperationException("Cannot remove elements from a DataBufferIterator");
    }
}
