package com.baidu.speech.recognizerdemo.inter;

import android.content.Context;

public interface IEventCallBack {
    void onEvent(String name, String params, byte[] data, int offset, int length);

    Context getContext();
}
