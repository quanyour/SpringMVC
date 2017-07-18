# SpringMVCProject
java后端技术练习，知识点总结，问题总结
## 更新说明
2017/7/15-17.23，HelloWorld版本的SpringMVC<br>
2017/7/18-18.26，SpringMvc的注解简单应用<br>

## 特别说明


## 问题解决
1.The import javax.servlet.http.HttpServletRequest cannot be resolved异常<br>
解决：缺少TOMCAT_HOME\lib下的servlet-api.jar，Project -> Properties -> Java Build Path -> Add Library -> Server Runtime -> next -> 选择你的Server -> Finish<br>
