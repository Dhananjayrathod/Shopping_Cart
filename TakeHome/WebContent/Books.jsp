<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Take Home </title>
<style type="text/css">

body 
	{
	/* background-image: url(img/back3.jpg); */ 
	
	background-color: threedlightshadow;
	
	}
p.tagline 
		{ 
			text-align:center; 
			text-decoration: blink; 
			text-shadow: 7px 7px 7px black;
 			color: red; 
 			font-family:Georgia; 
 			font-size: medium;
 		    font-style: oblique;
 		    font-weight: bold;	   
 		    
 		 }
 		
img
    {
       	margin: 15px; 
       	border:4px groove black;  
       	border-width: 2px ; 
    }
    
    
table
     {
      border-spacing: 20px;
   // background-color: #eee;
   
     }


div.header{ font-size: 58px; 
		   font-style: italic; 
		   font-variant: normal; 
		   /* text-shadow: 10px 10px 10px black; */
		   font-weight: bolder; 
		   font-family: Georgia;
		   color: orangered;
		   }
input
	{
	  color: red;
	  background-color: somkewhite;
	  padding: 2px;
	  font-weight: bold;
	  font-family: Goergia;
	  


}

.header div span
		{
			color:#5379fa ;
		}
		
 a.hovertext { position: relative; width: 300px; text-decoration: none !important; text-align: center; }
 a.hovertext:after { content: attr(title); position: absolute; left: 0; bottom: 0; padding: 0.5em 20px; width: 260px; background: grey; text-decoration: none !important; color:red; opacity: 0; -webkit-transition: 0.5s; -moz-transition: 0.5s; -o-transition: 0.5s; -ms-transition: 0.5s; font-family: Georgia; font-style: italic; font-weight: bold;} 
 a.hovertext:hover:after, a.hovertext:focus:after { opacity: 1.0; }

img.image {
			position: absolute;
			top: -9px;
			right: -13px;
			border-color: transparent	;
                       
           }
           
img.image1 {
			position: absolute;
			top: -9px;
			right: 105px;
			border-color: transparent;
                       
           }
           
button.demo
{
    position: relative;
    left:248px;
    color: red;
    background-color: smokewhite;
    width: 135px;
	

}


p.demo1
{
   			position: absolute;
			top: 72px;
			right: 6px;
			border-color: transparent;
			color: blue;
		
}

p.user
{	
		border-color: transparent;
   		color: blue;
   		font-size: 30px;
        position: absolute;
        right: 19px;
        top: 22px;

}


</style>

<script type="text/javascript">
window.onload=init;

function init()
{
	
	document.getElementById('date').innerHTML = Date();
	
	}

</script>
</head>
<body>
<% HttpSession sess=request.getSession(true); %>
<% String username=(String)sess.getAttribute("user"); %>


<p id="date" class="demo1">d </p>
<p class="user">Welcome <%out.println(" "+username); %></p>

<div class="header">
<div> TAKE<span>HOME</span></div>
</div>
<p class="tagline"> Live In Your World, This Is Where You Want To Be </p> <br> <br>

	<a  class="adjust" href="Main.jsp"><button  class="demo" type="button">HOME</button></a>
	<a  class="adjust" href="Electronics.jsp"><button class="demo" type="button">ELECTRONICS</button></a>
	<a  class="adjust" href="Books.jsp"><button class="demo"  type="button">BOOKS</button></a>
	<a  class="adjust" href="Mens.jsp"><button class="demo"  type="button">MENS</button></a>
	<a  class="adjust" href="Womens.jsp"><button class="demo"  type="button">WOMEN</button></a>
	

	<a  class="adjust" href="Signout">
	<img class="image" src="img/logout.png" width=100px  align="right">
	</a>

	<a  class="adjust1" href="Cart.jsp">
	<img class="image1" src="img/cart1.png" width=100px height="46px" align="right">
	</a>

<br><br><br><br>

	<form action="AcademicBooks.jsp"  >
		<table  >
			<tr>
				<td> <img src="img/academicbooks-banner.jpg" width="700px" height="300px" style="margin: 50px; margin-left:230px;"></td>
				<td> <input type="submit" value="ShopNow" name="Academic">
						
		   </tr>
	   </table>
      </form>


	<form action="ChildrenBooks.jsp">
		<table >
			<tr>
				<td> <img src="img/childrens_books.jpg" width="700px" height="300px" style="margin: 50px; margin-left:230px;"></td>
				<td> <input type="submit" value="ShopNow" name="Children">
						
		   </tr>
	   </table>
      </form>

	<form action="LiteratureBooks.jsp">
		<table >
			<tr>
				<td> <img src="img/fiction-and-literature.png" width="700px" height="300px" style="margin: 50px; margin-left:230px;"></td>
			    <td> <input type="submit" value="ShopNow" name="Literature">
		   </tr>
	   </table>
      </form>
      
      <form action="ProfessionalBooks.jsp">
		<table >
			<tr>
				<td> <img src="img/Professional_books.jpg" width="700px" height="300px" style="margin: 50px; margin-left:230px;"></td>
				<td> <input type="submit" value="ShopNow" name="Professional">
						
		   </tr>
	   </table>
      </form>






</body>
</html>