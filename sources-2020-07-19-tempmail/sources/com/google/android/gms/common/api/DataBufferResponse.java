package com.google.android.gms.common.api;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.data.AbstractDataBuffer;
import com.google.android.gms.common.data.DataBuffer;
import java.util.Iterator;

@KeepForSdk
public class DataBufferResponse<T, R extends AbstractDataBuffer<T> & Result> extends Response<R> implements DataBuffer<T> {
    public T get(int i) {
        return ((AbstractDataBuffer) c()).get(i);
    }

    public int getCount() {
        return ((AbstractDataBuffer) c()).getCount();
    }

    public Iterator<T> iterator() {
        return ((AbstractDataBuffer) c()).iterator();
    }

    public void release() {
        ((AbstractDataBuffer) c()).release();
    }
}
