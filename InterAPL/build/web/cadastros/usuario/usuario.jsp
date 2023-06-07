
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@page contentType="text/html" pageEncoding="iso-8859-1"%>
<jsp:include page="/header.jsp"/>
<jsp:include page="/menu.jsp"/>
        
    <!-- Page Heading -->
    <div class="row">
        <div class="col-12">
            <div class="page-title-box">
                <h4 class="page-title float-left">Usuário</h4>
                <ol class="breadcrumb float-right">
                    <li class="breadcrumb-item">
                        <a href="${pageContext.request.contextPath}/">Home</a>
                    </li>
<!--                    <li class="breadcrumb-item">
                        <a href="${pageContext.request.contextPath}/UsuarioListar">Usuários</a>
                    </li>-->
                    <li class="breadcrumb-item">Usuários</li>
                </ol>
                    <div class="clearfix"></div>
            </div>
        </div>
    </div>
        
        <div class="card shadow mb-4">
            <div class="card-header py-3">
                <h6 class="m-0 font-weight-bold text-primary">Usuários</h6>
            </div>
            <div class="card-body">
                <div class="table-responsive">
                    <table class="table table-striped table-bordered basic-datatable" id="datatable" width="98%" cellspacing="0">
                        <thead>
                            <tr>
                                <th align="left">ID</th>
                                <th align="left">Login</th>
                                <th align="left">Nome</th>
                                <th align="left">Email</th>
                                <th align="right"></th>
                                <th align="right"></th>
                            </tr>
                        </thead>
                        <tbody>
                            <c:forEach var="usuario" items="${usuarios}">
                                <tr>
                                    <td align="left">${usuario.idUsuario}</td>
                                    <td align="left">${usuario.loginUsuario}</td>
                                    <td align="left">${usuario.nomeUsuario}</td>
                                    <td align="left">${usuario.emailUsuario}</td>
                                    <td align="center">
                                        <a href=
                                           "${pageContext.request.contextPath}/UsuarioCarregar?idUsuario=${usuario.idUsuario}">
                                            <button class="btn btn-warning">Alterar</button></a></td>
                                    <td align="center">
                                        <a href=
                                           "${pageContext.request.contextPath}/UsuarioExcluir?idUsuario=${usuario.idUsuario}">
                                            <button class="btn btn-danger">Excluir</button></a></td>
                                </tr>
                            </c:forEach>
                        </tbody>
                    </table>
                </div>
            </div>
        </div>
            <div align="center">
                <a href="${pageContext.request.contextPath}/UsuarioNovo">Novo</a>
                <a href="index.jsp">Voltar à Página Inicial</a>
            </div>

<script>
        $(document).ready(function() {
            console.log('entrei ready');
            $('#datatable').DataTable({
                "oLanguage": {
                    "sProcessing": "Processando...",
                    "sLengthMenu": "Mostrar_MENU_registros",
                    "sZeroRecords": "Nenhum registro encontrado.",
                    "sInfo": "Mostrando de _START_ até _END_ de _TOTAL_ registros",
                    "sInfoEmpty": "Mostrando de 0 até 0 de 0 registros",
                    "sInfoFiltered": "",
                    "sInfoPostFix": "",
                    "sSearch": "Buscar",
                    "sUrl": "",
                    "oPaginate": {
                        "sFirst": "Primeiro",
                        "sPrevious": "Anterior",
                        "sNext": "Seguinte",
                        "sLast": "Último"
                    }
                }
            });
        });
</script>

<%@include file="/footer.jsp"%>