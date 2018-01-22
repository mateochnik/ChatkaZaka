package com.example.mateo.chatkazaka;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;

import com.google.api.client.googleapis.extensions.android.gms.auth.GoogleAccountCredential;
import com.google.api.client.util.ExponentialBackOff;
import com.google.api.services.calendar.CalendarScopes;

import java.util.Arrays;
import java.util.List;

import pub.devrel.easypermissions.EasyPermissions;

/**
 * Created by Mateo on 22.01.2018.
 */
public class ApiGoogle implements EasyPermissions.PermissionCallbacks {
    Context mContext;
    Activity mActivity;
    GoogleAccountCredential mCredential;

    public static final String PREF_GOOGLE_ACCOUNT = "google_account";
    public static final String PREF_GOOGLE_CALENDAR = "google_calendar";

    private static final String[] SCOPES = { CalendarScopes.CALENDAR };

    public static final int REQUEST_ACCOUNT_PICKER = 1000;
    public static final int REQUEST_AUTHORIZATION = 1001;
    public static final int REQUEST_GOOGLE_PLAY_SERVICES = 1002;
    public static final int REQUEST_PERMISSION_GET_ACCOUNTS = 1003;

    public ApiGoogle(Context context, Activity activity) {
        // Initialize credentials and service object.
        mContext = context;
        mActivity = activity;
        mCredential = GoogleAccountCredential.usingOAuth2(
                context.getApplicationContext(), Arrays.asList(SCOPES))
                .setBackOff(new ExponentialBackOff());
    }

    public void setCredentialAccountName(String accountName){
        mCredential.setSelectedAccountName(accountName);
    }

    public GoogleAccountCredential getCredentialAccountName() {
        return mCredential;
    }

    @Override
    public void onPermissionsGranted(int requestCode, List<String> perms) {

    }

    @Override
    public void onPermissionsDenied(int requestCode, List<String> perms) {

    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {

    }
}