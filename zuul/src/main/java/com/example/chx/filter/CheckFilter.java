package com.example.chx.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;
import org.springframework.cloud.netflix.zuul.util.ZuulRuntimeException;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 功能说明: 权限校验过滤器<br>
 * 系统版本: 2.0 <br>
 * 开发人员: miaozhenqing
 * 开发时间: 2018/3/19<br>
 * <br>
 */
@Component
public class CheckFilter extends ZuulFilter{
    @Override
    public String filterType() {
        return FilterConstants.PRE_TYPE;
    }

    @Override
    public int filterOrder() {
        return 1;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() {
        System.out.println("******************执行过滤器*******************");
        RequestContext ctx = RequestContext.getCurrentContext();
        try {
            HttpServletRequest request = ctx.getRequest();
            HttpServletResponse response = ctx.getResponse();
            response.setCharacterEncoding("utf-8");
            String token = request.getParameter("token");
            if("admin".equals(token)){
                ctx.setSendZuulResponse(true);//为true则执行路由
                ctx.put("token","checked");
            }else {
                ctx.setResponseBody("失败");
                ctx.setSendZuulResponse(false);//为false则不执行路由
            }
        } catch (Exception ex) {
            throw new ZuulRuntimeException(ex);
        }
        return null;
    }
}
