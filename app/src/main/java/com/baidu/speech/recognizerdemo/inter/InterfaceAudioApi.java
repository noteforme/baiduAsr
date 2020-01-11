package com.baidu.speech.recognizerdemo.inter;

public interface InterfaceAudioApi {
    void init(IEventCallBack iEventCallBack);

    void asrStart();

    void asrPause();

    void asrStop();

    void asrDestroy();

}
