package com.google.android.gms.measurement;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.zzae;
import com.google.android.gms.measurement.internal.zzfy;
import com.google.android.gms.measurement.internal.zzgw;
import com.google.android.gms.measurement.internal.zzgx;
import com.google.android.gms.measurement.internal.zzgy;
import com.google.android.gms.measurement.internal.zzgz;
import com.google.android.gms.measurement.internal.zzha;
import com.google.android.gms.measurement.internal.zzhb;
import com.google.android.gms.measurement.internal.zzia;
import com.google.firebase.crashlytics.internal.analytics.AnalyticsConnectorReceiver;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@ShowFirstParty
@KeepForSdk
@Deprecated
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.4.3 */
public class AppMeasurement {

    /* renamed from: d  reason: collision with root package name */
    private static volatile AppMeasurement f9892d;

    /* renamed from: a  reason: collision with root package name */
    private final zzfy f9893a;

    /* renamed from: b  reason: collision with root package name */
    private final zzia f9894b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f9895c;

    @ShowFirstParty
    @KeepForSdk
    /* compiled from: com.google.android.gms:play-services-measurement-impl@@17.4.3 */
    public static class ConditionalUserProperty {
        @ShowFirstParty
        @KeepForSdk
        @Keep
        public boolean mActive;
        @ShowFirstParty
        @KeepForSdk
        @Keep
        public String mAppId;
        @ShowFirstParty
        @KeepForSdk
        @Keep
        public long mCreationTimestamp;
        @Keep
        public String mExpiredEventName;
        @Keep
        public Bundle mExpiredEventParams;
        @ShowFirstParty
        @KeepForSdk
        @Keep
        public String mName;
        @ShowFirstParty
        @KeepForSdk
        @Keep
        public String mOrigin;
        @ShowFirstParty
        @KeepForSdk
        @Keep
        public long mTimeToLive;
        @Keep
        public String mTimedOutEventName;
        @Keep
        public Bundle mTimedOutEventParams;
        @ShowFirstParty
        @KeepForSdk
        @Keep
        public String mTriggerEventName;
        @ShowFirstParty
        @KeepForSdk
        @Keep
        public long mTriggerTimeout;
        @Keep
        public String mTriggeredEventName;
        @Keep
        public Bundle mTriggeredEventParams;
        @ShowFirstParty
        @KeepForSdk
        @Keep
        public long mTriggeredTimestamp;
        @ShowFirstParty
        @KeepForSdk
        @Keep
        public Object mValue;

        @KeepForSdk
        public ConditionalUserProperty() {
        }

        /* access modifiers changed from: package-private */
        @VisibleForTesting
        public final Bundle a() {
            Bundle bundle = new Bundle();
            String str = this.mAppId;
            if (str != null) {
                bundle.putString("app_id", str);
            }
            String str2 = this.mOrigin;
            if (str2 != null) {
                bundle.putString("origin", str2);
            }
            String str3 = this.mName;
            if (str3 != null) {
                bundle.putString(AnalyticsConnectorReceiver.EVENT_NAME_KEY, str3);
            }
            Object obj = this.mValue;
            if (obj != null) {
                zzgx.b(bundle, obj);
            }
            String str4 = this.mTriggerEventName;
            if (str4 != null) {
                bundle.putString("trigger_event_name", str4);
            }
            bundle.putLong("trigger_timeout", this.mTriggerTimeout);
            String str5 = this.mTimedOutEventName;
            if (str5 != null) {
                bundle.putString("timed_out_event_name", str5);
            }
            Bundle bundle2 = this.mTimedOutEventParams;
            if (bundle2 != null) {
                bundle.putBundle("timed_out_event_params", bundle2);
            }
            String str6 = this.mTriggeredEventName;
            if (str6 != null) {
                bundle.putString("triggered_event_name", str6);
            }
            Bundle bundle3 = this.mTriggeredEventParams;
            if (bundle3 != null) {
                bundle.putBundle("triggered_event_params", bundle3);
            }
            bundle.putLong("time_to_live", this.mTimeToLive);
            String str7 = this.mExpiredEventName;
            if (str7 != null) {
                bundle.putString("expired_event_name", str7);
            }
            Bundle bundle4 = this.mExpiredEventParams;
            if (bundle4 != null) {
                bundle.putBundle("expired_event_params", bundle4);
            }
            bundle.putLong("creation_timestamp", this.mCreationTimestamp);
            bundle.putBoolean("active", this.mActive);
            bundle.putLong("triggered_timestamp", this.mTriggeredTimestamp);
            return bundle;
        }

        @VisibleForTesting
        ConditionalUserProperty(Bundle bundle) {
            Class cls = Long.class;
            Class cls2 = String.class;
            Preconditions.k(bundle);
            this.mAppId = (String) zzgx.a(bundle, "app_id", cls2, null);
            this.mOrigin = (String) zzgx.a(bundle, "origin", cls2, null);
            this.mName = (String) zzgx.a(bundle, AnalyticsConnectorReceiver.EVENT_NAME_KEY, cls2, null);
            this.mValue = zzgx.a(bundle, "value", Object.class, null);
            this.mTriggerEventName = (String) zzgx.a(bundle, "trigger_event_name", cls2, null);
            this.mTriggerTimeout = ((Long) zzgx.a(bundle, "trigger_timeout", cls, 0L)).longValue();
            this.mTimedOutEventName = (String) zzgx.a(bundle, "timed_out_event_name", cls2, null);
            this.mTimedOutEventParams = (Bundle) zzgx.a(bundle, "timed_out_event_params", Bundle.class, null);
            this.mTriggeredEventName = (String) zzgx.a(bundle, "triggered_event_name", cls2, null);
            this.mTriggeredEventParams = (Bundle) zzgx.a(bundle, "triggered_event_params", Bundle.class, null);
            this.mTimeToLive = ((Long) zzgx.a(bundle, "time_to_live", cls, 0L)).longValue();
            this.mExpiredEventName = (String) zzgx.a(bundle, "expired_event_name", cls2, null);
            this.mExpiredEventParams = (Bundle) zzgx.a(bundle, "expired_event_params", Bundle.class, null);
            this.mActive = ((Boolean) zzgx.a(bundle, "active", Boolean.class, Boolean.FALSE)).booleanValue();
            this.mCreationTimestamp = ((Long) zzgx.a(bundle, "creation_timestamp", cls, 0L)).longValue();
            this.mTriggeredTimestamp = ((Long) zzgx.a(bundle, "triggered_timestamp", cls, 0L)).longValue();
        }
    }

    @ShowFirstParty
    @KeepForSdk
    /* compiled from: com.google.android.gms:play-services-measurement-impl@@17.4.3 */
    public static final class Event extends zzgw {
        private Event() {
        }
    }

    @ShowFirstParty
    @KeepForSdk
    /* compiled from: com.google.android.gms:play-services-measurement-impl@@17.4.3 */
    public interface EventInterceptor extends zzhb {
    }

    @ShowFirstParty
    @KeepForSdk
    /* compiled from: com.google.android.gms:play-services-measurement-impl@@17.4.3 */
    public interface OnEventListener extends zzha {
    }

    @ShowFirstParty
    @KeepForSdk
    /* compiled from: com.google.android.gms:play-services-measurement-impl@@17.4.3 */
    public static final class Param extends zzgz {
        private Param() {
        }
    }

    @ShowFirstParty
    @KeepForSdk
    /* compiled from: com.google.android.gms:play-services-measurement-impl@@17.4.3 */
    public static final class UserProperty extends zzgy {
        private UserProperty() {
        }
    }

    private AppMeasurement(zzfy zzfy) {
        Preconditions.k(zzfy);
        this.f9893a = zzfy;
        this.f9894b = null;
        this.f9895c = false;
    }

    @VisibleForTesting
    private static AppMeasurement a(Context context, String str, String str2) {
        if (f9892d == null) {
            synchronized (AppMeasurement.class) {
                if (f9892d == null) {
                    zzia b2 = b(context, (Bundle) null);
                    if (b2 != null) {
                        f9892d = new AppMeasurement(b2);
                    } else {
                        f9892d = new AppMeasurement(zzfy.a(context, new zzae(0, 0, true, (String) null, (String) null, (String) null, (Bundle) null), (Long) null));
                    }
                }
            }
        }
        return f9892d;
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.google.android.gms.measurement.internal.zzia b(android.content.Context r7, android.os.Bundle r8) {
        /*
            r8 = 0
            java.lang.String r0 = "com.google.firebase.analytics.FirebaseAnalytics"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch:{ ClassNotFoundException -> 0x0027 }
            java.lang.String r1 = "getScionFrontendApiImplementation"
            r2 = 2
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch:{  }
            java.lang.Class<android.content.Context> r4 = android.content.Context.class
            r5 = 0
            r3[r5] = r4     // Catch:{  }
            java.lang.Class<android.os.Bundle> r4 = android.os.Bundle.class
            r6 = 1
            r3[r6] = r4     // Catch:{  }
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r1, r3)     // Catch:{  }
            java.lang.Object[] r1 = new java.lang.Object[r2]     // Catch:{  }
            r1[r5] = r7     // Catch:{  }
            r1[r6] = r8     // Catch:{  }
            java.lang.Object r7 = r0.invoke(r8, r1)     // Catch:{  }
            com.google.android.gms.measurement.internal.zzia r7 = (com.google.android.gms.measurement.internal.zzia) r7     // Catch:{  }
            return r7
        L_0x0027:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.AppMeasurement.b(android.content.Context, android.os.Bundle):com.google.android.gms.measurement.internal.zzia");
    }

    @ShowFirstParty
    @Keep
    @KeepForSdk
    @Deprecated
    public static AppMeasurement getInstance(Context context) {
        return a(context, (String) null, (String) null);
    }

    @Keep
    public void beginAdUnitExposure(String str) {
        if (this.f9895c) {
            this.f9894b.g(str);
        } else {
            this.f9893a.S().A(str, this.f9893a.n().b());
        }
    }

    @ShowFirstParty
    @KeepForSdk
    @Keep
    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        if (this.f9895c) {
            this.f9894b.j(str, str2, bundle);
        } else {
            this.f9893a.F().u0(str, str2, bundle);
        }
    }

    /* access modifiers changed from: protected */
    @Keep
    @VisibleForTesting
    public void clearConditionalUserPropertyAs(String str, String str2, String str3, Bundle bundle) {
        if (this.f9895c) {
            throw new IllegalStateException("Unexpected call on client side");
        }
        this.f9893a.F().W(str, str2, str3, bundle);
        throw null;
    }

    @Keep
    public void endAdUnitExposure(String str) {
        if (this.f9895c) {
            this.f9894b.G(str);
        } else {
            this.f9893a.S().E(str, this.f9893a.n().b());
        }
    }

    @Keep
    public long generateEventId() {
        if (this.f9895c) {
            return this.f9894b.e();
        }
        return this.f9893a.G().E0();
    }

    @Keep
    public String getAppInstanceId() {
        if (this.f9895c) {
            return this.f9894b.c();
        }
        return this.f9893a.F().e0();
    }

    @ShowFirstParty
    @Keep
    @KeepForSdk
    public List<ConditionalUserProperty> getConditionalUserProperties(String str, String str2) {
        List<Bundle> list;
        int i;
        if (this.f9895c) {
            list = this.f9894b.i(str, str2);
        } else {
            list = this.f9893a.F().C(str, str2);
        }
        if (list == null) {
            i = 0;
        } else {
            i = list.size();
        }
        ArrayList arrayList = new ArrayList(i);
        for (Bundle conditionalUserProperty : list) {
            arrayList.add(new ConditionalUserProperty(conditionalUserProperty));
        }
        return arrayList;
    }

    /* access modifiers changed from: protected */
    @Keep
    @VisibleForTesting
    public List<ConditionalUserProperty> getConditionalUserPropertiesAs(String str, String str2, String str3) {
        if (this.f9895c) {
            throw new IllegalStateException("Unexpected call on client side");
        }
        this.f9893a.F().D(str, str2, str3);
        throw null;
    }

    @Keep
    public String getCurrentScreenClass() {
        if (this.f9895c) {
            return this.f9894b.b();
        }
        return this.f9893a.F().h0();
    }

    @Keep
    public String getCurrentScreenName() {
        if (this.f9895c) {
            return this.f9894b.a();
        }
        return this.f9893a.F().g0();
    }

    @Keep
    public String getGmpAppId() {
        if (this.f9895c) {
            return this.f9894b.d();
        }
        return this.f9893a.F().i0();
    }

    @ShowFirstParty
    @KeepForSdk
    @Keep
    public int getMaxUserProperties(String str) {
        if (this.f9895c) {
            return this.f9894b.h(str);
        }
        this.f9893a.F();
        Preconditions.g(str);
        return 25;
    }

    /* access modifiers changed from: protected */
    @Keep
    @VisibleForTesting
    public Map<String, Object> getUserProperties(String str, String str2, boolean z) {
        if (this.f9895c) {
            return this.f9894b.f(str, str2, z);
        }
        return this.f9893a.F().F(str, str2, z);
    }

    /* access modifiers changed from: protected */
    @Keep
    @VisibleForTesting
    public Map<String, Object> getUserPropertiesAs(String str, String str2, String str3, boolean z) {
        if (this.f9895c) {
            throw new IllegalStateException("Unexpected call on client side");
        }
        this.f9893a.F().E(str, str2, str3, z);
        throw null;
    }

    @ShowFirstParty
    @Keep
    public void logEventInternal(String str, String str2, Bundle bundle) {
        if (this.f9895c) {
            this.f9894b.N(str, str2, bundle);
        } else {
            this.f9893a.F().R(str, str2, bundle);
        }
    }

    @ShowFirstParty
    @KeepForSdk
    @Keep
    public void setConditionalUserProperty(ConditionalUserProperty conditionalUserProperty) {
        Preconditions.k(conditionalUserProperty);
        if (this.f9895c) {
            this.f9894b.B(conditionalUserProperty.a());
        } else {
            this.f9893a.F().G(conditionalUserProperty.a());
        }
    }

    /* access modifiers changed from: protected */
    @Keep
    @VisibleForTesting
    public void setConditionalUserPropertyAs(ConditionalUserProperty conditionalUserProperty) {
        Preconditions.k(conditionalUserProperty);
        if (this.f9895c) {
            throw new IllegalStateException("Unexpected call on client side");
        }
        this.f9893a.F().m0(conditionalUserProperty.a());
        throw null;
    }

    private AppMeasurement(zzia zzia) {
        Preconditions.k(zzia);
        this.f9894b = zzia;
        this.f9893a = null;
        this.f9895c = true;
    }
}
