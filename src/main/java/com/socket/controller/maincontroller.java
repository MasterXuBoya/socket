package com.socket.controller;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletResponse;

@Controller
public class maincontroller {
    //*********************************登录界面************************************************************
    @RequestMapping(value = "login",method = RequestMethod.GET)
    public void login(@RequestParam(value = "name") String name,
                        @RequestParam(value = "password") String password,
                        HttpServletResponse response)throws Exception{
        JSONObject jsonObject=new JSONObject();
        //*************测试样例*****************************
        jsonObject.put("name",name);
        jsonObject.put("password",password);
        //**************输出**************************
        response.getWriter().print(jsonObject);
    }
    //*********************************记录管理**************************************************************
    /*jsonobject
    {
        record1：
        {
            todayflow:
            averflow:
            totalflow:
            hisaverflow:
        }
        record2：
        [
            {
                display:
                location:
                flow:
                hisfow:
            }
            {
                ……
            }
        ]
    }*/
    @RequestMapping(value = "/record",method = RequestMethod.GET)
    public void record1(HttpServletResponse response)throws Exception{
        JSONObject jsonObject=new JSONObject();
        //**********************构造record1*************************
        String todayflow="1";
        String averflow="2";
        String totalflow="3";
        String hisaverflow="4";


        JSONObject record1=new JSONObject();
        record1.put("todayflow",todayflow);
        record1.put("averflow",averflow);
        record1.put("totalflow",totalflow);
        record1.put("hisaverflow",hisaverflow);
        //**********************构造record2*************************
        JSONArray record2=new JSONArray();

        //**********************整合发送*************************
        jsonObject.put("record1",record1);
        jsonObject.put("record2",record2);
        response.getWriter().print(jsonObject);
    }

    //*********************************经营管理**************************************************************
    /*
    JsonObject
    {
        manage1:
        {
            todayrecharge:
            todayconsume:
            remain:
        }
        manage2:
        [
            {
                date:
                recharge:
                consume:
            }
            {
                ……
            }
        ]
    }*/
    @RequestMapping(value = "/manage",method = RequestMethod.GET)
    public void manage1(HttpServletResponse response)throws Exception{
        JSONObject jsonObject=new JSONObject();
        //*******************************************
        String todaycharge="";
        String todayconsume="";
        String remain="";
        JSONObject manage1=new JSONObject();
        manage1.put("todayrecharge",todaycharge);
        manage1.put("todayconsume",todayconsume);
        manage1.put("remain",remain);
        //*******************************************
        JSONArray manage2=new JSONArray();

        //********************************************
        jsonObject.put("manage1",manage1);
        jsonObject.put("manage2",manage2);
        response.getWriter().print(jsonObject);
    }


    //*********************************充值管理**************************************************************
    /*
    JsonObject
    {
        money:
    }*/
    @RequestMapping(value = "/recharge",method = RequestMethod.GET)
    public void recharge(@RequestParam(value = "money") String money,
                         HttpServletResponse response)throws Exception{

    }
}
