
package toba.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse; 



public class LogRequestFilter implements Filter {

    private FilterConfig filterConfig = null;
    @Override
    public void init(FilterConfig filterConfig) {
        this.filterConfig = filterConfig;
    }
    @Override
    public void doFilter(
            ServletRequest request,
            ServletResponse response,
            FilterChain chain) throws IOException, ServletException {
        
    HttpServletRequest httpRequest = (HttpServletRequest) request;

    ServletContext sc = filterConfig.getServletContext();
    
    String logString = filterConfig.getFilterName() + " | ";
    logString += "Servlet path: " + httpRequest.getServletPath() + " | ";
    
    chain.doFilter(httpRequest, response);
    
    }
    @Override
    public void destroy() {
        filterConfig = null;
    }
    }
    
/*@Override
      public void doFilter(
            ServletRequest request,
            ServletResponse response,
            FilterChain chain) throws IOException, ServletException {
        
    HttpServletRequest httpRequest = (HttpServletRequest) request;
    HttpServletResponse httpResponse = (HttpServletResponse) response;
    ServletContext sc = filterConfig.getServletContext();
    
    String filterName = filterConfig.getFilterName() ;
    String servletPath = "Servlet path: " + httpRequest.getServletPath();
    
    sc.log(filterName + " | " + servletPath + " |  + before request");
        
    chain.doFilter(httpRequest, response);

    sc.log(filterName + " | " + servletPath + " |  + after request");

    }
    @Override
    public void destroy() {
        filterConfig = null;
    }
    }*/
    

