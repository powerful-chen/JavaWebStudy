package com.chen.diy;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * @ClassName AnnotationPointCut
 * @Description TODO
 * @Author xiaochen
 * @Date 2020/10/18 16:51
 */
@Aspect
public class AnnotationPointCut {

    @Before("execution(* com.chen.service.UserServiceImpl.*(..))")
    public void before(){
        System.out.println("==========方法执行前=========");
    }

    @After("execution(* com.chen.service.UserServiceImpl.*(..))")
    public void after(){
        System.out.println("==========方法执行后=========");
    }

    @Around("execution(* com.chen.service.UserServiceImpl.*(..))")
    public void around(ProceedingJoinPoint jp) throws Throwable {
        System.out.println("环绕前");
        Object proceed = jp.proceed();//执行方法
        System.out.println("环绕后");

        Signature signature = jp.getSignature();//获得签名
        System.out.println(signature);
        System.out.println(proceed);
    }
}
