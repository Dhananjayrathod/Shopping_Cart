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

button.but1
{
	position: relative;
left: -777px;
color: #F00;
width: 708px;
top: 161px;

}

button.but2
{
	position: relative;
left: -777px;
color: #F00;
width: 708px;
top: 161px;

}

button.but3
{
	position: relative;
left: -777px;
color: #F00;
width: 708px;
top: 161px;

}

button.but4
{
	position: relative;
left: -777px;
color: #F00;
width: 708px;
top: 161px;

}
p.demo
{
   			position: absolute;
			top: 44px;
			right: 6px;
			border-color: transparent;
			color: blue;
		
}

p.name
{
			position: absolute;
top: 243px;
right: 423px;
border-color: transparent;
color: #00F;
font-family: initial;
font-size: 40px;
font-weight: initial;
font-variant: small-caps;
}


p.price
{
position: absolute;
top: 387px;
right: 457px;
border-color: transparent;
color: #000;
font-family: initial;
font-size: 20px;
font-weight: initial;
font-variant: small-caps;
}

p.rating
{
position: absolute;
top: 387px;
right: 292px;
border-color: transparent;
color: #F00;
font-family: initial;
font-size: 20px;
font-weight: bolder;
font-variant: small-caps;


}

a.rev
{
position: absolute;
top: 490px;
right: 219px;
border-color: transparent;
color: rgb();
font-family: initial;
font-size: 20px;
font-weight: bolder;
font-variant: small-caps;



}
img.rat
{

position: absolute;
top: 387px;
right: 173px;
border-color: transparent;

}

img.wallet
{

position: absolute;
top: 247px;
right: 862px;
border-color: transparent;

}

input.sub
{
position: absolute;
top: 563px;
right: 444px;
color: #00F;
width: 160px;

}


table.info
{
border-spacing: 20px;
position: relative;
top: 348px;
left: 53px;
border: #F0F8FF;
border-width: 53px;


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

<p id="date" class="demo">d </p>
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

		<img class="wallet" src="img/w3.jpeg" width="200px" height="300px" >
		<p class="name"> Diesel Wallet</p>
		<p class="price">Price Rs:900</p>
		<p class="rating">Rating</p>
		<img class="rat"alt="" src="img/rating.jpg"   width=85px height="35px">
		<a  class="rev" href="review.html">Write Review</a>
		
	      
      <form action="cart.jsp">
		<table >
			<tr>
				<td> <input class="sub"  type="submit" value="AddToCart" name="sony"></td>
						
		   </tr>
	   </table>
      </form>

	<table class="info">
	<tr>
	<th>GENERAL FEATURES</th>
	
	</tr>
	
	<tr>
	<td>Wallet</td>
	<td>Diesel Wallet </td>
	</tr>
	
	
	<tr>
	<td>Color</td>
	<td>Black</td>
	</tr>
	
	<tr>
	<td>SIM Size</td>
	<td>Micro SIM</td>
	</tr>
	
	<tr>
	<td>Touch Screen</td>
	<td>Yes, Capacitive</td>
	</tr>
	
	<tr>
	<td>Music Player</td>
	<td>Yes, Support MP3</td>
	</tr>
	
	
	</table>




</body>
</html>