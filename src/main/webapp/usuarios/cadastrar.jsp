<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cadastrar</title>
    </head>
    <body bgcolor="#CCCCCC">
        <div align="center">
            <center>
                <table border="0" cellpadding="10" cellspacing="0" style="border-collapse: collapse" bordercolor="#111111" width="780" id="AutoNumber1" bgcolor="#FFFFFF">
                    <tr>
                        <td width="100%" bgcolor="#808080"><font size="4" color="#FFFFFF"><b>VenturaHR</b></font></td>
                    </tr>
                    <tr>
                        <td width="100%">
                            <table border="1" cellpadding="5" cellspacing="0" style="border-collapse: collapse" bordercolor="#111111" width="100%" id="AutoNumber2">
                                <tr>
                                    <td valign="top">
                                        <p align="center"><font size="2"><b>Criação de Conta - Cadastramento de Usuário</b></font></p>
                                        <p align="center"><font size="2" color="red "><b>${erro}</b></font></p>
                                        <form action="cadastrar" method="post">
                                        <div align="center">
                                            <center>
                                                <table border="1" cellpadding="5" cellspacing="0" style="border-collapse: collapse" bordercolor="#111111" id="AutoNumber3">
                                                    <tr>
                                                        <td align="left"><font size="2">Nome:</font></td>
                                                        <td><input type="text" name="nome" size="50"></td>
                                                    </tr>
                                                    <tr>
                                                        <td align="left"><font size="2">Endereço:</font></td>
                                                        <td><input type="text" name="endereco" size="50"></td>
                                                    </tr>
                                                    <tr>
                                                        <td align="left"><font size="2">Telefone:</font></td>
                                                        <td><input type="text" name="telefone" size="30"></td>
                                                    </tr>
                                                    <tr>
                                                        <td align="left"><font size="2">Email:</font></td>
                                                        <td><input type="text" name="email" size="30"></td>
                                                    </tr>
                                                    <tr>
                                                        <td align="left"><font size="2">Senha:</font></td>
                                                        <td><input type="password" name="senha1" size="20"></td>
                                                    </tr>
                                                    <tr>
                                                        <td align="left"><font size="2">Confirma Senha:</font></td>
                                                        <td><input type="password" name="senha2" size="20"></td>
                                                    </tr>
                                                    <tr>
                                                        <td align="left"><font size="2">Tipo de Conta:</font></td>
                                                        <td>
                                                            <input type="radio" name="tipoDeConta" value="Candidato"> Candidato
                                                            <input type="radio" name="tipoDeConta" value="Empresa"> Empresa
                                                            <input type="radio" name="tipoDeConta" value="Administrador"> Administrador
                                                        </td>
                                                    </tr>
                                                    <tr>
                                                        <td align="left"><font size="2">CPF:</font></td>
                                                        <td><input type="text" name="cpf" size="20"></td>
                                                    </tr>
                                                    <tr>
                                                        <td align="left"><font size="2">Razão Social:</font></td>
                                                        <td><input type="text" name="razaoSocial" size="30"></td>
                                                    </tr>
                                                    <tr>
                                                        <td align="left"><font size="2">CNPJ:</font></td>
                                                        <td><input type="text" name="cnpj" size="20"></td>
                                                    </tr>                                                  
                                                    <tr>
                                                        <td colspan="2">
                                                            <p align="center">
                                                            <input type="submit" value="Criar Conta" /></td>
                                                    </tr>
                                                </table>
                                            </center>
                                        </div>
                                        </form>
                                    </td>
                                </tr>
                            </table>
                        </td>
                    </tr>
                    <tr>
                        <td width="100%" bgcolor="#808080"><font size="4" color="#FFFFFF"><b></b></font></td>
                    </tr>
                </table>
            </center>
        </div>

    </body>
</html>
