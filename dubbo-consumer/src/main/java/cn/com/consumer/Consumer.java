package cn.com.consumer; /**
 * Created by lujingzhong on 2018/3/19.
 */

import cn.com.api.DemoService;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Consumer {
    public static void main(String[] args) {
        //测试常规服务
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("dubbo-consumer.xml");
        context.start();
        System.out.println("consumer start");
        DemoService demoService =(DemoService) context.getBean("permissionService");
        System.out.println("consumer");
        System.out.println(demoService.getPermissions(1L));


    }
}