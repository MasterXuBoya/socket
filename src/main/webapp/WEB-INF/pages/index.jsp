<!--加上下面这句话就能显示中文了，不加就是各种乱码-->

<%@ page language="java" contentType="text/html;charset=utf-8" %>
<html>
<title>
    注册页面
</title>

<form action="login" method="get">
    <table>
        <tr>
            <td><label>登录名: </label></td>
            <td><input type="text" id="loginname" name="loginname" ></td>
        </tr>
        <tr>
            <td><label>密码: </label></td>
            <td><input type="password" id="password" name="password"></td>
        </tr>
        <tr>
            <td><input id="submit" onclick="login()" type="submit" value="登录"></td>
        </tr>
</table>
</form>


</html>

