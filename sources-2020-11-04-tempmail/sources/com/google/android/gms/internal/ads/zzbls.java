package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.os.PowerManager;
import android.text.TextUtils;
import android.view.Display;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.zzq;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzbls implements zzalk<zzblw> {

    /* renamed from: a  reason: collision with root package name */
    private final Context f6521a;

    /* renamed from: b  reason: collision with root package name */
    private final zzqn f6522b;

    /* renamed from: c  reason: collision with root package name */
    private final PowerManager f6523c;

    public zzbls(Context context, zzqn zzqn) {
        this.f6521a = context;
        this.f6522b = zzqn;
        this.f6523c = (PowerManager) context.getSystemService("power");
    }

    /* renamed from: a */
    public final JSONObject b(zzblw zzblw) throws JSONException {
        JSONObject jSONObject;
        boolean z;
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject2 = new JSONObject();
        zzqt zzqt = zzblw.f6535e;
        if (zzqt == null) {
            jSONObject = new JSONObject();
        } else if (this.f6522b.e() != null) {
            boolean z2 = zzqt.f9223a;
            JSONObject jSONObject3 = new JSONObject();
            JSONObject put = jSONObject3.put("afmaVersion", this.f6522b.d()).put("activeViewJSON", this.f6522b.e()).put("timestamp", zzblw.f6533c).put("adFormat", this.f6522b.c()).put("hashCode", this.f6522b.a()).put("isMraid", false).put("isStopped", false).put("isPaused", zzblw.f6532b).put("isNative", this.f6522b.b());
            if (Build.VERSION.SDK_INT >= 20) {
                z = this.f6523c.isInteractive();
            } else {
                z = this.f6523c.isScreenOn();
            }
            put.put("isScreenOn", z).put("appMuted", zzq.zzlb().e()).put("appVolume", (double) zzq.zzlb().d()).put("deviceVolume", (double) zzayw.c(this.f6521a.getApplicationContext()));
            Rect rect = new Rect();
            Display defaultDisplay = ((WindowManager) this.f6521a.getSystemService("window")).getDefaultDisplay();
            rect.right = defaultDisplay.getWidth();
            rect.bottom = defaultDisplay.getHeight();
            jSONObject3.put("windowVisibility", zzqt.f9224b).put("isAttachedToWindow", z2).put("viewBox", new JSONObject().put("top", zzqt.f9225c.top).put("bottom", zzqt.f9225c.bottom).put("left", zzqt.f9225c.left).put("right", zzqt.f9225c.right)).put("adBox", new JSONObject().put("top", zzqt.f9226d.top).put("bottom", zzqt.f9226d.bottom).put("left", zzqt.f9226d.left).put("right", zzqt.f9226d.right)).put("globalVisibleBox", new JSONObject().put("top", zzqt.f9227e.top).put("bottom", zzqt.f9227e.bottom).put("left", zzqt.f9227e.left).put("right", zzqt.f9227e.right)).put("globalVisibleBoxVisible", zzqt.f9228f).put("localVisibleBox", new JSONObject().put("top", zzqt.g.top).put("bottom", zzqt.g.bottom).put("left", zzqt.g.left).put("right", zzqt.g.right)).put("localVisibleBoxVisible", zzqt.h).put("hitBox", new JSONObject().put("top", zzqt.i.top).put("bottom", zzqt.i.bottom).put("left", zzqt.i.left).put("right", zzqt.i.right)).put("screenDensity", (double) this.f6521a.getResources().getDisplayMetrics().density);
            jSONObject3.put("isVisible", zzblw.f6531a);
            if (((Boolean) zzwg.e().c(zzaav.H0)).booleanValue()) {
                JSONArray jSONArray2 = new JSONArray();
                List<Rect> list = zzqt.k;
                if (list != null) {
                    for (Rect next : list) {
                        jSONArray2.put(new JSONObject().put("top", next.top).put("bottom", next.bottom).put("left", next.left).put("right", next.right));
                    }
                }
                jSONObject3.put("scrollableContainerBoxes", jSONArray2);
            }
            if (!TextUtils.isEmpty(zzblw.f6534d)) {
                jSONObject3.put("doneReasonCode", "u");
            }
            jSONObject = jSONObject3;
        } else {
            throw new JSONException("Active view Info cannot be null.");
        }
        jSONArray.put(jSONObject);
        jSONObject2.put("units", jSONArray);
        return jSONObject2;
    }
}
