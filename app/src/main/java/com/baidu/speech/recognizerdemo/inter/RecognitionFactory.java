package com.baidu.speech.recognizerdemo.inter;

public class RecognitionFactory {
    private static RecognitionFactory INSTANCE;
    public static RecognitionFactory getInstance() {
        if (INSTANCE==null){
            synchronized (RecognitionFactory.class) {
                if (INSTANCE == null) {
                    INSTANCE = new RecognitionFactory();
                }
            }
        }
        return INSTANCE;
    }


    public InterfaceAudioApi makeRecognition(String recognition) {

        return new BaiduRecognition();
    }


}
