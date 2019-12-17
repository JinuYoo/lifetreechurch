package kr.uncode.lifetreechurch;

import kr.uncode.lifetreechurch.Model.BlogWeekly;
import kr.uncode.lifetreechurch.Model.NewMemberModel;
import kr.uncode.lifetreechurch.Model.NoticeModel;
import kr.uncode.lifetreechurch.Model.YoutubeResponse;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Query;

public interface RetroApiService {

    @GET("/youtube/v3/search")
    Call<YoutubeResponse> videoList(@Query("part") String part, @Query("channelId") String channelId, @Query("key") String key);


    @Headers({
            "x-uncode-id:5debc01bc96b921a9f7bff7c",
            "x-uncode-key:YokmmOcL68okD1dXFPew9trNgULYXlIwYTakIvZ7"
    })
    @GET("/ttlmc/weekly")
    Call<BlogWeekly> getWeekly();


    @Headers({
            "x-uncode-id:5debc01bc96b921a9f7bff7c",
            "x-uncode-key:YokmmOcL68okD1dXFPew9trNgULYXlIwYTakIvZ7"
    })
    @GET("/ttlmc/newFamily")
    Call<NewMemberModel> getNewmember();


    @Headers({
            "x-uncode-id:5debc01bc96b921a9f7bff7c",
            "x-uncode-key:YokmmOcL68okD1dXFPew9trNgULYXlIwYTakIvZ7"
    })
    @GET("/ttlmc/notice")
    Call<NoticeModel> getNotice();
}


