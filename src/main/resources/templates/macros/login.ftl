
<#macro login path>


    <form action="${path}" method="post">
        <div><label> Имя : <input type="text" name="username"/> </label></div>
        <div><label> Фамилия : <input type="text" name="surname"/> </label></div>
        <div><label> Отчество : <input type="text" name="patronymic"/> </label></div>
        <br>
        <div><label><button name="type" value="customer"> Я продавец </button> </label></div>
        <div><label><button name="type" value="seller">Я покупатель </button> </label></div>
    </form>





</#macro>

