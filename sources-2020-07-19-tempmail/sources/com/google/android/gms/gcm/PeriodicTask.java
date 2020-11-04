package com.google.android.gms.gcm;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.gcm.Task;

public class PeriodicTask extends Task {
    public static final Parcelable.Creator<PeriodicTask> CREATOR = new f();
    protected long k;
    protected long l;

    public static class Builder extends Task.Builder {
        /* access modifiers changed from: private */
        public long j = -1;
        /* access modifiers changed from: private */
        public long k = -1;

        public Builder() {
            this.f3240e = true;
        }

        /* access modifiers changed from: protected */
        public void a() {
            super.a();
            long j2 = this.j;
            if (j2 == -1) {
                throw new IllegalArgumentException("Must call setPeriod(long) to establish an execution interval for this periodic task.");
            } else if (j2 > 0) {
                long j3 = this.k;
                if (j3 == -1) {
                    this.k = (long) (((float) j2) * 0.1f);
                } else if (j3 > j2) {
                    this.k = j2;
                }
            } else {
                long j4 = this.j;
                StringBuilder sb = new StringBuilder(66);
                sb.append("Period set cannot be less than or equal to 0: ");
                sb.append(j4);
                throw new IllegalArgumentException(sb.toString());
            }
        }

        public PeriodicTask b() {
            a();
            return new PeriodicTask(this, (f) null);
        }

        public Builder c(long j2) {
            this.k = j2;
            return this;
        }

        public Builder d(long j2) {
            this.j = j2;
            return this;
        }

        public Builder e(boolean z) {
            this.f3240e = z;
            return this;
        }

        public Builder f(int i) {
            this.f3236a = i;
            return this;
        }

        public Builder g(Class<? extends GcmTaskService> cls) {
            this.f3237b = cls.getName();
            return this;
        }

        public Builder h(String str) {
            this.f3238c = str;
            return this;
        }

        public Builder i(boolean z) {
            this.f3239d = z;
            return this;
        }
    }

    private PeriodicTask(Builder builder) {
        super((Task.Builder) builder);
        this.k = -1;
        this.l = -1;
        this.k = builder.j;
        this.l = Math.min(builder.k, this.k);
    }

    public void c(Bundle bundle) {
        super.c(bundle);
        bundle.putLong("period", this.k);
        bundle.putLong("period_flex", this.l);
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
        StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 54);
        sb.append(obj);
        sb.append(" period=");
        sb.append(h);
        sb.append(" flex=");
        sb.append(g);
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeLong(this.k);
        parcel.writeLong(this.l);
    }

    @Deprecated
    private PeriodicTask(Parcel parcel) {
        super(parcel);
        this.k = -1;
        this.l = -1;
        this.k = parcel.readLong();
        this.l = Math.min(parcel.readLong(), this.k);
    }

    /* synthetic */ PeriodicTask(Parcel parcel, f fVar) {
        this(parcel);
    }

    /* synthetic */ PeriodicTask(Builder builder, f fVar) {
        this(builder);
    }
}
