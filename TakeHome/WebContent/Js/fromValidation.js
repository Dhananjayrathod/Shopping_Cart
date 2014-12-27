/**
 SignUp From validation for user registration. 
 */


/* Function for allowing to enter only alphabet*/
       
function allowAlphabet()
{
	if (!SignUp.name.value.match(/^[a-zA-Z]+$/) && SignUp.name.value !="")
	{
		SignUp.name.value="";
		SignUp.name.focus();
		alert("Please Enter only names in text");
	}
}

/* Function for allowing to enter only number*/

function allowNumeric()
{
	if (!SignUp.mobilenumber.value.match(/^[0-9]+$/) && SignUp.mobilenumber.value !="")
	{
		SignUp.mobilenumber.value="";
		SignUp.mobilenumber.focus();
		alert("Please Enter only numbers in text");
	}
}


function validateForm()
{
	var fname = document.forms["SignUp"]["name"].value.trim();
	var address = document.forms["SignUp"]["address"].value.trim();
	var mnumber=document.forms["SignUp"]["mobilenumber"].value.trim();
	var uname = document.forms["SignUp"]["username"].value.trim();
	var pwd=document.forms["SignUp"]["password"].value.trim();
	
	if(fname==null || fname=="")
	{
		alert("First name must be filled out");
		return false;
		
	}
	
	else if(address==null || address=="")
	{
		alert("Address must be filled out");
		return false;
		
	}
	else if(mnumber==null || mnumber=="")
	{
		alert("Mobile number must be filled out");
		return false;
		
	}
	else if(uname==null || uname=="")
	{
		alert("User name must be filled out");
		return false;
		
	}
	else if(pwd==null || pwd=="")
	{
		alert("Password must be filled out");
		return false;
		
	}
	

}


$(document).ready(function() {
	$('#username').blur(function() {
    	
		var username = $("#username").val();
		
		if(username != null || username!= ""){
	    $.ajax({
	             url: 'SignUpServlet',
	             type:'POST',
	             data: {reuqestType:"ajaxUserValidation", userName: username},
	             dataType: "text",
	             error: function(){
	            	  alert("Error!"); 
	             },
	             success: function(results){
	            	
	            	 if(results == "true"){
	            		
	            		 SignUp.username.value="";
	            		 SignUp.username.focus();
	            		 
	            		 alert("User name is unavailable!");
	            		
	            	 }
	             } 
	           }); 
		}
    });
}); 
