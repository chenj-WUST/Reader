package com.example.reader.util;

import com.example.reader.db.Community;
import com.example.reader.db.CommunityList;
import com.google.gson.Gson;

public class Utility {
    public static CommunityList handleCommunity(String response)
    {
        return new Gson().fromJson(response,CommunityList.class);
    }
    public static Pic handlePicResponse(String response)
    {
        return new Gson().fromJson(response,Pic.class);
    }
    public static State handleStateResponse(String response)
    {
        return  new Gson().fromJson(response,State.class);
    }
    public static BookId handleBookIdResponse(String response)
    {
        return  new Gson().fromJson(response,BookId.class);
    }
    public static BookContext handleBookContextResponse(String response)
    {
        return  new Gson().fromJson(response,BookContext.class);
    }
}
