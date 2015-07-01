<html>
<body>  
<h2>Add Book</h2>  
<form name= "form1" method="post" action="<%=request.getContextPath() %>/book.do?method=add">  
bookname:<input type="text" name="name" id="name">  
author:<input type="text" name="author" id="author">  
<input type="submit" value="Add">  
</form>  
<br></br>
<form name="fomr2"  method="post" action="<%=request.getContextPath() %>/book.do?method=update">  
bookname:<input type="text" name="name" id="name">  
author:<input type="text" name="author" id="author">  
<input type="submit" value="Update">  
</form>  
</body> 
</html>
