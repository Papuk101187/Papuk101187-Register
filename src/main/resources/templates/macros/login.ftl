
<#macro login path>


    <form action="${path}" method="post">
        <div><label> Имя : <input type="text" name="username"/> </label></div>
        <div><label> Фамилия : <input type="text" name="surname"/> </label></div>
        <div><label> Отчество : <input type="text" name="patronymic"/> </label></div>
        <div><label> Дата : <input type="date" name="date"/> </label></div>
        <div><input type="submit" value="Sign In"/></div>
    </form>





</#macro>

