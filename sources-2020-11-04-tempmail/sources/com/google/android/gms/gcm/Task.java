package com.google.android.gms.gcm;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.ShowFirstParty;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;

public class Task implements ReflectedParcelable {

    /* renamed from: b  reason: collision with root package name */
    private final String f3414b;

    /* renamed from: c  reason: collision with root package name */
    private final String f3415c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f3416d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f3417e;

    /* renamed from: f  reason: collision with root package name */
    private final int f3418f;
    private final Set<Uri> g;
    private final boolean h;
    private final zzl i;
    private final Bundle j;

    public static abstract class Builder {

        /* renamed from: a  reason: collision with root package name */
        protected int f3419a;

        /* renamed from: b  reason: collision with root package name */
        protected String f3420b;

        /* renamed from: c  reason: collision with root package name */
        protected String f3421c;

        /* renamed from: d  reason: collision with root package name */
        protected boolean f3422d;

        /* renamed from: e  reason: collision with root package name */
        protected boolean f3423e;

        /* renamed from: f  reason: collision with root package name */
        protected boolean f3424f;
        protected Set<Uri> g = Collections.emptySet();
        @ShowFirstParty
        protected zzl h = zzl.f3435d;
        protected Bundle i;

        /* access modifiers changed from: protected */
        public void a() {
            Preconditions.b(this.f3420b != null, "Must provide an endpoint for this task by calling setService(ComponentName).");
            GcmNetworkManager.d(this.f3421c);
            zzl zzl = this.h;
            if (zzl != null) {
                int b2 = zzl.b();
                if (b2 == 1 || b2 == 0) {
                    int c2 = zzl.c();
                    int d2 = zzl.d();
                    if (b2 == 0 && c2 < 0) {
                        StringBuilder sb = new StringBuilder(52);
                        sb.append("InitialBackoffSeconds can't be negative: ");
                        sb.append(c2);
                        throw new IllegalArgumentException(sb.toString());
                    } else if (b2 == 1 && c2 < 10) {
                        throw new IllegalArgumentException("RETRY_POLICY_LINEAR must have an initial backoff at least 10 seconds.");
                    } else if (d2 < c2) {
                        int d3 = zzl.d();
                        StringBuilder sb2 = new StringBuilder(77);
                        sb2.append("MaximumBackoffSeconds must be greater than InitialBackoffSeconds: ");
                        sb2.append(d3);
                        throw new IllegalArgumentException(sb2.toString());
                    }
                } else {
                    StringBuilder sb3 = new StringBuilder(45);
                    sb3.append("Must provide a valid RetryPolicy: ");
                    sb3.append(b2);
                    throw new IllegalArgumentException(sb3.toString());
                }
            }
            if (this.f3423e) {
                Task.f(this.i);
            }
            if (this.g.isEmpty() || this.f3419a != 2) {
                for (Uri e2 : this.g) {
                    Task.d(e2);
                }
                return;
            }
            throw new IllegalArgumentException("Required URIs may not be used with NETWORK_STATE_ANY");
        }
    }

    Task(Builder builder) {
        this.f3414b = builder.f3420b;
        this.f3415c = builder.f3421c;
        this.f3416d = builder.f3422d;
        this.f3417e = builder.f3423e;
        this.f3418f = builder.f3419a;
        this.g = builder.g;
        this.h = builder.f3424f;
        this.j = builder.i;
        zzl zzl = builder.h;
        this.i = zzl == null ? zzl.f3435d : zzl;
    }

    /* access modifiers changed from: private */
    public static void d(Uri uri) {
        if (uri != null) {
            String scheme = uri.getScheme();
            String host = uri.getHost();
            if (TextUtils.isEmpty(host) || "null".equals(host)) {
                throw new IllegalArgumentException("URI hostname is required");
            }
            try {
                int port = uri.getPort();
                if ("tcp".equals(scheme)) {
                    if (port <= 0 || port > 65535) {
                        int port2 = uri.getPort();
                        StringBuilder sb = new StringBuilder(38);
                        sb.append("Invalid required URI port: ");
                        sb.append(port2);
                        throw new IllegalArgumentException(sb.toString());
                    }
                } else if (!"ping".equals(scheme)) {
                    String valueOf = String.valueOf(scheme);
                    throw new IllegalArgumentException(valueOf.length() != 0 ? "Unsupported required URI scheme: ".concat(valueOf) : new String("Unsupported required URI scheme: "));
                } else if (port != -1) {
                    throw new IllegalArgumentException("Ping does not support port numbers");
                }
            } catch (NumberFormatException e2) {
                String valueOf2 = String.valueOf(e2.getMessage());
                throw new IllegalArgumentException(valueOf2.length() != 0 ? "Invalid port number: ".concat(valueOf2) : new String("Invalid port number: "));
            }
        } else {
            throw new IllegalArgumentException("Null URI");
        }
    }

    public static void f(Bundle bundle) {
        if (bundle != null) {
            Parcel obtain = Parcel.obtain();
            bundle.writeToParcel(obtain, 0);
            int dataSize = obtain.dataSize();
            obtain.recycle();
            if (dataSize <= 10240) {
                for (String str : bundle.keySet()) {
                    Object obj = bundle.get(str);
                    if (!((obj instanceof Integer) || (obj instanceof Long) || (obj instanceof Double) || (obj instanceof String) || (obj instanceof Boolean))) {
                        if (obj instanceof Bundle) {
                            f((Bundle) obj);
                        } else {
                            throw new IllegalArgumentException("Only the following extra parameter types are supported: Integer, Long, Double, String, Boolean, and nested Bundles with the same restrictions.");
                        }
                    }
                }
                return;
            }
            StringBuilder sb = new StringBuilder(55);
            sb.append("Extras exceeding maximum size(10240 bytes): ");
            sb.append(dataSize);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    public String a() {
        return this.f3414b;
    }

    public String b() {
        return this.f3415c;
    }

    public void c(Bundle bundle) {
        bundle.putString("tag", this.f3415c);
        bundle.putBoolean("update_current", this.f3416d);
        bundle.putBoolean("persisted", this.f3417e);
        bundle.putString("service", this.f3414b);
        bundle.putInt("requiredNetwork", this.f3418f);
        if (!this.g.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (Uri uri : this.g) {
                arrayList.add(uri.toString());
            }
            bundle.putStringArrayList("reachabilityUris", arrayList);
        }
        bundle.putBoolean("requiresCharging", this.h);
        bundle.putBoolean("requiresIdle", false);
        zzl zzl = this.i;
        Bundle bundle2 = new Bundle();
        zzl.a(bundle2);
        bundle.putBundle("retryStrategy", bundle2);
        bundle.putBundle("extras", this.j);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f3414b);
        parcel.writeString(this.f3415c);
        parcel.writeInt(this.f3416d ? 1 : 0);
        parcel.writeInt(this.f3417e ? 1 : 0);
    }

    @Deprecated
    Task(Parcel parcel) {
        Log.e("Task", "Constructing a Task object using a parcel.");
        this.f3414b = parcel.readString();
        this.f3415c = parcel.readString();
        boolean z = true;
        this.f3416d = parcel.readInt() == 1;
        this.f3417e = parcel.readInt() != 1 ? false : z;
        this.f3418f = 2;
        this.g = Collections.emptySet();
        this.h = false;
        this.i = zzl.f3435d;
        this.j = null;
    }
}
