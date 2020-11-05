package com.test.right;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


//模拟中间  将得到的post显示在控制台
public class test4 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        System.out.println("接收到一个post请求");
        //接请求
        //new json对象 以便后期解析
        JSONObject json = new JSONObject();
        //json集合
        JSONArray list = new JSONArray();
        //用来临时接请求
        BufferedReader br;
        //将接到的请求放到
        br = new BufferedReader(new InputStreamReader(request.getInputStream()));
        //用来暂时接json
        String line = null;
        //用来接请求的json
        StringBuilder sb = new StringBuilder();
        while ((line = br.readLine()) != null) {
            //将获取到的json放到string里面
            sb.append(line);
        }
        System.out.println(sb);
    }
}
