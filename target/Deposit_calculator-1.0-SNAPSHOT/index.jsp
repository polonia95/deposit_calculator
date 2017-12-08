<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Deposit</title>
    </head>
    <body>
        <h1>Депозитный калькулятор</h1>
        
        <form action="MainServlet" method="POST">
            <table border="0" cellpadding="4" cellspacing="0" width="auto">
		<tbody><tr align="left">
			<td valign="top">Сумма вклада</td>
			<td><input type="text" required name="dep_sum" value="" maxlength="12" size="12"></td>
		</tr>
		<tr align="left">
			<td valign="top">Годовая ставка</td>
			<td><input type="text" required name="dep_rate" value="" maxlength="4" size="12"> %</td>
		</tr>
		<tr align="left">
			<td valign="top">Срок вклада  (кол-во месяцев)</td>
			<td>
				<input type="text" required name="dep_term" value="" maxlength="3" size="12">
			</td>
		</tr>
		
	</tbody></table>
            <input type="submit" value="Отправить">
        </form>
    </body>

</html>
