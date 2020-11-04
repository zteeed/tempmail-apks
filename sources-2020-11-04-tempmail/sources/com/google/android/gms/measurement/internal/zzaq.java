package com.google.android.gms.measurement.internal;

import android.content.Context;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.zzch;
import com.google.android.gms.internal.measurement.zzcw;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

@VisibleForTesting
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.4.3 */
public final class zzaq {
    public static zzen<Long> A = a("measurement.upload.initial_upload_delay_time", 15000L, 15000L, d0.f10144a);
    public static zzen<Boolean> A0;
    public static zzen<Long> B = a("measurement.upload.retry_time", 1800000L, 1800000L, c0.f10123a);
    public static zzen<Boolean> B0;
    public static zzen<Integer> C = a("measurement.upload.retry_count", 6, 6, f0.f10175a);
    public static zzen<Boolean> C0;
    public static zzen<Long> D = a("measurement.upload.max_queue_time", 2419200000L, 2419200000L, e0.f10158a);
    public static zzen<Boolean> D0;
    public static zzen<Integer> E = a("measurement.lifetimevalue.max_currency_tracked", 4, 4, h0.f10218a);
    public static zzen<Boolean> E0;
    public static zzen<Integer> F = a("measurement.audience.filter_result_max_count", 200, 200, j0.f10252a);
    public static zzen<Boolean> F0;
    public static zzen<Integer> G = a("measurement.upload.max_public_user_properties", 25, 25, (g3) null);
    public static zzen<Boolean> G0;
    public static zzen<Integer> H = a("measurement.upload.max_event_name_cardinality", 500, 500, (g3) null);
    public static zzen<Boolean> H0;
    public static zzen<Integer> I = a("measurement.upload.max_public_event_params", 25, 25, (g3) null);
    public static zzen<Boolean> I0;
    public static zzen<Long> J = a("measurement.service_client.idle_disconnect_millis", 5000L, 5000L, i0.f10233a);
    public static zzen<Boolean> J0;
    public static zzen<Boolean> K;
    public static zzen<Boolean> K0;
    public static zzen<String> L = a("measurement.test.string_flag", "---", "---", k0.f10268a);
    public static zzen<Boolean> L0;
    public static zzen<Long> M = a("measurement.test.long_flag", -1L, -1L, n0.f10318a);
    public static zzen<Boolean> M0;
    public static zzen<Integer> N = a("measurement.test.int_flag", -2, -2, m0.f10298a);
    public static zzen<Boolean> N0;
    public static zzen<Double> O;
    public static zzen<Boolean> O0;
    public static zzen<Integer> P = a("measurement.experiment.max_ids", 50, 50, o0.f10331a);
    public static zzen<Boolean> P0;
    public static zzen<Integer> Q = a("measurement.max_bundles_per_iteration", 2, 2, r0.f10395a);
    public static zzen<Boolean> Q0;
    public static zzen<Boolean> R;
    public static zzen<Boolean> R0;
    public static zzen<Boolean> S;
    public static zzen<Long> S0 = a("measurement.sdk.attribution.cache.ttl", 604800000L, 604800000L, b3.f10112a);
    public static zzen<Boolean> T;
    public static zzen<Boolean> T0;
    public static zzen<Boolean> U;
    public static zzen<Boolean> V;
    public static zzen<Boolean> W;
    public static zzen<Boolean> X;
    public static zzen<Boolean> Y;
    public static zzen<Boolean> Z;
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static List<zzen<?>> f10567a = Collections.synchronizedList(new ArrayList());
    public static zzen<Boolean> a0;

    /* renamed from: b  reason: collision with root package name */
    public static zzen<Long> f10568b = a("measurement.ad_id_cache_time", 10000L, 10000L, k.f10267a);
    public static zzen<Boolean> b0;

    /* renamed from: c  reason: collision with root package name */
    public static zzen<Long> f10569c = a("measurement.monitoring.sample_period_millis", 86400000L, 86400000L, j.f10251a);
    public static zzen<Boolean> c0;

    /* renamed from: d  reason: collision with root package name */
    public static zzen<Long> f10570d = a("measurement.config.cache_time", 86400000L, 3600000L, x.f10496a);
    public static zzen<Boolean> d0;

    /* renamed from: e  reason: collision with root package name */
    public static zzen<String> f10571e = a("measurement.config.url_scheme", "https", "https", g0.f10195a);
    public static zzen<Boolean> e0;

    /* renamed from: f  reason: collision with root package name */
    public static zzen<String> f10572f = a("measurement.config.url_authority", "app-measurement.com", "app-measurement.com", u0.f10446a);
    public static zzen<Boolean> f0;
    public static zzen<Integer> g = a("measurement.upload.max_bundles", 100, 100, d1.f10145a);
    public static zzen<Boolean> g0;
    public static zzen<Integer> h = a("measurement.upload.max_batch_size", 65536, 65536, q1.f10371a);
    public static zzen<Boolean> h0;
    public static zzen<Integer> i = a("measurement.upload.max_bundle_size", 65536, 65536, a2.f10092a);
    public static zzen<Boolean> i0;
    public static zzen<Integer> j = a("measurement.upload.max_events_per_bundle", 1000, 1000, n2.f10320a);
    public static zzen<Boolean> j0;
    public static zzen<Integer> k = a("measurement.upload.max_events_per_day", 100000, 100000, x2.f10499a);
    public static zzen<Boolean> k0;
    public static zzen<Integer> l = a("measurement.upload.max_error_events_per_day", 1000, 1000, m.f10297a);
    public static zzen<Boolean> l0;
    public static zzen<Integer> m = a("measurement.upload.max_public_events_per_day", 50000, 50000, l.f10284a);
    public static zzen<Boolean> m0;
    public static zzen<Integer> n = a("measurement.upload.max_conversions_per_day", 10000, 10000, o.f10330a);
    public static zzen<Boolean> n0;
    public static zzen<Integer> o = a("measurement.upload.max_realtime_events_per_day", 10, 10, n.f10317a);
    public static zzen<Boolean> o0;
    public static zzen<Integer> p = a("measurement.store.max_stored_events_per_app", 100000, 100000, q.f10369a);
    public static zzen<Boolean> p0;
    public static zzen<String> q = a("measurement.upload.url", "https://app-measurement.com/a", "https://app-measurement.com/a", p.f10348a);
    public static zzen<Boolean> q0;
    public static zzen<Long> r = a("measurement.upload.backoff_period", 43200000L, 43200000L, t.f10429a);
    public static zzen<Boolean> r0;
    public static zzen<Long> s = a("measurement.upload.window_interval", 3600000L, 3600000L, s.f10407a);
    public static zzen<Boolean> s0;
    public static zzen<Long> t = a("measurement.upload.interval", 3600000L, 3600000L, v.f10458a);
    public static zzen<Boolean> t0;
    public static zzen<Long> u = a("measurement.upload.realtime_upload_interval", 10000L, 10000L, u.f10445a);
    public static zzen<Boolean> u0;
    public static zzen<Long> v = a("measurement.upload.debug_upload_interval", 1000L, 1000L, w.f10476a);
    public static zzen<Boolean> v0;
    public static zzen<Long> w = a("measurement.upload.minimum_delay", 500L, 500L, z.f10529a);
    public static zzen<Boolean> w0;
    public static zzen<Long> x = a("measurement.alarm_manager.minimum_interval", 60000L, 60000L, y.f10512a);
    public static zzen<Boolean> x0;
    public static zzen<Long> y = a("measurement.upload.stale_data_deletion_interval", 86400000L, 86400000L, b0.f10109a);
    public static zzen<Boolean> y0;
    public static zzen<Long> z = a("measurement.upload.refresh_blacklisted_config_interval", 604800000L, 604800000L, a0.f10090a);
    public static zzen<Boolean> z0;

    static {
        Collections.synchronizedSet(new HashSet());
        Boolean bool = Boolean.FALSE;
        K = a("measurement.test.boolean_flag", bool, bool, l0.f10285a);
        Double valueOf = Double.valueOf(-3.0d);
        O = a("measurement.test.double_flag", valueOf, valueOf, p0.f10349a);
        Boolean bool2 = Boolean.FALSE;
        R = a("measurement.validation.internal_limits_internal_event_params", bool2, bool2, q0.f10370a);
        Boolean bool3 = Boolean.TRUE;
        S = a("measurement.referrer.enable_logging_install_referrer_cmp_from_apk", bool3, bool3, t0.f10430a);
        Boolean bool4 = Boolean.TRUE;
        T = a("measurement.collection.firebase_global_collection_flag_enabled", bool4, bool4, w0.f10477a);
        Boolean bool5 = Boolean.TRUE;
        U = a("measurement.collection.efficient_engagement_reporting_enabled_2", bool5, bool5, v0.f10459a);
        Boolean bool6 = Boolean.FALSE;
        V = a("measurement.collection.redundant_engagement_removal_enabled", bool6, bool6, y0.f10513a);
        Boolean bool7 = Boolean.TRUE;
        W = a("measurement.client.freeride_engagement_fix", bool7, bool7, x0.f10497a);
        Boolean bool8 = Boolean.TRUE;
        X = a("measurement.experiment.enable_experiment_reporting", bool8, bool8, a1.f10091a);
        Boolean bool9 = Boolean.TRUE;
        Y = a("measurement.collection.log_event_and_bundle_v2", bool9, bool9, z0.f10530a);
        Boolean bool10 = Boolean.FALSE;
        Z = a("measurement.quality.checksum", bool10, bool10, (g3) null);
        Boolean bool11 = Boolean.FALSE;
        a0 = a("measurement.sdk.dynamite.allow_remote_dynamite2", bool11, bool11, c1.f10124a);
        Boolean bool12 = Boolean.TRUE;
        b0 = a("measurement.sdk.collection.validate_param_names_alphabetical", bool12, bool12, b1.f10110a);
        Boolean bool13 = Boolean.TRUE;
        c0 = a("measurement.collection.event_safelist", bool13, bool13, e1.f10159a);
        Boolean bool14 = Boolean.TRUE;
        a("measurement.service.audience.invalidate_config_cache_after_app_unisntall", bool14, bool14, g1.f10196a);
        Boolean bool15 = Boolean.TRUE;
        d0 = a("measurement.service.audience.fix_skip_audience_with_failed_filters", bool15, bool15, f1.f10176a);
        Boolean bool16 = Boolean.FALSE;
        e0 = a("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", bool16, bool16, i1.f10234a);
        Boolean bool17 = Boolean.FALSE;
        f0 = a("measurement.audience.refresh_event_count_filters_timestamp", bool17, bool17, h1.f10219a);
        Boolean bool18 = Boolean.FALSE;
        g0 = a("measurement.audience.use_bundle_timestamp_for_event_count_filters", bool18, bool18, k1.f10269a);
        Boolean bool19 = Boolean.TRUE;
        h0 = a("measurement.sdk.collection.retrieve_deeplink_from_bow_2", bool19, bool19, j1.f10253a);
        Boolean bool20 = Boolean.TRUE;
        i0 = a("measurement.sdk.collection.last_deep_link_referrer2", bool20, bool20, m1.f10299a);
        Boolean bool21 = Boolean.FALSE;
        j0 = a("measurement.sdk.collection.last_deep_link_referrer_campaign2", bool21, bool21, l1.f10286a);
        Boolean bool22 = Boolean.FALSE;
        k0 = a("measurement.sdk.collection.last_gclid_from_referrer2", bool22, bool22, o1.f10332a);
        Boolean bool23 = Boolean.TRUE;
        l0 = a("measurement.sdk.collection.enable_extend_user_property_size", bool23, bool23, n1.f10319a);
        Boolean bool24 = Boolean.FALSE;
        m0 = a("measurement.upload.file_lock_state_check", bool24, bool24, p1.f10350a);
        Boolean bool25 = Boolean.TRUE;
        n0 = a("measurement.sampling.calculate_bundle_timestamp_before_sampling", bool25, bool25, s1.f10411a);
        Boolean bool26 = Boolean.FALSE;
        o0 = a("measurement.ga.ga_app_id", bool26, bool26, r1.f10396a);
        Boolean bool27 = Boolean.TRUE;
        p0 = a("measurement.lifecycle.app_backgrounded_tracking", bool27, bool27, v1.f10460a);
        Boolean bool28 = Boolean.FALSE;
        q0 = a("measurement.lifecycle.app_in_background_parameter", bool28, bool28, u1.f10447a);
        Boolean bool29 = Boolean.FALSE;
        r0 = a("measurement.integration.disable_firebase_instance_id", bool29, bool29, x1.f10498a);
        Boolean bool30 = Boolean.FALSE;
        s0 = a("measurement.lifecycle.app_backgrounded_engagement", bool30, bool30, w1.f10478a);
        Boolean bool31 = Boolean.FALSE;
        t0 = a("measurement.collection.service.update_with_analytics_fix", bool31, bool31, z1.f10531a);
        Boolean bool32 = Boolean.FALSE;
        u0 = a("measurement.service.use_appinfo_modified", bool32, bool32, y1.f10514a);
        Boolean bool33 = Boolean.TRUE;
        v0 = a("measurement.client.firebase_feature_rollout.v1.enable", bool33, bool33, b2.f10111a);
        Boolean bool34 = Boolean.TRUE;
        w0 = a("measurement.client.sessions.check_on_reset_and_enable2", bool34, bool34, d2.f10146a);
        Boolean bool35 = Boolean.TRUE;
        x0 = a("measurement.config.string.always_update_disk_on_set", bool35, bool35, c2.f10125a);
        Boolean bool36 = Boolean.FALSE;
        y0 = a("measurement.scheduler.task_thread.cleanup_on_exit", bool36, bool36, f2.f10177a);
        Boolean bool37 = Boolean.FALSE;
        z0 = a("measurement.upload.file_truncate_fix", bool37, bool37, e2.f10160a);
        Boolean bool38 = Boolean.TRUE;
        A0 = a("measurement.engagement_time_main_thread", bool38, bool38, h2.f10220a);
        Boolean bool39 = Boolean.FALSE;
        B0 = a("measurement.sdk.referrer.delayed_install_referrer_api", bool39, bool39, g2.f10197a);
        Boolean bool40 = Boolean.FALSE;
        C0 = a("measurement.sdk.screen.disabling_automatic_reporting", bool40, bool40, j2.f10254a);
        Boolean bool41 = Boolean.FALSE;
        D0 = a("measurement.sdk.screen.manual_screen_view_logging", bool41, bool41, i2.f10235a);
        Boolean bool42 = Boolean.TRUE;
        E0 = a("measurement.gold.enhanced_ecommerce.format_logs", bool42, bool42, l2.f10287a);
        Boolean bool43 = Boolean.TRUE;
        F0 = a("measurement.gold.enhanced_ecommerce.nested_param_daily_event_count", bool43, bool43, k2.f10270a);
        Boolean bool44 = Boolean.TRUE;
        G0 = a("measurement.gold.enhanced_ecommerce.upload_nested_complex_events", bool44, bool44, m2.f10300a);
        Boolean bool45 = Boolean.TRUE;
        H0 = a("measurement.gold.enhanced_ecommerce.log_nested_complex_events", bool45, bool45, p2.f10351a);
        Boolean bool46 = Boolean.TRUE;
        I0 = a("measurement.gold.enhanced_ecommerce.updated_schema.client", bool46, bool46, o2.f10333a);
        Boolean bool47 = Boolean.TRUE;
        J0 = a("measurement.gold.enhanced_ecommerce.updated_schema.service", bool47, bool47, r2.f10397a);
        Boolean bool48 = Boolean.FALSE;
        a("measurement.collection.synthetic_data_mitigation", bool48, bool48, q2.f10372a);
        Boolean bool49 = Boolean.FALSE;
        K0 = a("measurement.service.configurable_service_limits", bool49, bool49, t2.f10431a);
        Boolean bool50 = Boolean.FALSE;
        L0 = a("measurement.client.configurable_service_limits", bool50, bool50, s2.f10412a);
        Boolean bool51 = Boolean.TRUE;
        M0 = a("measurement.androidId.delete_feature", bool51, bool51, w2.f10479a);
        Boolean bool52 = Boolean.FALSE;
        N0 = a("measurement.client.global_params.dev", bool52, bool52, v2.f10461a);
        Boolean bool53 = Boolean.FALSE;
        O0 = a("measurement.service.global_params", bool53, bool53, y2.f10515a);
        Boolean bool54 = Boolean.TRUE;
        P0 = a("measurement.service.global_params_in_payload", bool54, bool54, a3.f10093a);
        Boolean bool55 = Boolean.TRUE;
        Q0 = a("measurement.client.string_reader", bool55, bool55, z2.f10532a);
        Boolean bool56 = Boolean.TRUE;
        R0 = a("measurement.sdk.attribution.cache", bool56, bool56, c3.f10126a);
        Boolean bool57 = Boolean.TRUE;
        T0 = a("measurement.service.database_return_empty_collection", bool57, bool57, e3.f10161a);
    }

    @VisibleForTesting
    private static <V> zzen<V> a(String str, V v2, V v3, g3<V> g3Var) {
        zzen zzen = new zzen(str, v2, v3, g3Var);
        f10567a.add(zzen);
        return zzen;
    }

    public static Map<String, String> c(Context context) {
        zzch a2 = zzch.a(context.getContentResolver(), zzcw.a("com.google.android.gms.measurement"));
        return a2 == null ? Collections.emptyMap() : a2.b();
    }
}
