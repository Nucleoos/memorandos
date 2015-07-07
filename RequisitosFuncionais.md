# Introduction #

## Descrevemos aqui os requisitos funcionais. ##

<b>Esta seção descreve os requisitos funcionais do sistema,  sendo cada um classificado por  prioridade a saber:</b><br> <br>
•<b>Essencial</b>: requisitos sem os quais o sistema não poderá funcionar;<br>
•<b>Importante</b>: requisitos que deverão ter no sistema, mas que o mesmo poderá funcionar sem eles;<br>
•<b>Desejável</b>: requisitos que não compromete o sistema e poderão ser implantados por último.<br>

<hr />
<hr />

<h1>Controle de Acesso</h1>

<h2>Requisitos necessários para acesso do usuário ao sistema</h2>

<table><thead><th><b>RF</b> </th><th><b>Descrição</b> </th><th><b>Resumo</b> </th><th><b>Prioridade</b> </th></thead><tbody>
<tr><td>RF01      </td><td>Solicitação de acesso ao sistema </td><td> O cadastro de usuários será realizado pelo administrador do sistema. Este deverá informar dados pessoais de cada usuário como nome, matrícula na instituição, nível de acesso, setor onde trabalha e e-mail.</td><td> Essencial        </td></tr>
<tr><td>RF02      </td><td>Acesso ao Sistema </td><td>O usuário devidamente cadastrado deverá informar o login(que pode ser a própria matrícula) e senha para acessar o sistema. </td><td> Essencial        </td></tr>
<tr><td>RF03      </td><td>Primeiro Acesso  </td><td>Por questão de segurança, o usuário será notificado para alterar sua senha de acesso ao sistema. </td><td> Essencial        </td></tr>
<tr><td>RF04      </td><td>Vinculação ao Setor </td><td>O usuário será obrigatoriamente vinculado ao setor que trabalha com o intuito de receber todos os documentos destinados a este setor.</td><td>Essencial         </td></tr></tbody></table>

<hr />
<hr />

<h1>Gerenciamento dos Setores da Instituição</h1>
<h2>Requisitos necessários para gerenciamento dos setores da instituição</h2>
<table><thead><th><b>RF</b> </th><th><b>Descrição</b> </th><th><b>Resumo</b> </th><th><b>Prioridade</b> </th></thead><tbody>
<tr><td>RF05      </td><td>Cadastro de Setores </td><td>O administrador do sistema deverá cadastrar os setores de acordo com a identificação de cada um. Siglas, nomes e descrição são dados essenciais para identificação. </td><td>Essencial         </td></tr>
<tr><td>RF06      </td><td>Desativação de Setores </td><td>O administrador quando autorizado poderá desativar o setor sem excluí-lo, pois os documento destinados a este setor deverá ser mantido. Entretando não deverá existir nenhum funcionário alocado neste.</td><td>Essencial         </td></tr>
<tr><td>RF07      </td><td>Exclusão de Setores </td><td>O administrador quando autorizado poderá excluir o setor caso não haja nenhum documento destinado a ele, assim como usuários cadastrados neste.</td><td>Essencial         </td></tr></tbody></table>

<hr />
<hr />

<h1>Gerenciamento de Documentos</h1>
<h2>Requisitos necessários para gerenciamento de documentos</h2>
<table><thead><th>RF08 </th><th>Criação de Documentos </th><th>O usuário deverá informar a identificação (número do protocolo), título, descrição e tipo de documento (memorando individuais e circulares) e em seguida irá anexar um documento como planilha,  texto e slides.  </th><th>Essencial</th></thead><tbody>
<tr><td>RF09 </td><td>Encaminhamento de documentos </td><td> Para qual destino segue o documento.                                                                                                                                                                             </td><td>Essencial</td></tr>
<tr><td>RF10 </td><td>Recebimento de Documentos </td><td>O usuários ao acessar o sistema deverá ser notificado através de e-mail da existência de documentos pendentes.                                                                                                    </td><td>Essencial</td></tr>
<tr><td>RF11 </td><td>Pendências de Recebimento </td><td>O usuário que enviou um documento poderá verificar se este foi lido pelo destinatário ou não.                                                                                                                     </td><td>Essencial</td></tr>
<tr><td>RF12 </td><td>Pesquisa de Documentos </td><td>O usuário poderá pesquisar um documento que lhe foi enviado ou por ele enviado. Deverá possuir uma caixa postal individual com busca.                                                                             </td><td>Essencial</td></tr>
<tr><td>RF13 </td><td>Histórico de Documentos</td><td>O sistema guardará todos os documentos criados. Estes serão sigilosos e acessados por seus responsáveis                                                                                                           </td><td>Essencial</td></tr>