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
    private final Context f6338a;

    /* renamed from: b  reason: collision with root package name */
    private final zzqn f6339b;

    /* renamed from: c  reason: collision with root package name */
    private final PowerManager f6340c;

    public zzbls(Context context, zzqn zzqn) {
        this.f6338a = context;
        this.f6339b = zzqn;
        this.f6340c = (PowerManager) context.getSystemService("power");
    }

    /* renamed from: a */
    public final JSONObject b(zzblw zzblw) throws JSONException {
        JSONObject jSONObject;
        boolean z;
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject2 = new JSONObject();
        zzqt zzqt = zzblw.f6352e;
        if (zzqt == null) {
            jSONObject = new JSONObject();
        } else if (this.f6339b.e() != null) {
            boolean z2 = zzqt.f9040a;
            JSONObject jSONObject3 = new JSONObject();
            JSONObject put = jSONObject3.put("afmaVersion", this.f6339b.d()).put("activeViewJSON", this.f6339b.e()).put("timestamp", zzblw.f6350c).put("adFormat", this.f6339b.c()).put("hashCode", this.f6339b.a()).put("isMraid", false).put("isStopped", false).put("isPaused", zzblw.f6349b).put("isNative", this.f6339b.b());
            if (Build.VERSION.SDK_INT >= 20) {
                z = this.f6340c.isInteractive();
            } else {
                z = this.f6340c.isScreenOn();
            }
            put.put("isScreenOn", z).put("appMuted", zzq.zzlb().e()).put("appVolume", (double) zzq.zzlb().d()).put("deviceVolume", (double) zzayw.c(this.f6338a.getApplicationContext()));
            Rect rect = new Rect();
            Display defaultDisplay = ((WindowManager) this.f6338a.getSystemService("window")).getDefaultDisplay();
            rect.right = defaultDisplay.getWidth();
            rect.bottom = defaultDisplay.getHeight();
            jSONObject3.put("windowVisibility", zzqt.f9041b).put("isAttachedToWindow", z2).put("viewBox", new JSONObject().put("top", zzqt.f9042c.top).put("bottom", zzqt.f9042c.bottom).put("left", zzqt.f9042c.left).put("right", zzqt.f9042c.right)).put("adBox", new JSONObject().put("top", zzqt.f9043d.top).put("bottom", zzqt.f9043d.bottom).put("left", zzqt.f9043d.left).put("right", zzqt.f9043d.right)).put("globalVisibleBox", new JSONObject().put("top", zzqt.f9044e.top).put("bottom", zzqt.f9044e.bottom).put("left", zzqt.f9044e.left).put("right", zzqt.f9044e.right)).put("globalVisibleBoxVisible", zzqt.f9045f).put("localVisibleBox", new JSONObject().put("top", zzqt.g.top).put("bottom", zzqt.g.bottom).put("left", zzqt.g.left).put("right", zzqt.g.right)).put("localVisibleBoxVisible", zzqt.h).put("hitBox", new JSONObject().put("top", zzqt.i.top).put("bottom", zzqt.i.bottom).put("left", zzqt.i.left).put("right", zzqt.i.right)).put("screenDensity", (double) this.f6338a.getResources().getDisplayMetrics().density);
            jSONObject3.put("isVisible", zzblw.f6348a);
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
            if (!TextUtils.isEmpty(zzblw.f6351d)) {
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
