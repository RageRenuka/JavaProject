<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="java.sql.*"%>
<style>
.hidden{
display: none;
}
</style> 
<script type=text/javascript>
function showhide()
{
	var cb = document.getElementById("chk");
	var hi = document.getElementByClassName("hidden");
	for(var i=0;i!=hiddeninputs.length;i++)
		{
		if(ch.checked)
		{
			hi[i].style.display="inline";
		}
		else
			{
			hi[i].style.display="none";
			}
		}
	}
</script>