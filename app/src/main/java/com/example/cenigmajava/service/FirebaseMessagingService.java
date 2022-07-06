package com.example.cenigmajava.service;

import android.util.Log;
import androidx.annotation.NonNull;

import com.google.firebase.messaging.RemoteMessage;

public class FirebaseMessagingService extends com.google.firebase.messaging.FirebaseMessagingService {
    private static final String TAG = "APPI";

    @Override
    public void onNewToken(@NonNull String token) {
        Log.d(TAG, "Refreshed token: " + token);
    }
}
//token - dSKaGzNeSyqUJWiJLhWHmT:APA91bG5QgtL9XxumciLS0wKdXOldfVYFk6lWVost1wSQZIm7VIe6BVtyI2HySqvcL64ruZqhCh2G2iScAA-tLDHmjcYVZMr2d9vIsri2wpZPnpjDGwdFfjaOFKaDFsXGFVzBaG4lXUu
