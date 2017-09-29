# SpringMVCProject
java spring+MyBatis

## 问题解决
1.The import javax.servlet.http.HttpServletRequest cannot be resolved异常<br>
解决：缺少TOMCAT_HOME\lib下的servlet-api.jar，Project -> Properties -> Java Build Path -> Add Library -> Server Runtime -> next -> 选择你的Server -> Finish<br>
2.之前请求一直进不去 对应的controller，原因是modelAndView导包导错了
import org.springframework.web.portlet.ModelAndView;（错误）
import org.springframework.web.servlet.ModelAndView;（正确）
