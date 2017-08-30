package com.socket.controller;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletResponse;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Date;
import java.util.Calendar;

import java.text.SimpleDateFormat;

@Controller
public class test_hello {
    @RequestMapping(value = "/",method = RequestMethod.GET)
    public void index(HttpServletResponse response)throws Exception{
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Calendar c = Calendar.getInstance();
        /*
        c.setTime(new Date());
        c.add(Calendar.MONTH, -1);
        Date m = c.getTime();
        String mon = format.format(m);
        response.getWriter().print(mon);*/
        int i;
        for(i=1;i<=30;i++) {
            c.setTime(new Date());
            c.add(Calendar.DATE, -i);
            Date d = c.getTime();
            String day = format.format(d);
            response.getWriter().println(day);
        }
    }

    @RequestMapping(value = "test",method = RequestMethod.GET)
    public void test(HttpServletResponse response)throws Exception{

        JSONObject jsonObject=new JSONObject();

        JSONObject js=new JSONObject();
        js.put("hah",11);
        js.put("mm",22);

        JSONArray jsonArray=new JSONArray();
        JSONObject obj=new JSONObject();
        obj.put("first","bill");
        obj.put("lastname","gates");
        jsonArray.add(obj);
        JSONObject obj1=new JSONObject();
        obj1.put("first","george");
        obj1.put("lastname","bush");
        jsonArray.add(obj1);
        JSONObject obj2=new JSONObject();
        obj2.put("first","thomas");
        obj2.put("lastname","garter");
        jsonArray.add(obj2);

        jsonObject.put("js",js);
        jsonObject.put("jsonArray",jsonArray);
        response.getWriter().print(jsonObject);




        //******************************************************************
        /*JSONArray jsonArray=new JSONArray();
        JSONObject jsonObject1=new JSONObject();
        jsonObject1.put("name","xuboya");
        jsonObject1.put("password","123");
        JSONObject jsonObject2=new JSONObject();
        jsonObject2.put("dushu","zhangsan");
        jsonObject2.put("pasord","111");
        //response.getWriter().print(jsonObject);
        jsonArray.add(jsonObject1);
        jsonArray.add(jsonObject2);
        response.getWriter().print(jsonArray);


        JSONObject jsonObject=jsonArray.getJSONObject(0);
        response.getWriter().print(jsonObject);*/
    }
}
