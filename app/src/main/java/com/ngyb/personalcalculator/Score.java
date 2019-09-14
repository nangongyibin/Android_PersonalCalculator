package com.ngyb.personalcalculator;

import java.util.HashMap;
import java.util.Set;

/**
 * 作者：南宫燚滨
 * 描述：
 * 邮箱：nangongyibin@gmail.com
 * 日期：2019/9/14 16:44
 */
public class Score {
    public static String checkMap(HashMap<String, String> map, String name) {
        String score = null;
        Set<String> keys = map.keySet();
        if (keys.contains(name)) {
            score = map.get(name);
        }
        return score;
    }

    public static int getResult(String name) {
        int score = 0;
        for (int i = 0; i < name.length(); i++) {
            score += name.charAt(i);
        }
        return score % 100;
    }

    public static String getValue(int score) {
        String evaluate = "";
        if (score == 0) {
            evaluate = "你一定不是人吧？怎么一点人品都没有？！";
        } else if (score > 0 && score <= 5) {
            evaluate = "算了，跟你没什么人品好谈的。。。";
        } else if (score > 5 && score <= 10) {
            evaluate = "是我不好。。。不应该跟你谈人品问题的。。。";
        } else if (score > 10 && score <= 15) {
            evaluate = "杀过人没有？放过火没有？你应该无恶不作吧？";
        } else if (score > 15 && score <= 20) {
            evaluate = "你貌似应该三岁就偷看隔壁大妈洗澡的吧。。。";
        } else if (score > 20 && score <= 25) {
            evaluate = "你的人品之低下是在让人惊讶啊。。。";
        } else if (score > 25 && score <= 30) {
            evaluate = "你的人品太差了。你应该有干坏事的嗜好吧？";
        } else if (score > 30 && score <= 35) {
            evaluate = "你的人品真差！可定经常做偷鸡摸狗的事。。。";
        } else if (score > 35 && score <= 40) {
            evaluate = "你拥有如此查的人品请经常祈求佛祖保佑你吧。。。";
        } else if (score > 40 && score <= 45) {
            evaluate = "老实交待。。。那些论坛上面经常出现的偷拍照是不是你的杰作？";
        } else if (score > 45 && score <= 50) {
            evaluate = "你随地大小便之类的事没少干吧？";
        } else if (score > 50 && score <= 55) {
            evaluate = "你的人品太差了。。。稍不小心就会去干坏事了吧？";
        } else if (score > 55 && score <= 60) {
            evaluate = "你的人品很差了。。。要时刻克制住做坏事的冲动哦。。。";
        } else if (score > 60 && score <= 65) {
            evaluate = "你的人品比较差了。。。要好好的约束自己啊。。。";
        } else if (score > 65 && score <= 70) {
            evaluate = "你的人品勉勉强强。。。要自己好自为之。。。";
        } else if (score > 70 && score <= 75) {
            evaluate = "有你这样的人品算是不错了。。。";
        } else if (score > 75 && score <= 80) {
            evaluate = "你有较好的人品。。。继续保持。。。";
        } else if (score > 80 && score <= 85) {
            evaluate = "你的人品不错。。。应该一表人才吧？";
        } else if (score > 85 && score <= 90) {
            evaluate = "你的人品真好。。。做好事应该是你的爱好吧。。。";
        } else if (score > 90 && score <= 95) {
            evaluate = "你的人品太好了。。。你就是当代活雷锋啊。。。";
        } else if (score > 95 && score < 100) {
            evaluate = "你是世人的榜样！";
        } else if (score == 100) {
            evaluate = "天啦！你不是人！！你是神！！！";
        } else {
            evaluate = "你的人品竟然溢出了。。。我对你无语。。。";
        }
        return evaluate;
    }
}
