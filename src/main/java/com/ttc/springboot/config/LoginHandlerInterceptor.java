/*
package com.ttc.springboot.config;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

*/
/**
 * @Sagrtc
 * @date 2021/12/10 - 17:46
 *//*


public class LoginHandlerInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        //登录成功后，有用户的session
              Object loginUser=request.getSession().getAttribute("loginUser");
   if (loginUser==null){//没有session
       request.setAttribute("msg","没有权限，请先登录");
       request.getRequestDispatcher("/index.html").forward(request,response);
       return false;
   }else {
       return true;
   }

    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
*/
