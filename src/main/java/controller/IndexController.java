/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: IndexController
 * Author:   wenxue.lei
 * Date:     2018/8/6 12:59
 * Description: 默认页面
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import sun.rmi.runtime.Log;

import java.io.OutputStream;
import java.io.PrintStream;
import java.util.logging.Level;

/**
 * 〈一句话功能简述〉<br> 
 * 〈默认页面〉
 *
 * @author wenxue.lei
 * @create 2018/8/6
 * @since 1.0.0
 */
@Controller
@RequestMapping("/home")
public class IndexController {
    @RequestMapping("/index")
    public String index(){
        System.out.println("Spring-mvc");
        return "index";
    }
}