# Infnet - PB - Projeto de Bloco Java
Teste de Performance 7 da matéria de Projeto de Bloco

## Apresentação

No Teste de Performance 7, você vai colocar em prática as seguintes habilidades desenvolvidas durante a etapa 7:

Compreender a função da camada controladora em aplicações Web
Compreender o ciclo de vida dos servlets
Recuperar informações das requisições em Servlets
Escrever conteúdo dinâmico em aplicações com Servlets
Você deve dar continuidade ao processo de construção do seu sistema, iniciado no TP5.

Com base no documento que contém os requisitos e a modelagem do sistema, você está pronto para começar a construção da aplicação Web. Comece pelas entidades controladoras do seu sistema, que serão construídas como Servlets. Construa em cada Servlet o máximo que conseguir sobre cada funcionalidade do sistema. Crie a interação com o usuário do sistema no próprio Servlet ou através de formulários HTML, e simule gravações ou consultas ao banco de dados quando necessário. Não se preocupe, nos próximos TPs você vai construir as outras camadas do sistema e essas funções sairão dos seus Servlets.

## Desenvolvimento

Este repositório trata-se do front-end da aplicação VenturaHR.

Este front-end esta sendo desenvolvido em Java Web.

### Teste de Perfomance 7 - TP7

Nesta etapa foi desenvolvida a tela de login com autenticação por meio do formulario j_security_check que se encontra no home.jsp, comparando o login digitado com o que esta salvo no tomcat.users.xml, e liberando o acesso ao usuário de acordo com as permissoes acesso de cada "role".

O sistema possui 3 roles: administrador, candidato e empresa

Foi desenvolvido também a funcionalidade de cadastro que, embora ela esteja desconectada do tomcat.users.xml, ela realiza a inclusão da pessoa cadastrada em um HashMap que se encontra na REST API desenvolvida em Springboot no UsuarioVenturaHrService
