<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
<script type="text/javascript">
function onSubmit(thisForm){
	var num = document.getElementById("num").value;
	if(num.length == 0){
		alert("Please enter a valid Integer greater than 1");
		return false;
	}else {
		if(!(!isNaN(num) && 
		        parseInt(Number(num)) == num)){
			alert("Please enter a valid Integer greater than 1");
			return false;
		} 
		
		if(num <= 1){
			alert("Please enter a Integer greater than 1");
			return false;
		}
	}
	return true;
}
</script> 
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Secret Example</title>
</head>
<body>
 
      <div align="center" style="margin-top: 50px;">
 
        <form action="Secret" onsubmit="return onSubmit(this);">
            Please enter a number:  <input type="text" name="num" id="num" size="20px"> <br><br>
        <input type="submit" value="submit">
        </form>
    </div>
 
</body>
</html>
