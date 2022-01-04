package com.atguigu.spring5.dao;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

import com.atguigu.spring5.testdemo.testbean2;

public class JDKProxy {
    public static void main(String[] args) {
        Class[] interfaces={UserDao.class};
        UserDaoImpl userDaoImpl= new UserDaoImpl();
        //UserDao userdao = (UserDao) Proxy.newProxyInstance(JDKProxy.class.getClassLoader(), interfaces, new UserDaoProxy(userDaoImpl) );
        //等同于以下一段
        UserDao userdao = (UserDao) Proxy.newProxyInstance(JDKProxy.class.getClassLoader(), interfaces, new InvocationHandler() {
            public Object obj=userDaoImpl;
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("方法前执行......"+method.getName()+"：传递的参数..."+ Arrays.toString(args));
                Object res = method.invoke(obj,args);

                System.out.println("方法之后执行"+obj);
                return res;
            }
        });
        //到此为止
        int resoult=userdao.add(1,2);
        String s = userdao.update("000");
        System.out.println("resoult:"+resoult);
        System.out.println("update:"+s);

    }
}
class UserDaoProxy implements InvocationHandler{
    public Object obj;
    public UserDaoProxy(Object obj){
        this.obj=obj;
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("方法前执行......"+method.getName()+"：传递的参数..."+ Arrays.toString(args));
        Object res = method.invoke(obj,args);

        System.out.println("方法之后执行"+obj);
        return res;
    }
}

































