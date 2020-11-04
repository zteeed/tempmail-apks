package com.google.android.gms.gcm;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.gcm.Task;

public class OneoffTask extends Task {
    public static final Parcelable.Creator<OneoffTask> CREATOR = new d();
    private final long k;
    private final long l;

    public static class Builder extends Task.Builder {
        private long j = -1;
        private long k = -1;

        public Builder() {
            this.f3240e = false;
        }
    }

    @Deprecated
    private OneoffTask(Parcel parcel) {
        super(parcel);
        this.k = parcel.readLong();
        this.l = parcel.readLong();
    }

    public void c(Bundle bundle) {
        super.c(bundle);
        bundle.putLong("window_start", this.k);
        bundle.putLong("window_end", this.l);
    }

    public long g() {
        return this.l;
    }

    public long h() {
        return this.k;
    }

    public String toString() {
        String obj = super.toString();
        long h = h();
        long g = g();
        StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 64);
        sb.append(obj);
        sb.append(" windowStart=");
        sb.append(h);
        sb.append(" windowEnd=");
        sb.append(g);
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeLong(this.k);
        parcel.writeLong(this.l);
    }

    /* synthetic */ OneoffTask(Parcel parcel, d dVar) {
        this(parcel);
    }
}
