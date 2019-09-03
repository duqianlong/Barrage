package com.example.duqianlong.danmu;

import java.io.Serializable;

/**
 * Created by Duqianlong on 2019/9/3.
 */

public class BarrageViewBean implements Serializable {
    private String content;
    private String time;
    private String headPictureUrl;

    public BarrageViewBean(String content, String time, String headPictureUrl) {
        this.content = content;
        this.time = time;
        this.headPictureUrl = headPictureUrl;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public void setHeadPictureUrl(String headPictureUrl) {
        this.headPictureUrl = headPictureUrl;
    }

    public String getContent() {
        return content;
    }

    public String getTime() {
        return time;
    }

    public String getHeadPictureUrl() {
        return headPictureUrl;
    }
}
