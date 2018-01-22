package com.example.mateo.chatkazaka;

import android.app.Activity;
import android.content.Context;
import android.os.AsyncTask;

import com.fasterxml.jackson.core.JsonFactory;
import com.google.api.client.extensions.android.http.AndroidHttp;
import com.google.api.client.googleapis.extensions.android.gms.auth.GoogleAccountCredential;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.json.jackson2.JacksonFactory;

import java.util.List;

/**
 * Created by Mateo on 22.01.2018.
 */
public class ApiGoogleCalendar extends AsyncTask<String, Integer, List<String[]>> {
    private com.google.api.services.calendar.Calendar mService = null;
    private Exception mLastError = null;

    Context mContext;
    Activity mActivity;
    ApiGoogle mApiGoogle;
    ApiGoogleCalendarOperation mOperation;

    public ApiGoogleCalendar(Context context, Activity activity, ApiGoogle apiGoogle, GoogleAccountCredential credential, ApiGoogleCalendarOperation operation) {
        mContext = context;
        mActivity = activity;
        mApiGoogle = apiGoogle;
        mOperation = operation;
        HttpTransport transport = AndroidHttp.newCompatibleTransport();
        JacksonFactory jsonFactory = JacksonFactory.getDefaultInstance(); //uj wie czy dobrze
        mService = new com.google.api.services.calendar.Calendar.Builder(
                transport, jsonFactory, credential)
                .setApplicationName("RecoAlarm")
                .build();
    }

    @Override
    protected List<String[]> doInBackground(String... strings) {
        return null;
    }
}