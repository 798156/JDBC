<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注册页面</title>
</head>
<style>
    * {
        margin: 0;
        padding: 0;
    }
    form {
        display: block;
        height: auto;
        width: 450px;
        margin: 100px auto;
    }
    form table tr {
        height: 40px;
    }
    form table tr td {
        height: 40px;
        width: 280px;
        line-height: 40px;
    }
    form table tr td input {
        height: 32px;
        border: 1px solid #BABABA;
        border-radius: 6px;
    }
    .alignRight {
        text-align: right;
        line-height: 40px;
        font-size: 16px;
        font-family: "Monaco";
        width: 200px;
    }
    .submit {
        display: block;
        height: 40px;
        width: 250px;
        color: white;
        font-weight: bold;
        font-size: 18px;
        background-color: #98ECAC;
        border-radius: 8px;
        margin: 15px auto;
    }
</style>
<body>
<form action="InsertServlet" method="post">
    <table>
        <tr>
            <td class="alignRight">
                NEW-USERNAME:
            </td>
            <td>
                <input type="text" name="username" />
            </td>
        </tr>
        <tr>
            <td class="alignRight">
                NEW-PASSWORD:
            </td>
            <td>
                <input type="password" name="password" />
            </td>
        </tr>
    </table>
    <p style="text-align: center; margin-bottom: 20px;">
        <a href="add-success.jsp" style="font-size: 16px; text-decoration: none; color: #1A5276;">
            <input type="submit" value="注册" class="submit" />
        </a>
    </p>
</form>
</body>
</html>
