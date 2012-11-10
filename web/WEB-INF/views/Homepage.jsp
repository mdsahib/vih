<%-- 
    Document   : Homepage
    Created on : Nov 10, 2012, 9:05:06 PM
    Author     : Home
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" %>
<jsp:useBean id="vb" scope="application" class="javaBeans.VerificationBean" />

<center>
<form method="POST">
    <table class="listing form" cellpadding="0" cellspacing="0">
        <thead>
            <tr>
                <td class="first" width="100" align="left"><B>Verify</B></td>
                <td class="first" width="100" align="left"><B>Input</B></td>
                <td class="first" width="100" align="left"><B>Status</B></td>
            </tr>
        </thead>
        <tbody>
            <tr>
                <td class="first" width="100" align="left">Registration Number</td>
                <td class="first" width="100" align="left"><input type="text" name="registration_id" value="" /></td>
                <td class="first" width="100" align="left"><jsp:getProperty name="vb" property="registration" /></td>
            </tr>
            <tr>
                <td class="first" width="100" align="left">Driving License ID</td>
                <td class="first" width="100" align="left"><input type="text" name="driving_id" value="" /></td>
                <td class="first" width="100" align="left"><jsp:getProperty name="vb" property="driving" /></td>
            </tr>
            <tr>
                <td class="first" width="100" align="left">Fitness Number</td>
                <td class="first" width="100" align="left"><input type="text" name="fitness_id" value="" /></td>
                <td class="first" width="100" align="left"><jsp:getProperty name="vb" property="fitness" /></td>
            </tr>
            <tr>
                <td class="first" width="100" align="left">Road Permit ID</td>
                <td class="first" width="100" align="left"><input type="text" name="permit_id" value="" /></td>
                <td class="first" width="100" align="left"><jsp:getProperty name="vb" property="roadPermit" /></td>
            </tr>
            <tr>
                <td></td>
                <td class="first" width="100" align="left"><input type="submit" value="Verify" /></td>
                <td></td>
            </tr>
        </tbody>
    </table>
</form>
</center>
