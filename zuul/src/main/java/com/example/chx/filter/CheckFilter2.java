package com.example.chx.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;
import org.springframework.stereotype.Component;

/**
 * 功能说明: 权限校验过滤器<br>
 * 系统版本: 2.0 <br>
 * 开发人员: miaozhenqing
 * 开发时间: 2018/3/19<br>
 * <br>
 */
@Component
public class CheckFilter2 extends ZuulFilter{
    @Override
    public String filterType() {
        return FilterConstants.PRE_TYPE;
    }

    @Override
    public int filterOrder() {
        return 2;
    }

    @Override
    public boolean shouldFilter() {
        RequestContext ctx = RequestContext.getCurrentContext();
        if("checked".equals(ctx.get("token"))){
//            return true;
        }
        return false;
    }

    @Override
    public Object run() {
        System.out.println("******************222执行过滤器222*******************");
        RequestContext ctx = RequestContext.getCurrentContext();
        ctx.setResponseBody("执行了过滤器2");
        ctx.setSendZuulResponse(true);
        return null;
    }
}
