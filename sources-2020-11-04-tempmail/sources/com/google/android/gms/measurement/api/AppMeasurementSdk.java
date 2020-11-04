package com.google.android.gms.measurement.api;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.internal.measurement.zzag;
import com.google.android.gms.measurement.internal.zzha;
import com.google.android.gms.measurement.internal.zzhb;
import java.util.List;
import java.util.Map;

@KeepForSdk
/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@17.4.3 */
public class AppMeasurementSdk {

    /* renamed from: a  reason: collision with root package name */
    private final zzag f10085a;

    @KeepForSdk
    /* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@17.4.3 */
    public static final class ConditionalUserProperty {
        private ConditionalUserProperty() {
        }
    }

    @ShowFirstParty
    @KeepForSdk
    /* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@17.4.3 */
    public interface EventInterceptor extends zzhb {
    }

    @ShowFirstParty
    @KeepForSdk
    /* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@17.4.3 */
    public interface OnEventListener extends zzha {
    }

    public AppMeasurementSdk(zzag zzag) {
        this.f10085a = zzag;
    }

    @KeepForSdk
    public static AppMeasurementSdk k(Context context) {
        return zzag.b(context).f();
    }

    @KeepForSdk
    public static AppMeasurementSdk l(Context context, String str, String str2, String str3, Bundle bundle) {
        return zzag.c(context, str, str2, str3, bundle).f();
    }

    @KeepForSdk
    public void a(String str) {
        this.f10085a.B(str);
    }

    @KeepForSdk
    public void b(String str, String str2, Bundle bundle) {
        this.f10085a.C(str, str2, bundle);
    }

    @KeepForSdk
    public void c(String str) {
        this.f10085a.H(str);
    }

    @KeepForSdk
    public long d() {
        return this.f10085a.N();
    }

    @KeepForSdk
    public String e() {
        return this.f10085a.U();
    }

    @KeepForSdk
    public String f() {
        return this.f10085a.L();
    }

    @KeepForSdk
    public List<Bundle> g(String str, String str2) {
        return this.f10085a.z(str, str2);
    }

    @KeepForSdk
    public String h() {
        return this.f10085a.S();
    }

    @KeepForSdk
    public String i() {
        return this.f10085a.Q();
    }

    @KeepForSdk
    public String j() {
        return this.f10085a.G();
    }

    @KeepForSdk
    public int m(String str) {
        return this.f10085a.K(str);
    }

    @KeepForSdk
    public Map<String, Object> n(String str, String str2, boolean z) {
        return this.f10085a.h(str, str2, z);
    }

    @KeepForSdk
    public void o(String str, String str2, Bundle bundle) {
        this.f10085a.r(str, str2, bundle);
    }

    @KeepForSdk
    public void p(Bundle bundle) {
        this.f10085a.a(bundle, false);
    }

    @KeepForSdk
    public Bundle q(Bundle bundle) {
        return this.f10085a.a(bundle, true);
    }

    @ShowFirstParty
    @KeepForSdk
    public void r(OnEventListener onEventListener) {
        this.f10085a.o(onEventListener);
    }

    @KeepForSdk
    public void s(Bundle bundle) {
        this.f10085a.k(bundle);
    }

    @KeepForSdk
    public void t(Activity activity, String str, String str2) {
        this.f10085a.j(activity, str, str2);
    }

    @KeepForSdk
    public void u(String str, String str2, Object obj) {
        this.f10085a.t(str, str2, obj);
    }

    public final void v(boolean z) {
        this.f10085a.D(z);
    }
}
