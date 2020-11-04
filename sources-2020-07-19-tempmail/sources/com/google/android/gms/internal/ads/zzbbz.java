package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import com.google.android.gms.ads.internal.zzq;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@TargetApi(14)
/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzbbz extends zzbcm implements MediaPlayer.OnBufferingUpdateListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnInfoListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnVideoSizeChangedListener, TextureView.SurfaceTextureListener {
    private static final Map<Integer, String> r = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    private final zzbde f6147d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f6148e;

    /* renamed from: f  reason: collision with root package name */
    private int f6149f = 0;
    private int g = 0;
    private MediaPlayer h;
    private Uri i;
    private int j;
    private int k;
    private int l;
    private int m;
    private zzbcz n;
    private boolean o;
    private int p;
    /* access modifiers changed from: private */
    public zzbcj q;

    static {
        if (Build.VERSION.SDK_INT >= 17) {
            r.put(-1004, "MEDIA_ERROR_IO");
            r.put(-1007, "MEDIA_ERROR_MALFORMED");
            r.put(-1010, "MEDIA_ERROR_UNSUPPORTED");
            r.put(-110, "MEDIA_ERROR_TIMED_OUT");
            r.put(3, "MEDIA_INFO_VIDEO_RENDERING_START");
        }
        r.put(100, "MEDIA_ERROR_SERVER_DIED");
        r.put(1, "MEDIA_ERROR_UNKNOWN");
        r.put(1, "MEDIA_INFO_UNKNOWN");
        r.put(700, "MEDIA_INFO_VIDEO_TRACK_LAGGING");
        r.put(701, "MEDIA_INFO_BUFFERING_START");
        r.put(702, "MEDIA_INFO_BUFFERING_END");
        r.put(800, "MEDIA_INFO_BAD_INTERLEAVING");
        r.put(801, "MEDIA_INFO_NOT_SEEKABLE");
        r.put(802, "MEDIA_INFO_METADATA_UPDATE");
        if (Build.VERSION.SDK_INT >= 19) {
            r.put(901, "MEDIA_INFO_UNSUPPORTED_SUBTITLE");
            r.put(902, "MEDIA_INFO_SUBTITLE_TIMED_OUT");
        }
    }

    public zzbbz(Context context, boolean z, boolean z2, zzbdc zzbdc, zzbde zzbde) {
        super(context);
        setSurfaceTextureListener(this);
        this.f6147d = zzbde;
        this.o = z;
        this.f6148e = z2;
        zzbde.b(this);
    }

    private final void t(boolean z) {
        zzaxv.m("AdMediaPlayerView release");
        zzbcz zzbcz = this.n;
        if (zzbcz != null) {
            zzbcz.j();
            this.n = null;
        }
        MediaPlayer mediaPlayer = this.h;
        if (mediaPlayer != null) {
            mediaPlayer.reset();
            this.h.release();
            this.h = null;
            v(0);
            if (z) {
                this.g = 0;
                this.g = 0;
            }
        }
    }

    private final void u(float f2) {
        MediaPlayer mediaPlayer = this.h;
        if (mediaPlayer != null) {
            try {
                mediaPlayer.setVolume(f2, f2);
            } catch (IllegalStateException unused) {
            }
        } else {
            zzbba.i("AdMediaPlayerView setMediaPlayerVolume() called before onPrepared().");
        }
    }

    private final void v(int i2) {
        if (i2 == 3) {
            this.f6147d.e();
            this.f6151c.d();
        } else if (this.f6149f == 3) {
            this.f6147d.f();
            this.f6151c.e();
        }
        this.f6149f = i2;
    }

    private final void x() {
        zzaxv.m("AdMediaPlayerView init MediaPlayer");
        SurfaceTexture surfaceTexture = getSurfaceTexture();
        if (this.i != null && surfaceTexture != null) {
            t(false);
            try {
                zzq.zzlm();
                MediaPlayer mediaPlayer = new MediaPlayer();
                this.h = mediaPlayer;
                mediaPlayer.setOnBufferingUpdateListener(this);
                this.h.setOnCompletionListener(this);
                this.h.setOnErrorListener(this);
                this.h.setOnInfoListener(this);
                this.h.setOnPreparedListener(this);
                this.h.setOnVideoSizeChangedListener(this);
                if (this.o) {
                    zzbcz zzbcz = new zzbcz(getContext());
                    this.n = zzbcz;
                    zzbcz.b(surfaceTexture, getWidth(), getHeight());
                    this.n.start();
                    SurfaceTexture k2 = this.n.k();
                    if (k2 != null) {
                        surfaceTexture = k2;
                    } else {
                        this.n.j();
                        this.n = null;
                    }
                }
                this.h.setDataSource(getContext(), this.i);
                zzq.zzln();
                this.h.setSurface(new Surface(surfaceTexture));
                this.h.setAudioStreamType(3);
                this.h.setScreenOnWhilePlaying(true);
                this.h.prepareAsync();
                v(1);
            } catch (IOException | IllegalArgumentException | IllegalStateException e2) {
                String valueOf = String.valueOf(this.i);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 36);
                sb.append("Failed to initialize MediaPlayer at ");
                sb.append(valueOf);
                zzbba.d(sb.toString(), e2);
                onError(this.h, 1, 0);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0034 A[LOOP:0: B:10:0x0034->B:15:0x004f, LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void y() {
        /*
            r8 = this;
            boolean r0 = r8.f6148e
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            boolean r0 = r8.z()
            if (r0 == 0) goto L_0x0059
            android.media.MediaPlayer r0 = r8.h
            int r0 = r0.getCurrentPosition()
            if (r0 <= 0) goto L_0x0059
            int r0 = r8.g
            r1 = 3
            if (r0 == r1) goto L_0x0059
            java.lang.String r0 = "AdMediaPlayerView nudging MediaPlayer"
            com.google.android.gms.internal.ads.zzaxv.m(r0)
            r0 = 0
            r8.u(r0)
            android.media.MediaPlayer r0 = r8.h
            r0.start()
            android.media.MediaPlayer r0 = r8.h
            int r0 = r0.getCurrentPosition()
            com.google.android.gms.common.util.Clock r1 = com.google.android.gms.ads.internal.zzq.zzld()
            long r1 = r1.a()
        L_0x0034:
            boolean r3 = r8.z()
            if (r3 == 0) goto L_0x0051
            android.media.MediaPlayer r3 = r8.h
            int r3 = r3.getCurrentPosition()
            if (r3 != r0) goto L_0x0051
            com.google.android.gms.common.util.Clock r3 = com.google.android.gms.ads.internal.zzq.zzld()
            long r3 = r3.a()
            long r3 = r3 - r1
            r5 = 250(0xfa, double:1.235E-321)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 <= 0) goto L_0x0034
        L_0x0051:
            android.media.MediaPlayer r0 = r8.h
            r0.pause()
            r8.c()
        L_0x0059:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbbz.y():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r2.f6149f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean z() {
        /*
            r2 = this;
            android.media.MediaPlayer r0 = r2.h
            if (r0 == 0) goto L_0x000f
            int r0 = r2.f6149f
            r1 = -1
            if (r0 == r1) goto L_0x000f
            if (r0 == 0) goto L_0x000f
            r1 = 1
            if (r0 == r1) goto L_0x000f
            return r1
        L_0x000f:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbbz.z():boolean");
    }

    public final void c() {
        u(this.f6151c.a());
    }

    public final void d() {
        zzaxv.m("AdMediaPlayerView pause");
        if (z() && this.h.isPlaying()) {
            this.h.pause();
            v(4);
            zzaye.h.post(new h7(this));
        }
        this.g = 4;
    }

    public final void g() {
        zzaxv.m("AdMediaPlayerView play");
        if (z()) {
            this.h.start();
            v(3);
            this.f6150b.b();
            zzaye.h.post(new f7(this));
        }
        this.g = 3;
    }

    public final int getCurrentPosition() {
        if (z()) {
            return this.h.getCurrentPosition();
        }
        return 0;
    }

    public final int getDuration() {
        if (z()) {
            return this.h.getDuration();
        }
        return -1;
    }

    public final int getVideoHeight() {
        MediaPlayer mediaPlayer = this.h;
        if (mediaPlayer != null) {
            return mediaPlayer.getVideoHeight();
        }
        return 0;
    }

    public final int getVideoWidth() {
        MediaPlayer mediaPlayer = this.h;
        if (mediaPlayer != null) {
            return mediaPlayer.getVideoWidth();
        }
        return 0;
    }

    public final void h(int i2) {
        StringBuilder sb = new StringBuilder(34);
        sb.append("AdMediaPlayerView seek ");
        sb.append(i2);
        zzaxv.m(sb.toString());
        if (z()) {
            this.h.seekTo(i2);
            this.p = 0;
            return;
        }
        this.p = i2;
    }

    public final void i() {
        zzaxv.m("AdMediaPlayerView stop");
        MediaPlayer mediaPlayer = this.h;
        if (mediaPlayer != null) {
            mediaPlayer.stop();
            this.h.release();
            this.h = null;
            v(0);
            this.g = 0;
        }
        this.f6147d.a();
    }

    public final void j(float f2, float f3) {
        zzbcz zzbcz = this.n;
        if (zzbcz != null) {
            zzbcz.e(f2, f3);
        }
    }

    public final void k(zzbcj zzbcj) {
        this.q = zzbcj;
    }

    public final void onBufferingUpdate(MediaPlayer mediaPlayer, int i2) {
    }

    public final void onCompletion(MediaPlayer mediaPlayer) {
        zzaxv.m("AdMediaPlayerView completion");
        v(5);
        this.g = 5;
        zzaye.h.post(new c7(this));
    }

    public final boolean onError(MediaPlayer mediaPlayer, int i2, int i3) {
        String str = r.get(Integer.valueOf(i2));
        String str2 = r.get(Integer.valueOf(i3));
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 38 + String.valueOf(str2).length());
        sb.append("AdMediaPlayerView MediaPlayer error: ");
        sb.append(str);
        sb.append(":");
        sb.append(str2);
        zzbba.i(sb.toString());
        v(-1);
        this.g = -1;
        zzaye.h.post(new b7(this, str, str2));
        return true;
    }

    public final boolean onInfo(MediaPlayer mediaPlayer, int i2, int i3) {
        String str = r.get(Integer.valueOf(i2));
        String str2 = r.get(Integer.valueOf(i3));
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 37 + String.valueOf(str2).length());
        sb.append("AdMediaPlayerView MediaPlayer info: ");
        sb.append(str);
        sb.append(":");
        sb.append(str2);
        zzaxv.m(sb.toString());
        return true;
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i2, int i3) {
        int i4;
        int i5;
        int defaultSize = TextureView.getDefaultSize(this.j, i2);
        int defaultSize2 = TextureView.getDefaultSize(this.k, i3);
        if (this.j > 0 && this.k > 0 && this.n == null) {
            int mode = View.MeasureSpec.getMode(i2);
            int size = View.MeasureSpec.getSize(i2);
            int mode2 = View.MeasureSpec.getMode(i3);
            int size2 = View.MeasureSpec.getSize(i3);
            if (mode == 1073741824 && mode2 == 1073741824) {
                int i6 = this.j;
                int i7 = i6 * size2;
                int i8 = this.k;
                if (i7 < size * i8) {
                    defaultSize = (i6 * size2) / i8;
                    defaultSize2 = size2;
                } else {
                    if (i6 * size2 > size * i8) {
                        i5 = (i8 * size) / i6;
                    }
                    defaultSize = size;
                    defaultSize2 = size2;
                }
            } else if (mode == 1073741824) {
                int i9 = (this.k * size) / this.j;
                if (mode2 != Integer.MIN_VALUE || i9 <= size2) {
                    i5 = i9;
                }
                defaultSize = size;
                defaultSize2 = size2;
            } else if (mode2 == 1073741824) {
                int i10 = (this.j * size2) / this.k;
                if (mode != Integer.MIN_VALUE || i10 <= size) {
                    defaultSize = i10;
                    defaultSize2 = size2;
                }
                defaultSize = size;
                defaultSize2 = size2;
            } else {
                int i11 = this.j;
                int i12 = this.k;
                if (mode2 != Integer.MIN_VALUE || i12 <= size2) {
                    defaultSize2 = i12;
                } else {
                    i11 = (i11 * size2) / i12;
                    defaultSize2 = size2;
                }
                if (mode != Integer.MIN_VALUE || i11 <= size) {
                    defaultSize = i11;
                } else {
                    i5 = (this.k * size) / this.j;
                }
            }
            defaultSize = size;
        }
        setMeasuredDimension(defaultSize, defaultSize2);
        zzbcz zzbcz = this.n;
        if (zzbcz != null) {
            zzbcz.i(defaultSize, defaultSize2);
        }
        if (Build.VERSION.SDK_INT == 16) {
            int i13 = this.l;
            if ((i13 > 0 && i13 != defaultSize) || ((i4 = this.m) > 0 && i4 != defaultSize2)) {
                y();
            }
            this.l = defaultSize;
            this.m = defaultSize2;
        }
    }

    public final void onPrepared(MediaPlayer mediaPlayer) {
        zzaxv.m("AdMediaPlayerView prepared");
        v(2);
        this.f6147d.d();
        zzaye.h.post(new z6(this));
        this.j = mediaPlayer.getVideoWidth();
        this.k = mediaPlayer.getVideoHeight();
        int i2 = this.p;
        if (i2 != 0) {
            h(i2);
        }
        y();
        int i3 = this.j;
        int i4 = this.k;
        StringBuilder sb = new StringBuilder(62);
        sb.append("AdMediaPlayerView stream dimensions: ");
        sb.append(i3);
        sb.append(" x ");
        sb.append(i4);
        zzbba.h(sb.toString());
        if (this.g == 3) {
            g();
        }
        c();
    }

    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i2, int i3) {
        zzaxv.m("AdMediaPlayerView surface created");
        x();
        zzaye.h.post(new e7(this));
    }

    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        zzaxv.m("AdMediaPlayerView surface destroyed");
        MediaPlayer mediaPlayer = this.h;
        if (mediaPlayer != null && this.p == 0) {
            this.p = mediaPlayer.getCurrentPosition();
        }
        zzbcz zzbcz = this.n;
        if (zzbcz != null) {
            zzbcz.j();
        }
        zzaye.h.post(new g7(this));
        t(true);
        return true;
    }

    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i2, int i3) {
        zzaxv.m("AdMediaPlayerView surface changed");
        boolean z = true;
        boolean z2 = this.g == 3;
        if (!(this.j == i2 && this.k == i3)) {
            z = false;
        }
        if (this.h != null && z2 && z) {
            int i4 = this.p;
            if (i4 != 0) {
                h(i4);
            }
            g();
        }
        zzbcz zzbcz = this.n;
        if (zzbcz != null) {
            zzbcz.i(i2, i3);
        }
        zzaye.h.post(new d7(this, i2, i3));
    }

    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        this.f6147d.c(this);
        this.f6150b.a(surfaceTexture, this.q);
    }

    public final void onVideoSizeChanged(MediaPlayer mediaPlayer, int i2, int i3) {
        StringBuilder sb = new StringBuilder(57);
        sb.append("AdMediaPlayerView size changed: ");
        sb.append(i2);
        sb.append(" x ");
        sb.append(i3);
        zzaxv.m(sb.toString());
        this.j = mediaPlayer.getVideoWidth();
        int videoHeight = mediaPlayer.getVideoHeight();
        this.k = videoHeight;
        if (this.j != 0 && videoHeight != 0) {
            requestLayout();
        }
    }

    /* access modifiers changed from: protected */
    public final void onWindowVisibilityChanged(int i2) {
        StringBuilder sb = new StringBuilder(58);
        sb.append("AdMediaPlayerView window visibility changed to ");
        sb.append(i2);
        zzaxv.m(sb.toString());
        zzaye.h.post(new a7(this, i2));
        super.onWindowVisibilityChanged(i2);
    }

    public final String r() {
        String str = this.o ? " spherical" : "";
        return str.length() != 0 ? "MediaPlayer".concat(str) : new String("MediaPlayer");
    }

    public final void setVideoPath(String str) {
        Uri parse = Uri.parse(str);
        zzsy v = zzsy.v(parse);
        if (v == null || v.f9099b != null) {
            if (v != null) {
                parse = Uri.parse(v.f9099b);
            }
            this.i = parse;
            this.p = 0;
            x();
            requestLayout();
            invalidate();
        }
    }

    public final String toString() {
        String name = zzbbz.class.getName();
        String hexString = Integer.toHexString(hashCode());
        StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 1 + String.valueOf(hexString).length());
        sb.append(name);
        sb.append("@");
        sb.append(hexString);
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void w(int i2) {
        zzbcj zzbcj = this.q;
        if (zzbcj != null) {
            zzbcj.onWindowVisibilityChanged(i2);
        }
    }
}
