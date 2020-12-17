package com.example.platform.controller;

import com.alibaba.fastjson.JSONObject;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Objects;

@Api(tags="商城的接口实现")
@RestController
public class MallController {

    @ApiOperation("用于登录，验证手机号和密码")
    @RequestMapping(value="/common/fgadmin/login",method= RequestMethod.POST,produces = {"application/json;charset=UTF-8"})
    public JSONObject login(@RequestBody JSONObject user, HttpServletResponse response) {

        response.setContentType("application/json;charset=UTF-8");

        String user_area = user.getString("phoneArea");
        String user_phone = user.getString("phoneNumber");
        String user_password = user.getString("password");
        JSONObject result = new JSONObject();

        if (user_area.equals("86") && user_phone.equals("20000000000") && user_password.equals("netease123")) {
            result.put("message", "success");
            result.put("code", "200");
            Cookie cookie = new Cookie("login", "true");
            cookie.setPath("/");
            response.addCookie(cookie);
        } else if (user_phone.equals("123") || user_password.equals("")) {
            result.put("message", "用户名或者密码错误");
            result.put("code", "400");
        } else if (user_area.equals("")) {
            result.put("message", "用户名为空");
            result.put("code", "401");
        }
        return result;
    }

    @ApiOperation("获取所有商品的 sku 信息或指定商品的 sku 信息")
    @GetMapping("/common/skuList")
    public JSONObject getSkuList(@RequestParam int goodsId,HttpServletResponse response){
        response.setContentType("application/json;charset=UTF-8");
        JSONObject goodInfo=new JSONObject();
        goodInfo.put("message","success");
        goodInfo.put("id","1");
        goodInfo.put("skuName","夜空黑");

        return goodInfo;
    }

    @ApiOperation("查询用户收货地址")
    @GetMapping("/fgadmin/address/list")
    public JSONObject getAddressList(HttpServletRequest request,HttpServletResponse response){
        response.setContentType("application/json;charset=UTF-8");
        Cookie[] cookies=request.getCookies();
        JSONObject result=new JSONObject();
        if(Objects.isNull(cookies)){
            result.put("message","请登录");
        }else
            for(Cookie cookie:cookies){
                if(cookie.getName().equals("login")&&cookie.getValue().equals("true")){
                    result.put("message","success");
                    result.put("id","77479641");
                    result.put("address","石家庄");
                }
            }
            return result;
    }

    @ApiOperation("计算运费")
    @GetMapping("/common/getTransportFee")
    public JSONObject getTransportFee(@RequestParam int id,@RequestParam String addressDetail,HttpServletResponse response){
        response.setContentType("application/json;charset=UTF-8");
        JSONObject result=new JSONObject();
        result.put("message","success");
        result.put("result","6");
        result.put("code","200");
        return result;
    }

    @ApiOperation("提交订单")
    @PostMapping("/fgadmin/orders/submit")
    public JSONObject submit(@RequestBody JSONObject order,HttpServletResponse response,HttpServletRequest request){
        response.setContentType("application/json;charset=UTF-8");
        JSONObject result=new JSONObject();
        Cookie[] cookies=request.getCookies();
        if(Objects.isNull(cookies)){
            result.put("message","请先登录");
        }else{
            for(Cookie cookie:cookies){
                if(cookie.getName().equals("login")&&cookie.getValue().equals("true")){
                    result.put("message","success");
                    result.put("id","76364163");
                }
            }
        }
        return result;
    }

    @ApiOperation("添加收货地址")
    @PostMapping("/fgadmin/address/new")
    public JSONObject newAddress(@RequestBody JSONObject address,HttpServletRequest request,HttpServletResponse response){
        response.setContentType("application/json;charset=UTF-8");
        JSONObject result=new JSONObject();
        Cookie[] cookies=request.getCookies();
        if (Objects.isNull(cookies)) {
            result.put("message","请先登录");
        }else{
            for(Cookie cookie:cookies){
                if(cookie.getName().equals("login")&&cookie.getValue().equals("true")){
                    result.put("message","success");
                    result.put("code","200");
                }
            }
        }
        return result;
    }

    @ApiOperation("删除收货地址")
    @PostMapping("/fgadmin/address/delete")
    public JSONObject deleteAddress(@RequestBody JSONObject id,HttpServletRequest request,HttpServletResponse response){
        response.setContentType("application/json;charset=UTF-8");
        Cookie[] cookies=request.getCookies();
        JSONObject result=new JSONObject();
        if(Objects.isNull(cookies)){
            result.put("message","请先登录");
        }else{
            for(Cookie cookie:cookies){
                if(cookie.getName().equals("login")&&cookie.getValue().equals("true")){
                    result.put("message","success");
                    result.put("code","200");
                }
            }
        }

        return result;
    }


}
