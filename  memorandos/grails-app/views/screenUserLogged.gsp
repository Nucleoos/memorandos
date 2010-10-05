<!--
  To change this template, choose Tools | Templates
  and open the template in the editor.
-->

<%@ page contentType="text/html;charset=UTF-8" %>

<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta name="layout" content="main" />
    <title>Sample title</title>
  </head>
  <body>
        <g:ifAnyGranted role="ROLE_ADMIN">
            <div class="nav">
		<span class="menuButton"><g:link class="list" controller="user" action="create">User</g:link></span>
                <span class="menuButton"><g:link class="list" controller="role" action="index">Role</g:link></span>
                <span class="menuButton"><g:link class="list" controller="logout" action="index">Logout</g:link></span>


	</div>
        </g:ifAnyGranted>

        <g:ifAnyGranted role="ROLE_USER">
            <div class="nav">
		 <span class="menuButton"><g:link class="list" controller="logout" action="index">Logout</g:link></span>

            </div>
          <h2>
             Usuário simples ainda não tem permissões
          </h2>
        </g:ifAnyGranted>
  </body>
</html>
