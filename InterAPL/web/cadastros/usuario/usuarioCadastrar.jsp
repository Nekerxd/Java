<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
                    <li class="breadcrumb-item">
                        <a href="${pageContext.request.contextPath}/UsuarioListar">Usuários</a>
                    </li>
                    <li class="breadcrumb-item active">Cadastro</li>
                </ol>
                    <div class="clearfix"></div>
            </div>
        </div>
    </div>
        
    <div class="card shadow md-4">
        <div class="card-header py-3">
            <h6 class="m-0 font-weight-bold text-primary">Cadastro</h6>
        </div>
        <div class="card-body">
            <form name="cadastrarusuario" action="UsuarioCadastrar" method="POST">
                <div class="form-row">
                    <input type="hidden" class="form-control descricao" id="idusuario" name="idusuario"
                               required value="${usuario.idUsuario}">
                    <div class="form-group col-md-4">
                        <label for="nomeusuario" class="col-form-label">Nome</label>
                        <input type="text" class="form-control descricao" id="nomeusuario" name="nomeusuario"
                               required value="${usuario.nomeUsuario}" style="text-transform: uppercase">
                    </div>
                    <div class="form-group col-md-4">
                        <label for="emailusuario" class="col-form-label">E-mail</label>
                        <input type="email" class="form-control descricao" id="emailusuario" name="emailusuario"
                               required value="${usuario.emailUsuario}">
                    </div>
                    <div class="form-group col-md-3">
                        <label for="loginusuario" class="col-form-label">Login</label>
                        <input type="text" class="form-control descricao" id="loginusuario" name="loginusuario"
                               required value="${usuario.loginUsuario}">
                    </div>
                    <div class="form-group col-md-4">
                        <label for="senhausuario" class="col-form-label">Senha</label>
                        <input type="password" class="form-control descricao" id="senhausuario" name="senhausuario"
                               required value="${usuario.senhaUsuario}">
                    </div>
                </div>
                <div class="form-group">        
                    <button type="submit" class="btn btn-success navbar-btn" id="submit"><i class="fa fa-floppy-o" aria-hidden="true"></i> Salvar </button>
                    <button type="reset" class="btn btn-danger navbar-btn" id="reset"><i class="fa fa-floppy-o" aria-hidden="true"></i> Limpar</button>
                    <button class="btn btn-warning navbar-btn">
                        <a href="${pageContext.request.contextPath}/UsuarioListar" class="btn-warning" style="text-decoration: none">Cancelar</a>
                    </button>   
                </div>
            </form>
        </div>
    </div>

<%@ include file="/footer.jsp"%>