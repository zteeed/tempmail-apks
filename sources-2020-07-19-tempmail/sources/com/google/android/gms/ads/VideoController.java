package com.google.android.gms.ads;

import android.os.RemoteException;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzaab;
import com.google.android.gms.internal.ads.zzbba;
import com.google.android.gms.internal.ads.zzyi;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public final class VideoController {
    @KeepForSdk
    public static final int PLAYBACK_STATE_ENDED = 3;
    @KeepForSdk
    public static final int PLAYBACK_STATE_PAUSED = 2;
    @KeepForSdk
    public static final int PLAYBACK_STATE_PLAYING = 1;
    @KeepForSdk
    public static final int PLAYBACK_STATE_READY = 5;
    @KeepForSdk
    public static final int PLAYBACK_STATE_UNKNOWN = 0;
    private final Object lock = new Object();
    @GuardedBy("lock")
    private zzyi zzadm;
    @GuardedBy("lock")
    private VideoLifecycleCallbacks zzadn;

    /* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
    public static abstract class VideoLifecycleCallbacks {
        public void onVideoEnd() {
        }

        public void onVideoMute(boolean z) {
        }

        public void onVideoPause() {
        }

        public void onVideoPlay() {
        }

        public void onVideoStart() {
        }
    }

    @Deprecated
    public final float getAspectRatio() {
        synchronized (this.lock) {
            if (this.zzadm == null) {
                return 0.0f;
            }
            try {
                float aspectRatio = this.zzadm.getAspectRatio();
                return aspectRatio;
            } catch (RemoteException e2) {
                zzbba.c("Unable to call getAspectRatio on video controller.", e2);
                return 0.0f;
            }
        }
    }

    @KeepForSdk
    public final int getPlaybackState() {
        synchronized (this.lock) {
            if (this.zzadm == null) {
                return 0;
            }
            try {
                int playbackState = this.zzadm.getPlaybackState();
                return playbackState;
            } catch (RemoteException e2) {
                zzbba.c("Unable to call getPlaybackState on video controller.", e2);
                return 0;
            }
        }
    }

    public final float getVideoCurrentTime() {
        synchronized (this.lock) {
            if (this.zzadm == null) {
                return 0.0f;
            }
            try {
                float currentTime = this.zzadm.getCurrentTime();
                return currentTime;
            } catch (RemoteException e2) {
                zzbba.c("Unable to call getCurrentTime on video controller.", e2);
                return 0.0f;
            }
        }
    }

    public final float getVideoDuration() {
        synchronized (this.lock) {
            if (this.zzadm == null) {
                return 0.0f;
            }
            try {
                float duration = this.zzadm.getDuration();
                return duration;
            } catch (RemoteException e2) {
                zzbba.c("Unable to call getDuration on video controller.", e2);
                return 0.0f;
            }
        }
    }

    public final VideoLifecycleCallbacks getVideoLifecycleCallbacks() {
        VideoLifecycleCallbacks videoLifecycleCallbacks;
        synchronized (this.lock) {
            videoLifecycleCallbacks = this.zzadn;
        }
        return videoLifecycleCallbacks;
    }

    public final boolean hasVideoContent() {
        boolean z;
        synchronized (this.lock) {
            z = this.zzadm != null;
        }
        return z;
    }

    public final boolean isClickToExpandEnabled() {
        synchronized (this.lock) {
            if (this.zzadm == null) {
                return false;
            }
            try {
                boolean z0 = this.zzadm.z0();
                return z0;
            } catch (RemoteException e2) {
                zzbba.c("Unable to call isClickToExpandEnabled.", e2);
                return false;
            }
        }
    }

    public final boolean isCustomControlsEnabled() {
        synchronized (this.lock) {
            if (this.zzadm == null) {
                return false;
            }
            try {
                boolean g5 = this.zzadm.g5();
                return g5;
            } catch (RemoteException e2) {
                zzbba.c("Unable to call isUsingCustomPlayerControls.", e2);
                return false;
            }
        }
    }

    public final boolean isMuted() {
        synchronized (this.lock) {
            if (this.zzadm == null) {
                return true;
            }
            try {
                boolean l1 = this.zzadm.l1();
                return l1;
            } catch (RemoteException e2) {
                zzbba.c("Unable to call isMuted on video controller.", e2);
                return true;
            }
        }
    }

    public final void mute(boolean z) {
        synchronized (this.lock) {
            if (this.zzadm != null) {
                try {
                    this.zzadm.X1(z);
                } catch (RemoteException e2) {
                    zzbba.c("Unable to call mute on video controller.", e2);
                }
            }
        }
    }

    public final void pause() {
        synchronized (this.lock) {
            if (this.zzadm != null) {
                try {
                    this.zzadm.pause();
                } catch (RemoteException e2) {
                    zzbba.c("Unable to call pause on video controller.", e2);
                }
            }
        }
    }

    public final void play() {
        synchronized (this.lock) {
            if (this.zzadm != null) {
                try {
                    this.zzadm.play();
                } catch (RemoteException e2) {
                    zzbba.c("Unable to call play on video controller.", e2);
                }
            }
        }
    }

    public final void setVideoLifecycleCallbacks(VideoLifecycleCallbacks videoLifecycleCallbacks) {
        Preconditions.l(videoLifecycleCallbacks, "VideoLifecycleCallbacks may not be null.");
        synchronized (this.lock) {
            this.zzadn = videoLifecycleCallbacks;
            if (this.zzadm != null) {
                try {
                    this.zzadm.S0(new zzaab(videoLifecycleCallbacks));
                } catch (RemoteException e2) {
                    zzbba.c("Unable to call setVideoLifecycleCallbacks on video controller.", e2);
                }
            }
        }
    }

    public final void stop() {
        synchronized (this.lock) {
            if (this.zzadm != null) {
                try {
                    this.zzadm.stop();
                } catch (RemoteException e2) {
                    zzbba.c("Unable to call stop on video controller.", e2);
                }
            }
        }
    }

    public final void zza(zzyi zzyi) {
        synchronized (this.lock) {
            this.zzadm = zzyi;
            if (this.zzadn != null) {
                setVideoLifecycleCallbacks(this.zzadn);
            }
        }
    }

    public final zzyi zzdu() {
        zzyi zzyi;
        synchronized (this.lock) {
            zzyi = this.zzadm;
        }
        return zzyi;
    }
}
