<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
   
<head>
	<title>Login : Vehicle Information Hub</title>
	<meta http-equiv="content-type" content="text/html; charset=iso-8859-1" />
        <link rel="stylesheet" type="text/css" href="assets/css/all.css" />
	
</head>
<body>
    <jsp:useBean id="layoutBean" scope="application" type="javaBeans.Layout" />
    <div id="main">
            <div id="header"></div>
            <div id="middle">
                    <div id="left-column"></div>
                    <div id="center-column">
                        <div class="top-bar"></div><br />
                        <div style="position: absolute; left: 25%; top: 50%; bottom: 40%">
                            <div style="position: relative; left: 40%; top: 40%; bottom: 40%; border: dotted red 1px;">
                                <jsp:getProperty name="layoutBean" property="output" />
                            </div>
                        </div>
                        <div style="position:absolute;  left: 27%;  top: 40%;  margin-left: -27px;  margin-top: -40px;">
                            
                        </div>
                        
                    </div>
                    <div id="right-column">
                            <strong class="h">INFO</strong>
                            <div class="box">Lorem ipsum lorem ipsum</div>
                    </div>
            </div>
            <div id="footer"></div>
    </div>


</body>
</html>
