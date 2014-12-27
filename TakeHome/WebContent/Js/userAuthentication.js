/**
 * 
 */


$(document).ready(function() {
	$("form").submit(function() {
    	
		
	    $.ajax({
	             url: 'LoginServlet',
	             type:'POST',
	             data: {reuqestType:"ajaxUserAuthentication"},
	             dataType: "text",
	             error: function(){
	            	 alert("Error!"); 
	             },
	             success: function(results){
	            	
	            	 if(results == "false"){
	            		 
	            		 Login.user.value="";
	            		 Login.password.value="";
	            		 Login.user.focus();
	            		 
	            		 alert("Username and password does not match ");
	            		
	            	 }
	             } 
	           }); 
		});
}); 
