package com.google.firebase.remoteconfig.internal;

import android.text.format.DateUtils;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigFetchThrottledException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigServerException;
import com.google.firebase.remoteconfig.internal.m;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.firebase:firebase-config@@19.1.4 */
public class k {
    public static final long j = TimeUnit.HOURS.toSeconds(12);
    static final int[] k = {2, 4, 8, 16, 32, 64, 128, 256};

    /* renamed from: a  reason: collision with root package name */
    private final FirebaseInstanceId f12046a;

    /* renamed from: b  reason: collision with root package name */
    private final com.google.firebase.analytics.a.a f12047b;

    /* renamed from: c  reason: collision with root package name */
    private final Executor f12048c;

    /* renamed from: d  reason: collision with root package name */
    private final Clock f12049d;

    /* renamed from: e  reason: collision with root package name */
    private final Random f12050e;

    /* renamed from: f  reason: collision with root package name */
    private final e f12051f;
    private final ConfigFetchHttpClient g;
    private final m h;
    private final Map<String, String> i;

    /* compiled from: com.google.firebase:firebase-config@@19.1.4 */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private final int f12052a;

        /* renamed from: b  reason: collision with root package name */
        private final f f12053b;

        /* renamed from: c  reason: collision with root package name */
        private final String f12054c;

        private a(Date date, int i, f fVar, String str) {
            this.f12052a = i;
            this.f12053b = fVar;
            this.f12054c = str;
        }

        public static a a(Date date) {
            return new a(date, 1, (f) null, (String) null);
        }

        public static a b(f fVar, String str) {
            return new a(fVar.e(), 0, fVar, str);
        }

        public static a c(Date date) {
            return new a(date, 2, (f) null, (String) null);
        }

        public f d() {
            return this.f12053b;
        }

        /* access modifiers changed from: package-private */
        public String e() {
            return this.f12054c;
        }

        /* access modifiers changed from: package-private */
        public int f() {
            return this.f12052a;
        }
    }

    public k(FirebaseInstanceId firebaseInstanceId, com.google.firebase.analytics.a.a aVar, Executor executor, Clock clock, Random random, e eVar, ConfigFetchHttpClient configFetchHttpClient, m mVar, Map<String, String> map) {
        this.f12046a = firebaseInstanceId;
        this.f12047b = aVar;
        this.f12048c = executor;
        this.f12049d = clock;
        this.f12050e = random;
        this.f12051f = eVar;
        this.g = configFetchHttpClient;
        this.h = mVar;
        this.i = map;
    }

    private boolean a(long j2, Date date) {
        Date d2 = this.h.d();
        if (d2.equals(m.f12059d)) {
            return false;
        }
        return date.before(new Date(d2.getTime() + TimeUnit.SECONDS.toMillis(j2)));
    }

    private FirebaseRemoteConfigServerException b(FirebaseRemoteConfigServerException firebaseRemoteConfigServerException) throws FirebaseRemoteConfigClientException {
        String str;
        int a2 = firebaseRemoteConfigServerException.a();
        if (a2 == 401) {
            str = "The request did not have the required credentials. Please make sure your google-services.json is valid.";
        } else if (a2 == 403) {
            str = "The user is not authorized to access the project. Please make sure you are using the API key that corresponds to your Firebase project.";
        } else if (a2 == 429) {
            throw new FirebaseRemoteConfigClientException("The throttled response from the server was not handled correctly by the FRC SDK.");
        } else if (a2 != 500) {
            switch (a2) {
                case 502:
                case 503:
                case 504:
                    str = "The server is unavailable. Please try again later.";
                    break;
                default:
                    str = "The server returned an unexpected error.";
                    break;
            }
        } else {
            str = "There was an internal server error.";
        }
        int a3 = firebaseRemoteConfigServerException.a();
        return new FirebaseRemoteConfigServerException(a3, "Fetch failed: " + str, firebaseRemoteConfigServerException);
    }

    private String c(long j2) {
        return String.format("Fetch is throttled. Please wait before calling fetch again: %s", new Object[]{DateUtils.formatElapsedTime(TimeUnit.MILLISECONDS.toSeconds(j2))});
    }

    private a e(com.google.firebase.iid.a aVar, Date date) throws FirebaseRemoteConfigException {
        try {
            a fetch = this.g.fetch(this.g.c(), aVar.h(), aVar.a(), j(), this.h.c(), this.i, date);
            if (fetch.e() != null) {
                this.h.i(fetch.e());
            }
            this.h.f();
            return fetch;
        } catch (FirebaseRemoteConfigServerException e2) {
            m.a q = q(e2.a(), date);
            if (p(q, e2.a())) {
                throw new FirebaseRemoteConfigFetchThrottledException(q.a().getTime());
            }
            throw b(e2);
        }
    }

    private Task<a> f(com.google.firebase.iid.a aVar, Date date) {
        try {
            a e2 = e(aVar, date);
            if (e2.f() != 0) {
                return Tasks.e(e2);
            }
            return this.f12051f.i(e2.d()).t(this.f12048c, j.a(e2));
        } catch (FirebaseRemoteConfigException e3) {
            return Tasks.d(e3);
        }
    }

    /* access modifiers changed from: private */
    public Task<a> g(Task<f> task, long j2) {
        Task<TContinuationResult> task2;
        Date date = new Date(this.f12049d.a());
        if (task.r() && a(j2, date)) {
            return Tasks.e(a.c(date));
        }
        Date h2 = h(date);
        if (h2 != null) {
            task2 = Tasks.d(new FirebaseRemoteConfigFetchThrottledException(c(h2.getTime() - date.getTime()), h2.getTime()));
        } else {
            task2 = this.f12046a.c().l(this.f12048c, h.a(this, date));
        }
        return task2.l(this.f12048c, i.a(this, date));
    }

    private Date h(Date date) {
        Date a2 = this.h.a().a();
        if (date.before(a2)) {
            return a2;
        }
        return null;
    }

    private long i(int i2) {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        int[] iArr = k;
        long millis = timeUnit.toMillis((long) iArr[Math.min(i2, iArr.length) - 1]);
        return (millis / 2) + ((long) this.f12050e.nextInt((int) millis));
    }

    private Map<String, String> j() {
        HashMap hashMap = new HashMap();
        com.google.firebase.analytics.a.a aVar = this.f12047b;
        if (aVar == null) {
            return hashMap;
        }
        for (Map.Entry next : aVar.a(false).entrySet()) {
            hashMap.put((String) next.getKey(), next.getValue().toString());
        }
        return hashMap;
    }

    private boolean k(int i2) {
        return i2 == 429 || i2 == 502 || i2 == 503 || i2 == 504;
    }

    static /* synthetic */ Task n(k kVar, Date date, Task task) throws Exception {
        if (!task.r()) {
            return Tasks.d(new FirebaseRemoteConfigClientException("Failed to get Firebase Instance ID token for fetch.", task.m()));
        }
        return kVar.f((com.google.firebase.iid.a) task.n(), date);
    }

    private boolean p(m.a aVar, int i2) {
        return aVar.b() > 1 || i2 == 429;
    }

    private m.a q(int i2, Date date) {
        if (k(i2)) {
            r(date);
        }
        return this.h.a();
    }

    private void r(Date date) {
        int b2 = this.h.a().b() + 1;
        this.h.g(b2, new Date(date.getTime() + i(b2)));
    }

    /* access modifiers changed from: private */
    public void s(Task<a> task, Date date) {
        if (task.r()) {
            this.h.k(date);
            return;
        }
        Exception m = task.m();
        if (m != null) {
            if (m instanceof FirebaseRemoteConfigFetchThrottledException) {
                this.h.l();
            } else {
                this.h.j();
            }
        }
    }

    public Task<a> d(long j2) {
        if (this.h.e()) {
            j2 = 0;
        }
        return this.f12051f.c().l(this.f12048c, g.a(this, j2));
    }
}
