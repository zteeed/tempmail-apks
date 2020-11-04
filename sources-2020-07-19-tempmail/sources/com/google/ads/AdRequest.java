package com.google.ads;

@Deprecated
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public final class AdRequest {

    /* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
    public enum ErrorCode {
        INVALID_REQUEST("Invalid Ad request."),
        NO_FILL("Ad request successful, but no ad returned due to lack of ad inventory."),
        NETWORK_ERROR("A network error occurred."),
        INTERNAL_ERROR("There was an internal error.");
        

        /* renamed from: b  reason: collision with root package name */
        private final String f2418b;

        private ErrorCode(String str) {
            this.f2418b = str;
        }

        public final String toString() {
            return this.f2418b;
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
    public enum Gender {
        UNKNOWN,
        MALE,
        FEMALE
    }

    private AdRequest() {
    }
}
