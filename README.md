# SpringMVCProject
java spring+MyBatis

## 问题解决
1.The import javax.servlet.http.HttpServletRequest cannot be resolved异常<br>
解决：缺少TOMCAT_HOME\lib下的servlet-api.jar，Project -> Properties -> Java Build Path -> Add Library -> Server Runtime -> next -> 选择你的Server -> Finish<br>
