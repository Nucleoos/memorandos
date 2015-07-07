# Introduction #

Aqui serão apontados os casos de testes para validação do sistema.


# Details #

## CT01 ##

<h2>Cenário: Login</h2><br><h3>Teste de Campo Obrigatório</h3>

<table><thead><th><b>Pré-condição</b></th><th>Estar na tela de login do sistema </th></thead><tbody>
<tr><td><b>Pós-condição</b></td><td>Mensagem de erro do sistema       </td></tr>
<tr><td><b>Detalhe</b>     </td><td>O ator não informa login e senha e seleciona ok<br>O sistema apresenta mensagem "Os campos de login e senha devem ser informados" na tela de login</td></tr>
<tr><td><b>Massa de entrada e saída</b></td><td> Não se aplica                    </td></tr>
<tr><td><b>Ambiente</b>    </td><td><b>Sispema Operacional</b>: Windows XP,Vista;<br> <b>Browser</b> firefox 3.6.9, iexplore;<br><b>Servidor de aplicação</b>: Apache Tomcat 6.0 </td></tr>
<tr><td><b>Implementação</b></td><td>Manual                            </td></tr>
<tr><td><b>Iteração</b>    </td><td><a href='Iteration.md'>I01</a>    </td></tr>
<tr><td><b>Responsável</b> </td><td> Arnaldo                          </td></tr>
<tr><td><b>Status</b>      </td><td>Feito                             </td></tr></tbody></table>

<hr />

<h3>Login inválido</h3>

<table><thead><th><b>Pré-condição</b></th><th>Estar na tela de login do sistema </th></thead><tbody>
<tr><td><b>Pós-condição</b></td><td>Mensagem de erro do sistema       </td></tr>
<tr><td><b>Detalhe</b>     </td><td>O ator informa login inválido.<br>O sistema apresenta a mensagem "Login ou senha informados não são válidos"</td></tr>
<tr><td><b>Massa de entrada e saída</b></td><td>Uma senha válida                  </td></tr>
<tr><td><b>Ambiente</b>    </td><td><b>Sispema Operacional</b>: Windows XP,Vista;<br> <b>Browser</b> firefox 3.6.9, iexplore;<br><b>Servidor de aplicação</b>: Apache Tomcat 6.0 </td></tr>
<tr><td><b>Implementação</b></td><td>Manual                            </td></tr>
<tr><td><b>Iteração</b>    </td><td><a href='Iteration.md'>I01</a>    </td></tr>
<tr><td><b>Responsável</b> </td><td> Arnaldo                          </td></tr>
<tr><td><b>Status</b>      </td><td>Feito                             </td></tr></tbody></table>

<hr />

<h3>Senha inválida</h3>

<table><thead><th><b>Pré-condição</b></th><th>Estar na tela de login do sistema </th></thead><tbody>
<tr><td><b>Pós-condição</b></td><td>Mensagem de erro do sistema       </td></tr>
<tr><td><b>Detalhe</b>     </td><td>O ator informa senha inválida.<br>O sistema apresenta a mensagem "Login ou senha informados não são válidos"</td></tr>
<tr><td><b>Massa de entrada e saída</b></td><td>Uma senha válida e login inválido<br>Os sistema apresenta a mensagem "Login ou senha informados não são válidos"</td></tr>
<tr><td><b>Ambiente</b>    </td><td><b>Sispema Operacional</b>: Windows XP,Vista;<br> <b>Browser</b> firefox 3.6.9, iexplore;<br><b>Servidor de aplicação</b>: Apache Tomcat 6.0 </td></tr>
<tr><td><b>Implementação</b></td><td>Manual                            </td></tr>
<tr><td><b>Iteração</b>    </td><td><a href='Iteration.md'>I01</a>    </td></tr>
<tr><td><b>Responsável</b> </td><td> Arnaldo                          </td></tr>
<tr><td><b>Status</b>      </td><td>Feito                             </td></tr></tbody></table>

<hr />

<h3>Senha ou Login em branco</h3>

<table><thead><th><b>Pré-condição</b></th><th>Estar na tela de login do sistema </th></thead><tbody>
<tr><td><b>Pós-condição</b></td><td>Mensagem de erro do sistema       </td></tr>
<tr><td><b>Detalhe</b>     </td><td>O ator não informa o login e a senha. Em seguida seleciona ok<br>O sistema apresenta mensagem "Os campos de login e senha devem ser informados" na tela de login</td></tr>
<tr><td><b>Massa de entrada e saída</b></td><td> Não se aplica                    </td></tr>
<tr><td><b>Ambiente</b>    </td><td><b>Sispema Operacional</b>: Windows XP,Vista;<br> <b>Browser</b> firefox 3.6.9, iexplore;<br><b>Servidor de aplicação</b>: Apache Tomcat 6.0 </td></tr>
<tr><td><b>Implementação</b></td><td>Manual                            </td></tr>
<tr><td><b>Iteração</b>    </td><td><a href='Iteration.md'>I01</a>    </td></tr>
<tr><td><b>Responsável</b> </td><td> Arnaldo                          </td></tr>
<tr><td><b>Status</b>      </td><td>Feito                             </td></tr></tbody></table>

<hr />
<hr />

<h3>Senha de confirmação não confere</h3>

<table><thead><th><b>Pré-condição</b></th><th>Estar na tela de alteração de senha </th></thead><tbody>
<tr><td><b>Pós-condição</b></td><td>Mensagem de erro do sistema e volta a tela de confirmação de senha </td></tr>
<tr><td><b>Detalhe</b>     </td><td>O ator informa senha de confirmação diferente da senha digitada anteriormente</td></tr>
<tr><td><b>Massa de entrada e saída</b></td><td> Não se aplica                      </td></tr>
<tr><td><b>Ambiente</b>    </td><td><b>Sispema Operacional</b>: Windows XP,Vista;<br> <b>Browser</b> firefox 3.6.9, iexplore;<br><b>Servidor de aplicação</b>: Apache Tomcat 6.0 </td></tr>
<tr><td><b>Implementação</b></td><td>Manual                              </td></tr>
<tr><td><b>Iteração</b>    </td><td><a href='Iteration.md'>I02</a>      </td></tr>
<tr><td><b>Responsável</b> </td><td> Arnaldo                            </td></tr>
<tr><td><b>Status</b>      </td><td>Feito                               </td></tr></tbody></table>

<hr />

<h3>Informação em branco no campo de senha</h3>

<table><thead><th><b>Pré-condição</b></th><th>Estar na tela de alteração de senha </th></thead><tbody>
<tr><td><b>Pós-condição</b></td><td>Mensagem de erro do sistema e volta a tela de confirmação de senha </td></tr>
<tr><td><b>Detalhe</b>     </td><td>O ator não informa nenhuma senha    </td></tr>
<tr><td><b>Massa de entrada e saída</b></td><td> Não se aplica                      </td></tr>
<tr><td><b>Ambiente</b>    </td><td><b>Sispema Operacional</b>: Windows XP,Vista;<br> <b>Browser</b> firefox 3.6.9, iexplore;<br><b>Servidor de aplicação</b>: Apache Tomcat 6.0 </td></tr>
<tr><td><b>Implementação</b></td><td>Manual                              </td></tr>
<tr><td><b>Iteração</b>    </td><td><a href='Iteration.md'>I02</a>      </td></tr>
<tr><td><b>Responsável</b> </td><td> Arnaldo                            </td></tr>
<tr><td><b>Status</b>      </td><td>Feito                               </td></tr>