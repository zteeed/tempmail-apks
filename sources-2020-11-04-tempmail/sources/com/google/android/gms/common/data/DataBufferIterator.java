package com.google.android.gms.common.data;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Iterator;
import java.util.NoSuchElementException;

@KeepForSdk
public class DataBufferIterator<T> implements Iterator<T> {

    /* renamed from: b  reason: collision with root package name */
    protected final DataBuffer<T> f3116b;

    /* renamed from: c  reason: collision with root package name */
    protected int f3117c = -1;

    public DataBufferIterator(DataBuffer<T> dataBuffer) {
        Preconditions.k(dataBuffer);
        this.f3116b = dataBuffer;
    }

    public boolean hasNext() {
        return this.f3117c < this.f3116b.getCount() - 1;
    }

    public T next() {
        if (hasNext()) {
            DataBuffer<T> dataBuffer = this.f3116b;
            int i = this.f3117c + 1;
            this.f3117c = i;
            return dataBuffer.get(i);
        }
        int i2 = this.f3117c;
        StringBuilder sb = new StringBuilder(46);
        sb.append("Cannot advance the iterator beyond ");
        sb.append(i2);
        throw new NoSuchElementException(sb.toString());
    }

    public void remove() {
        throw new UnsupportedOperationException("Cannot remove elements from a DataBufferIterator");
    }
}
