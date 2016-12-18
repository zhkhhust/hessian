package com.zkh.hessian.client;

import com.caucho.hessian.client.HessianProxyFactory;

import yjmyzz.cnblogs.com.po.User;
import yjmyzz.cnblogs.com.service.FooService;
import yjmyzz.cnblogs.com.service.HelloService;
import yjmyzz.cnblogs.com.service.UserService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception
    {
    	String url = "http://localhost:8080/hessian-web/hessian/service";
        System.out.println(url);
        
        HessianProxyFactory factory = new HessianProxyFactory();
        HelloService helloService = (HelloService) factory.create(HelloService.class, url);
        System.out.println(helloService.helloWorld("jimmy"));
        
        String url2 = "http://localhost:8080/hessian-web/hessian/foo";        
        FooService fooService = (FooService) factory.create(FooService.class, url2);
        System.out.println(fooService.foo("jimmy"));
        
        
        String url3 = "http://localhost:8080/hessian-web/hessian/user";        
        UserService userService = (UserService) factory.create(UserService.class, url3);
        User u = userService.getUser("jimmy");
        System.out.println(u.getPassport());
    }
}
