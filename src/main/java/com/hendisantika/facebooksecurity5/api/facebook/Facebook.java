package com.hendisantika.facebooksecurity5.api.facebook;

import com.hendisantika.facebooksecurity5.api.ApiBinding;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Project : facebook-security5
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 12/03/18
 * Time: 20.41
 * To change this template use File | Settings | File Templates.
 */
public class Facebook extends ApiBinding {

    private static final String GRAPH_API_BASE_URL = "https://graph.facebook.com/v2.12";

    public Facebook(String accessToken) {
        super(accessToken);
    }

    public Profile getProfile() {
        return restTemplate.getForObject(GRAPH_API_BASE_URL + "/me", Profile.class);
    }

    public List<Post> getFeed() {
        return restTemplate.getForObject(GRAPH_API_BASE_URL + "/me/feed", Feed.class).getData();
    }

}