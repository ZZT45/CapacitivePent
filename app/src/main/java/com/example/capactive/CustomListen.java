package com.example.capactive;

/**
 * 创建一个类用来存放自定义的接口
 *
 * */


public class CustomListen {

    public interface ListenerTouch{//触摸
        public void isTouch();
    }

    public interface ListenerHover{//悬浮
        public void isHover();
    }

    public interface ListenerThreeFingers{//三指
        public void isThreeFingers();
    }


}
