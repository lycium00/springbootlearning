package learning.webservice.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;


@Aspect
@Component
public class HttpReuestAspect {
    private Logger logger = LoggerFactory.getLogger(HttpReuestAspect.class);


    @Pointcut("@annotation(learning.webservice.annotation.FunctionLog) " +
            "&& within(learning.webservice.controller..*)")//注解表达式, 根据注解获取切面（切controller）
    public void controllerFunctionLog(){

    }

    //匹配标注有ClassLog的类底下的方法 //class级别
    @Pointcut("@within(learning.webservice.annotation.ClassLog)")//
    public void serviceFunctionLog(){

    }

    @Before("controllerFunctionLog()")
    public void controllerlog(){
        logger.info("functionLog....before");
    }

    @Around("serviceFunctionLog()")
    public void servicelog(ProceedingJoinPoint pjp) throws Throwable{
        logger.info("serviceLog class....around:" + pjp.getSignature().getName());
    }
}
