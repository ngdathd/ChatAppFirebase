package com.datna.chatapp.Fragments;

import com.datna.chatapp.Notifications.MyResponse;
import com.datna.chatapp.Notifications.Sender;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIService {
    @Headers(
            {
                    "Content-Type:application/json",
                    "Authorization:key=AAAAvrR8IFE:APA91bHW6WSj37_skR8eZxioV-s35I7AGXzz8yRonN_kBfuWggLy70wsaH1lhdJyQwAuDi0-F1U3Hg9FBSJ0sH0ID-ifFmE5EDKoSTqtulxZ6UH1WUTlTOCUIKuptbEECnTis_a8EFW-"
            }
    )

    @POST("fcm/send")
    Call<MyResponse> sendNotification(@Body Sender body);
}
