<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Claim page</title>
<style type="text/css">

table, th, td {
  border: none;
  border-collapse: collapse;
   padding: 5px;
}
th, td {
  padding-top: 0px;
  padding-bottom: 30px;
  padding-left: 50px;
  padding-right: 40px;
   text-align: left;
 
}

.head {
color:white;
font-weight:bold;
border:none; 
}
.head:hover{
box-shadow:5px 5px 10px black;
color:white; 
}
body {
  background-image: url('https://img.freepik.com/free-photo/abstract-blur-pastel-beautiful-peach-pink-color-sky-warm-tone-background-design-as-bannerslide-show-others_1258-100366.jpg?w=740&t=st=1681176900~exp=1681177500~hmac=80a17307a137ff1ed9744d3181f6ed1a89ee8ddfc421811ee447ec323d988e7d');
  background-repeat: no-repeat;
  background-attachment: fixed;
  background-size: 100% 100%;
}
.claim {
background-color:black;

height:40px;
width:129px;
cursor:pointer;
text-align:center;
border: thick;
border-radius: 2px;
margin-right: 10px;
font-weight:bold;
font-size: 12px; 
transition: 0.15s;
}
.claim:hover {
	
opacity:0.8; 
}
.detailstxt{

font-size: 20;
color: teal;
text-align: center;

}
.sumitbutton{
font-size: 20px;
color: teal;
font-family: monospace;


}
</style>
</head>
<body>
<center><h1 class="head">HEALTH INSURANCE CLAIM-PAGE</h1></center>

<table>
 <tr><th style="width:30%" ><h3><span class="detailstxt"><u>DETAILS FOR CLAIM</u></span></h3></th></tr>
 
<tr><th><h4>POLICY NUMBER</h4></th><td><input type="text" name="ide" id="ide" placeholder="id number"></td>  
<th><h4>UID</h4></th><td><input type="text" name="ide" id="ide" placeholder="id number"></td> </TR>
<tr><th><h4>NAME AS PER POLICY</h4></th><td><input type="text" name="fullname" id="name" placeholder="FullName"></td></TR>
<tr><th><h4>MOBILE_NO</h4></th><td><input type="text" name="mobileno" id="number" placeholder="Number"></td>
<th><h4>E_MAIL</h4></th><td><input type="text" name="mail" id="mail" placeholder="E mail"></td>
<tr><th><h4>AADHAR</h4></th><td><input type="text" name="aadhar" id="aadhar" placeholder="Address"></td></tr>

<tr><th>CLAIM REASON</th><td >
<select name="claim" id="claim">
  <option value="HEART_DESEASE">HEART_DESEASE</option>
  <option value="ACCIDENT">ACCIDENT</option>
  <option value="METERNITY">METERNITY</option>
  <option value="LUNG_DESEASE">LUNG_DESEASE</option>  
</select></td>

<th>LIST_OF_HOSPITALS</th>
<td >
<select name="claim" id="claim">
  <option value="APOLLO HOSPITAL">APOLLO HOSPITAL HI_TECH CITY</option>
  <option value="YASHODA HOSPITAL">YASHODA HOSPITAL MADAPUR</option>
  <option value="RAINBOW HOSPITAl">RAINBOW HOSPITAL KBHB </option>
  <option value="FERNANDEZ HOSPITAL">FERNANDEZ HOSPITAL BAJARAHILLS</option>  
</select></td></tr>
</table>
<br><BR>
<table align="center">
<tr><td><button class="claim" type="submit" value="sumbit"><Span class ="sumitbutton">CLAIM</span></button></td>
<td><button class="claim" type="submit" value="sumbit"><Span class ="sumitbutton">PRINT</span></button></td></tr>
</table>
</body>
</html>