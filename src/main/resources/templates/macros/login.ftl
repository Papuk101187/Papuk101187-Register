
<#macro login path>

    <form action="${path}" method="post">
        <div><label> Имя : <input type="text" name="username" required /> </label></div>
        <div><label> Фамилия : <input type="text" name="surname" required /> </label></div>
        <div><label> Отчество : <input type="text" name="patronymic" required /> </label></div><br />
        <div><label><button name="type" value="customer"> Я продавец </button> </label></div>
        <div><label><button name="type" value="seller">Я покупатель </button> </label></div>
    </form>





</#macro>

